package example2.tonio.video24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaracion de objetos
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//relacion con castin
        et1 = (EditText) findViewById(R.id.ETxt);
    }

    //metodo del boton siguiente (pasar del 1er activity al 2do activity)
    public void Enviar(View view) {
        //validacion de campos (si no hay nada en los campos, se manda un toast)
        if (et1.length() == 0){
            Toast.makeText(this, "debe ingresar un nombre", Toast.LENGTH_LONG).show();
        }else {
            Intent siguiente = new Intent(this, SegundoActivity.class);
            //pasar los valores del campo a otro activity
            //comando: IntentVariable.putExtra("debe ser string, sirve para identificarlos desde el otro activity", EditTVariable.getText().toString)
            siguiente.putExtra("dato", et1.getText().toString());
            startActivity(siguiente);

        }

    }
}