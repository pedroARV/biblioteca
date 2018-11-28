package example2.tonio.extra01_asincrono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void login(View v) {


        final String url = "https://androidtutorials.herokuapp.com/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();

        //mandamos a lamar la interfaz que ocupamos
        apiInterface servicesTuto = retrofit.create(apiInterface.class);

        Call<List<ResponseService>> call = servicesTuto.getUsersPost();

        call.enqueue(new Callback<List<ResponseService>>() {

            //metodo que se activa cuando se ejecuta correctamente
            @Override
            public void onResponse(Call<List<ResponseService>> call, Response<List<ResponseService>> response) {
                //normalmente se pone un: Call<List<ResponseService>> s = response.execute().body();
                //pero en este caso, al ser un array con obetos, usaremos este codigo, ya que la lista esta dentro del .body
                for (ResponseService res : response.body()) {
                    Log.e("Usuario:  ", res.getId() + " " + res.getNickName());
                }
            }

            // metodo que se ejecuta cuando hay un error
            @Override
            public void onFailure(Call<List<ResponseService>> call, Throwable t) {
                Log.e("onFailure", t.toString());
            }
        });
    }
}
