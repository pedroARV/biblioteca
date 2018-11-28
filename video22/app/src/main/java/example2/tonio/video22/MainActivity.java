package example2.tonio.video22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //creamos los objetos
    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos la relacion entre .xml y .java con un castin
        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.txt_password);
    }


    //metodo
    public void registrar (View view){

        //variables tipo string para recuperar los valores que el usuario ingreso en los campos
        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        //validacion de campos (si no hay nada en los campos, se manda un toast)
        // .length permite saber el ancho de una cadena de caracteres
        if (nombre.length() == 0){
            Toast.makeText(this, "debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }

        if (password.length() == 0){
            Toast.makeText(this, "debes ingresar una password", Toast.LENGTH_LONG).show();
        }

        if (nombre.length() != 0 && password.length() != 0){
            Toast.makeText(this, "su registro esta en proceso", Toast.LENGTH_LONG).show();
        }


    }
}
