package example2.tonio.video17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaracion de objetos para recuperar valores dentro de los componentes
    private EditText et1, et2;
    private TextView tv;
    private CheckBox check1, check2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //crear objetos para encontrar por id, los valores de los componentes (castin)
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv = (TextView)findViewById(R.id.txt_resultado);
        check1 = (CheckBox)findViewById(R.id.check_suma);
        check2 = (CheckBox)findViewById(R.id.check_resta);

    }


    //metodo
    public void Calcular(View view) {
//recibir los valores que dio el usuario con variables tipo String
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();
//parseo para convertir el string en int
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        String resultado = "";
        if (check1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            resultado = "la suma es: " + suma + " / ";
        }


        if (check2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            resultado = resultado + "la resta es: " + resta;
        }
        tv.setText(resultado);
    }
}