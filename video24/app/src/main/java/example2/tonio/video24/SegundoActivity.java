package example2.tonio.video24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    //declaracion de objetos
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        //relacion con castin
        tv1 = (TextView) findViewById(R.id.txtV);

        //alojamos el valor del campo de manera temporal que viene desde el otro activity en una variable tipo String
        //nombre de variable no importa, getIntent para obtener la funcion del primer activity/.get stringExtra obtenemos el nombre o llave que asignamos "dato"
        String dato = getIntent().getStringExtra("dato");
        //colocamos el valor asignado por el usuario en el textView del segundo activity
        tv1.setText("hola " + dato);
    }

    //metodo del boton siguiente (pasar del 2do activity al 1er activity)
    public void Atras(View view) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }
}