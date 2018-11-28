package example2.tonio.video39;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //estos 2 objetos y la clase int se usaran para el SoundPlay
    Button play;
    SoundPool sp;
    int sonido_de_reproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion entre la parte logica y la parte grafica del objeto button (tambien le hacemos uncastin)
        play = (Button)findViewById(R.id.btn_SP);

        //le asignamos 3 parametros al ojeto SoundPool, en este caso llamado sp
        //parametros: el numero de reproducciones simultaneas/ tipo de String de Audio, normalmente se utiliza un STREAM_MUSIC/ calidad de reproduccion (ya no se utiliza pero android studio lo pide igualmente
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);

        //cargaremos la pista de audio dentro del objeto SoundPool
        //variable de tipo int previamente creada/ objeto SoundPool/.load carga, dentro de .load pondremos 3 parametros
        //parametros: contexto / ruta donde esta la pista / corresponde a la prioridad (actualmente no se utiliza pero android lo exije)
        sonido_de_reproduccion = sp.load(this, R.raw.tone_short, 1);
    }
    //metodo para el boton que activara el SoundPool
    public void AudioSoundPool (View view){
        //reproducimos la pista de sonido que ya esta cargada dentro del objeto SoundPool
        //ponemos el objeto SoundPool que creamos / .play nos permite reproducir la pista que se cargo previamente/ parametros:
        //parametros: identificador donde se encuentra la pista de audio / volumen para el canal izquierdo / y el derecho / la prioridad /
        // el numero de repeticiones donde -1 (siempre se repite) 0 (solo se escucha 1 vez y sin repetirse ) 1 (se reproduce un total de 2 veces)
        // el rate: modificamos la velocidad de reproduccion, si lo queremos dejar normal se deja un 0
        sp.play(sonido_de_reproduccion, 2, 2, 1, 0, 0);
        //con esto terminamos con el reproductor de SoundPool
    }


    //metodo para el boton que ejecuta el MediaPlayer
    public void AudioMediaPlayer (View view){
        //creamos un objeto de la clase MediaPlayer/ es importante que lleve el .create porque le meteremos 2 parametros:
        //parametros: context / ruta donde se encuentra nuestra pistade audio
        MediaPlayer mp = MediaPlayer.create(this, R.raw.rise_long);
        //utilizamos el objeto creado MediaPlayer/.start porque este metodo permite iniciar la reproduccion de la pista
        mp.start();
    }
}
