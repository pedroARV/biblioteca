package example2.tonio.video26;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //objetos
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_mail);

        //como utilizar la clase sharedPreferences
        //se crea un objeto preferences y luego obtiene el valor dentro del preferences ("nombre del archivo de preferencias", Context.MODE_PRIVATE)
        SharedPreferences preferences = getSharedPreferences("dato", Context.MODE_PRIVATE);
        //ojeto.setText//asigna texto//objeto anterior preferences//.getString para obtener el texto dentro de este// "mail" para indicar el valor//como no habra nada la primera vez se deben dejar "" para que sepa que va almacenar texto
        et1.setText(preferences.getString("m", ""));
    }

    public void Guardar (View view){

        if (et1.length()==0){
            Toast.makeText(this,"favor de ingresar un E-mail", Toast.LENGTH_LONG).show();
        }else{

        SharedPreferences preferencias = getSharedPreferences("dato", Context.MODE_PRIVATE);
        //para guardar necesitamos la clase .Editor y creamos un objeto del tipo Editor para editar el preferences
        SharedPreferences.Editor ObjEditor = preferencias.edit();
        // colocamos los valores que vamos a guardar en el preferencs con el .putString//el mismo nombre de de arriba"mail"//guardamos el valor que el usuario introduzco
        ObjEditor.putString("m", et1.getText().toString());
        //confirmamos el almacenamiento del valor dentro del preferences con un .commit
        ObjEditor.commit();
        finish();}
    }
}
