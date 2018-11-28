package example2.tonio.video46;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.imageView);

        //validacion de los permisos (mandamos las ventanas emergentes preguntando por los permisos)
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000);
        }
    }

    //metodo para crear un nombre unico a cada foto
    //creamos una variable tipo string, el nombre no importa
    String mCurrentPhotoPath;

    private File createImageFile() throws IOException {
        //creamos un nombre de imagen
        //creamos un objeto de la clase SimpleDataFormat quese guardara en una variable de tipo string en la que guardan el año,mes,dia,hora,minuto y segundo en el que se tomo la foto
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        //creamos una variable string donde se guardara el nombre ocmpleto de la imagen, ejemplo: algo_ / variables string anterior que tiene el momento en que fue tomada la foto / y la diagonal es opcional
        String imageFileName = "Backup_" + timeStamp + "_";
        //guardamos el nombre dentro del directorio que creamos en el xml path: .DIRECTORY_PICTURES
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        //creamos un objeto del tipo file: recupera el nombre almacenado en el string imageFileName / indicamos el formato png o jpg /  y la ruta a donde se dirige la imagen
        File image = File.createTempFile(imageFileName, ".jpg", storageDir);
        //guardamos el path creado previamente
         mCurrentPhotoPath = image.getAbsolutePath();
         //retorna el nombre y la ruta donde se almacenara la imagen
        return image;
    }



    //metodo para tomar la foto y crear el archivo
    //evitamos que se modifique esta variable de tipo int
    static final int REQUEST_TAKE_PHOTO = 1;

    public void tomarFoto(View view) {
        //crea un objeto de tipo intent / indicamos que cerrara de manera momentanea el activity principal y abrira un activity donde se mostrara lo que esta viendo la camara
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // verifica si ya se tomo una foto
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            // crea un objeto de tipo File y le asigna un valor de tipo nulo
            File photoFile = null;
            try {
                //recupera el nombre y la ruta de donde se va a guardar la imagen
                photoFile = createImageFile();
                //agarra cualquier error
            } catch (IOException ex) {
                //error al crear el archivo
            }
            // si el objeto tipo File es diferente de nulo es porque se a tomado ninguna fotografia
            if (photoFile != null) {
                //recupera la url (en android son llamadas uri) y ponemos la direccion del paquete de la aplicacion(esto lo provee android automaticamente) / y ponemos otra vez el objeto tipo File porque ahi ya se encuentra la ruta exacta
                Uri photoURI = FileProvider.getUriForFile(this,"com.example.android.fileprovider", photoFile);
                //aqui toma la imagen para crear el archivo
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                //crea el archivo
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);
            }
        }
    }

    //metodo para mostrar una foto dentro del imageView
    //se declara esta variable que se usara para que se quite el error que manda REQUEST_IMAGE_CAPTURE por no estar creada
    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //no esta detallado pero sirve para que cuando ya esta tomada la foto se meta en el imageView
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            //la foto que se tome se mostrara dentro de este imageView
            img.setImageBitmap(imageBitmap);
        }
    }
}


