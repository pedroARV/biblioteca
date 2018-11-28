package com.example.pedro.retrofittry2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;

public class MainActivity extends AppCompatActivity {

    LoginRequest loginRequest=new LoginRequest();

    private EditText et_user, et_pass;
    String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_user=(EditText)findViewById(R.id.txtUser);
        et_pass=(EditText)findViewById(R.id.txtPass);

        //ver si estas logeado
        if(SharedPrefManager.getLoggedStatus(getApplicationContext())) {



            Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
            startActivity(intent);
        }
    }

    public void LoginButton(View v){

        String usuario=et_user.getText().toString();
        String password=et_pass.getText().toString();

        if (!usuario.isEmpty()){
            if (!password.isEmpty()){
                Toast.makeText(this, "Intentando entrar", Toast.LENGTH_SHORT).show();

                loginRequest.setUsuario(usuario);
                loginRequest.setPassword(password);

                getUser();

            }else{
                Toast.makeText(this, "Se necesita un password", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "Se necesita un usuario", Toast.LENGTH_SHORT).show();
        }

    }

    private void getUser(){
        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<LoginResponse> call = apiInterface.getLogin(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.code()==200) {
                        Toast.makeText(MainActivity.this, response.body().idUsuario+", "+response.body().usuario+", "+response.body().perfil, Toast.LENGTH_SHORT).show();
                        // shared preferences

                    SharedPrefManager.setLoggedIn(getApplicationContext(), true);

                    Toast.makeText(MainActivity.this, "se guardo el usuario", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK |FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                }else if (response.code()==204){
                    Toast.makeText(MainActivity.this, "codigo 204: No se encontro el usuario.", Toast.LENGTH_SHORT).show();
                }else if (response.code()==401){
                    Toast.makeText(MainActivity.this, "codigo 401: credenciales incorrectas.. ", Toast.LENGTH_SHORT).show();
                }else if (response.code()==403){
                    Toast.makeText(MainActivity.this, "codigo 403: Usuario Inactivo. ", Toast.LENGTH_SHORT).show();
                }else if (response.code()==500){
                    Toast.makeText(MainActivity.this, "codigo 500: Error interno inesperado.. probablemente la BD esta caida", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "No codificado, error no registrado", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "onFailure", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
