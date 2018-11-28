package example2.tonio.video40;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //estos botones se declaran porque cambiaremos su apariencia
    Button btn_play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;

    //repetir: nos ayudara a determinar si se debe de repetir una cancion o no /posicion: sera el indice que recorrera el vector MediaPlayer
    int repetir = 2, posicion = 0;
    //creamos un vector de la clase MediaPlayer para almacenar las pistas de audio / en este caso ponemos 4 porque son 4 pistas de audio las que ingresaremos
    MediaPlayer vectormp []  = new MediaPlayer [4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play_pause = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_repetir);
        iv = (ImageView) findViewById(R.id.imageView);

        //pasaremos las canciones o pistas de audio al vector de tipo MediaPlayer
        //[0]pasamos su primera posicion que es 0 / .create es importante / parametros:
        //parametros: context / direccion de las pistas de audio
        vectormp[0] = MediaPlayer.create(this, R.raw.race);
        vectormp[1] = MediaPlayer.create(this, R.raw.sound);
        vectormp[2] = MediaPlayer.create(this, R.raw.tea);
        vectormp[3] = MediaPlayer.create(this, R.raw.rise_long);
    }

    //metodo para el boton play_pause
    public void PlayPause (View view){
        // estructura if else
        //vectorMediaPlayer / posicion del vector / .isPlaying sabra si la pista de audio se esta reproduciendo o no
        if (vectormp[posicion].isPlaying()){
            //.pause pausara la cancion
            vectormp[posicion].pause();
            //cambiamos la apariencia del boton
            //llamamos al objeto del boton / .setBackgroundResource para cambiar el background / ruta de la nueva imagen
            btn_play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this,"Pause", Toast.LENGTH_SHORT).show();

        }else{
            //.start para iniciar la cancion
            vectormp[posicion].start();
            //cambiamos la imagen del boton
            btn_play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this,"Play", Toast.LENGTH_SHORT).show();
        }
    }

    //metodo para el boton stop
    public void Stop (View view){
        //esta condicion checa que se este reproduciendo una cancion de eta forma: la posicion de vector debe de tener un numero(cancion) y no puede ser nulo
        if (vectormp[posicion] != null){
            //detenemos la cancion
            vectormp[posicion].stop();
            //.stop vacia las posiciones del vector dejando todos los valores en nulo (sin ninguna cancion)

            // debemos asignar las pistas de audio(canciones) a las posiciones del vector
            vectormp[0] = MediaPlayer.create(this, R.raw.race);
            vectormp[1] = MediaPlayer.create(this, R.raw.sound);
            vectormp[2] = MediaPlayer.create(this, R.raw.tea);
            vectormp[3] = MediaPlayer.create(this, R.raw.rise_long);

            //indicamos que el indice debe regresar a 0 ya que todos los valores del reproductor deben regresar a donde estaban la primera vez que se ejecuto
            posicion = 0;
            //cambiamos la apariencia del boton PlayPause a como estaba la primera vez, es decir: reproducir
            btn_play_pause.setBackgroundResource(R.drawable.reproducir);
            //cambiamos la portada otra vez a la de la primera cancion
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    //metodo para el boton repetir
    public void Repetir (View view){
        //con esta variable sabremos cuando la cancion se esta repitiendo y cuando no, donde 1 es que si y 2 es que no
        if (repetir == 1){
            //cambiamos el aspecto del boton
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this,"no Repetir",Toast.LENGTH_SHORT).show();
            //.setLooping nos permite repetir o no una cancion / parametros: valor booleano (true, false)
            //asi hacemos que la cancion se deje de repetir
            vectormp[posicion].setLooping(false);
            repetir = 2;
        }else {
            //cambiamos el aspecto del boton
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this,"Repetir",Toast.LENGTH_SHORT).show();
            //.setLooping nos permite repetir o no una cancion / parametros: valor booleano (true, false)
            //asi hacemos que la cancion se empieze a repetir
            vectormp[posicion].setLooping(true);
            //con esta variable sabremos cuando la cancion se esta repitiendo y cuando no
            repetir = 1;
        }

    }

    //metodo para el boton siguiente
    public void Siguiente (View view){
        // la cancion debe ser menor al largo del vector / -1 es para evitar que haya un desbordamiento de memoria
        //osea que si no hay canciones que solo mande un toast y asi evitar un fallo
        if (posicion < vectormp.length -1){
            //verifica que se este reproduciendo
            if (vectormp[posicion].isPlaying()){
                //detenemos la cancion
                vectormp[posicion].stop();

                //indicamos de nuevo las canciones que deben estar dentro del vector, porque el .stop borra esto
                vectormp[0] = MediaPlayer.create(this, R.raw.race);
                vectormp[1] = MediaPlayer.create(this, R.raw.sound);
                vectormp[2] = MediaPlayer.create(this, R.raw.tea);
                vectormp[3] = MediaPlayer.create(this, R.raw.rise_long);
                //incrementamos el valor del indice en 1 para pasar al siguiente
                posicion++;
                //iniciamos la cancion en la que se encuentra el indice ahora
                vectormp[posicion].start();

                if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }

            }else {
                posicion++;
                if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
            }

        }else {
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }


    }

    //metodo para el boton anterior
    public void Anterior (View view){
        //evitamos que regrese mas cuando ya no hay canciones
        if (posicion <= 1){
            //verifica que se este reproduciendo
            if (vectormp[posicion].isPlaying()){
                //detenemos la cancion
                vectormp[posicion].stop();

                //indicamos de nuevo las canciones que deben estar dentro del vector, porque el .stop borra esto
                vectormp[0] = MediaPlayer.create(this, R.raw.race);
                vectormp[1] = MediaPlayer.create(this, R.raw.sound);
                vectormp[2] = MediaPlayer.create(this, R.raw.tea);
                vectormp[3] = MediaPlayer.create(this, R.raw.rise_long);
                //reducimos el valor del indice en 1 para pasar al siguiente
                posicion--;
                //cambiamos la portada
                if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
                //iniciamos la cancion en la que se encuentra el indice ahora
                vectormp[posicion].start();



            }else {
                posicion--;
                if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
            }

        }else {
            Toast.makeText(this, "No hay mas canciones", Toast.LENGTH_SHORT).show();
        }



    }
}
