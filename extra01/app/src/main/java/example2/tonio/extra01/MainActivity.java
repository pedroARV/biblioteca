package example2.tonio.extra01;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ejecutamos el metodo que ponemos mas adelante
        new Peticion().execute();

    }

    //aqui le decimos que va a sobreescribir un metodo
    public static class Peticion extends AsyncTask<Void, Void, Void>{

//el metodo que va a reescribir es el doInBackground
        @Override
        protected Void doInBackground(Void... voids) {
            //colocamos la url del servicio web pero sin el endpoint
            final String  url = "https://androidtutorials.herokuapp.com/";
            //declaramos un objeto Retrofit y le ponemos el metodo .builder///el parametro para el .addConverterFactory
            //sera:
            Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();




            //ahora haremos uso de la interfaz que creamos en la carpeta java / example2.tonio.***
            //creamos un objeto de la clase y llamamos a la interfaz
            servicesTutorial service = retrofit.create(servicesTutorial.class);

            //indicaremos como va a regresar la respuesta/// le decimos que traiga el servicio getUserGet
            Call<List<ResponseService>> response = service.getUsersGet();
            //aqui obtenemos la informacion que esta denrto del body
            //y con esto obtendremos la lista
            //Call<List<ResponseService>> s = response.execute().body();

            //en este caso como es una lista de objetos se puede hacer de la siguiente forma tambien
            try {
                //como solamente es 1 instruccion dentro del for, se puede usar el for sin ninguna lave de apertura ni de cierre
                for (ResponseService user: response.execute().body())
                    //se pone el getName porque esa propiedad esta en nuestro ResponseActivity
                    Log.e("Respuesta:   ",user.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
