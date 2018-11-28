package example2.tonio.video27;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre, et_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        et_datos = (EditText)findViewById(R.id.txt_datos);
    }

    //metodo bototn guardar
    public void Guargar (View view){

        String nombre =et_nombre.getText().toString();
        String datos =et_datos.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        // se le pone la variable nombre porque se va a buscar los parametros dentro del valor que asigne el usuario (nombre)
        obj_editor.putString(nombre, datos);
        obj_editor.commit();
        Toast.makeText(this,"El contacto se ha guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    //metodo boton buscar
    public void Buscar (View view){
        String nombre = et_nombre.getText().toString();
        // creamos el objeto preferencias
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        //almacenamos los datos de contacto que el usuario esta buscando /  para mostrar los datos del contacto se dejan 2 comillas despues de el nombre del contacto "nombre"
        String datos = preferencias.getString(nombre, "");
        // con lo de arriba ya recuperamos los valores que el usuario esta buscando

        //creamos una estructura condicional para saber si hay datos guardados
        if (datos.length()==0){
            Toast.makeText(this, "No se encontro ningun registro", Toast.LENGTH_SHORT).show();
        }else{
            et_datos.setText(datos);
        }

    }

}
