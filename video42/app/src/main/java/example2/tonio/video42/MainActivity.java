package example2.tonio.video42;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    //declaramos y asignamos un nombre a los objetos que usaremos
    private MediaRecorder grabacion;
    private Button btn_recorder;
    //creamos una variable para poder asignar un nombre a la pista de audio que crearemos, importante que tenga un valor nulo
    private String archivo_salida = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion entre parte logica y parte grafica y un castin porque el boton cambia de imagen cada vez que lo presionamos (boton didactico)
        btn_recorder=(Button)findViewById(R.id.btn_rec);

        //establecemos los permisos para usar, este codigo no esta detallado porque es muy complejo pero basicamente es:
        //verificar que revise si dentro del archivo manifest estan escritos los permisos para escribir dentro del dispositivo
        //y tambien tienen que estar los permisos para gravar audio
        //esta condicion del if es necesaria ya que sin ella la app no funcionara
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            // basicamente muestra unas ventanas emergentes al iniciar la app
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }


    //metodo para el boton grabar
    public void Recorder (View view){
        //condicion: si el objeto de la clase MediaRecorder tiene valor nulo, significa que no esta grabando nada
        if (grabacion == null){
            //grabamos dentro de un directorio que esta dentro del dispositivo
            //usamos la variable tipo string y alojamos esto dentro de ella / Environment / getExternalStorageDirectory para buscar la direccion del directorio donde pondremos la pista de audio/
            // /.getAbsolutePath para obtener el directorio / + "Grabacion.mp3" se coloca el nombre que le daremos a la pista de audio y su extencion, puede ser .mp3 o 3gp (es importante darle la extencion o nos dara error)
            archivo_salida = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Grabacion.mp3";

            //creamos el objeto de tipo grabacion
            grabacion = new MediaRecorder();
            // usamos el objeto y / el metodo .setAudioSource para obtener el audio / usamos la clase MediaRecorder / el metodo .AudioSource / e indicamos que censor usaremos: MIC para microfono
            grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            //le decimos el formato de salida del audio: objeto mediaRecorder / setOutputFormat para decirle el formato de salida / desde la clase MediaRecorder / .OutputFormat para ya dar el formato / el tipo de formato, (esto no afecta a la extencion que le damos al nombre del audio)
            grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            //encoder de nuestro audio
            grabacion.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
            //le ponemos el nombre a nuestro audio que ya pusimos dentro de la variable string
            grabacion.setOutputFile(archivo_salida);



            //usaremos 2 metodos de la clase MediaRecorder
            //para poder uzarlos necesitaremos un try catch, el catch recibira cualquier error
            try {
                //preparamos el objeto para empezar a grabar
                grabacion.prepare();
                //comenzamos a grabar
                grabacion.start();
            }catch (IOException e){}

            //cambiamos el aspecto del boton
            btn_recorder.setBackgroundResource(R.drawable.rec);
            Toast.makeText(this,"Grabando",Toast.LENGTH_SHORT).show();

            //si el objeto de la clase MediaRecorder no tiene valor nulo (es decir que si esta grabando) entonces..
        }else if (grabacion != null){
            //detenemos la grabacion
            grabacion.stop();
            //ponemos la grabacion en estado finalizado
            grabacion.release();
            //indicamos que el objeto de tipo MediaRecorder en este caso llamado grabacion, le regresamos un valor nulo
            grabacion = null;


            //ya solo falta cambiar la imagen del boton
            btn_recorder.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(this,"Grabacion finalizada", Toast.LENGTH_SHORT).show();

        }


    }

    //metodo para el boton play
    public void Reproducir (View view){
        // creamos un objeto de la clase MediaPlayer
        MediaPlayer mediaPlayer = new MediaPlayer();

        //try catch
        try {
            //usamos el objeto mediaplayer y el metodo .setDAtaSource /parametros: ponemos el archivo que queremos reproducir
            mediaPlayer.setDataSource(archivo_salida);
            //preparamos el audio que amos a reproducir
            mediaPlayer.prepare();
        }catch (IOException e){}
        //reproducimos nuestro objeto MediaPlayer
        // lo ponemos fuera del try catch porque no necesita el try catch para ejecutarse
        mediaPlayer.start();
        Toast.makeText(this,"Reproduciendo audio", Toast.LENGTH_SHORT).show();
    }
}
