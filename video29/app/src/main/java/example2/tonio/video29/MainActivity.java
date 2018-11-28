package example2.tonio.video29;

import android.app.Activity;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre, et_contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        et_contenido = (EditText)findViewById(R.id.txt_contenido);
    }

    //metodo para guardar
    public void Guardar (View view){
        String nombre = et_nombre.getText().toString();
        String contenido = et_contenido.getText().toString();


        try {
            //indicamos donde se encuentra la sd
            //creamos un objeto de la clase File, esto te permite guardar de manera temporal la ruta donde esta la sd: File tarjetaSD =
            //para encontrar la ruta se usa: Environment.getExternalStorageDirectory();
            File tarjetaSD = Environment.getExternalStorageDirectory();
            //.getPath recupera lo que esta en el objeto tarjetaSD y lo manda como texto
            Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_LONG).show();
            //los parametros son: la url del archivo.getParh y el nombre del archivo o fichero
            File rutaArchivo = new File(tarjetaSD.getPath(), nombre);

            //abrimos el archivo para poder editarlo, los parametros son: el nombre del fichero y Activity.MODE_PRIVATE
            OutputStreamWriter abrirArchivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));

            //pasar el contenido que queremos que guarde dentro del fichero
            abrirArchivo.write(contenido);
            //limpiamos el buffer
            abrirArchivo.flush();
            //cerramos el fichero
            abrirArchivo.close();

            Toast.makeText(this,"Guardado correctamente", Toast.LENGTH_LONG).show();

            //limpiamos los campos de texto
            et_nombre.setText("");
            et_contenido.setText("");

        }catch (IOException e){
            Toast.makeText(this, "No se pudo guardar", Toast.LENGTH_LONG).show();
        }
    }

    //metodo Consultar
    public void Consultar (View view){
        String nombre = et_nombre.getText().toString();

        //ponemos un try catch para poder modificar el fichero
        try {
            //indicaremos donde esta la ubicacion de la sd
            File tarjetaSD = Environment.getExternalStorageDirectory();
            //buscamos al fichero que esta dentro de la ubicacion de la tarjetaSD
            File rutaArchivo = new File(tarjetaSD.getPath(), nombre);
            //abrimos el archivo
            InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nombre));

            //leemos las lineas de texto para poder guardarla dentro de una clase
            BufferedReader leerArchivo = new BufferedReader(abrirArchivo);
            //leer la primera linea de texto y guardarla en una variable
            String linea = leerArchivo.readLine();
            //creamos una variable que contendra todas las lineas de texto
            String contenidoCompleto = "";

            //ciclo while para leer e imprimir todas las lineas
            while (linea != null){
                //almacena las lineas en una varialbe
                contenidoCompleto = contenidoCompleto + linea + "\n";
                //leemos linea por linea
                linea = leerArchivo.readLine();
            }

            //cerramos la lectura del fichero y cerramos el fichero
            leerArchivo.close();
            abrirArchivo.close();
            et_contenido.setText(contenidoCompleto);

        }catch (IOException e){
            Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_LONG).show();

        }
    }
}
