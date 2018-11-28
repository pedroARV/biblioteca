package example2.tonio.video13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//declaracion de objetos para recuperar valores dentro de los componentes
    private EditText et1, et2;
    private TextView tv;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//crear objetos para encontrar por id, los valores de los componentes (castin)
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);


    }

    //metodo
    public void Calcular (View view) {
//recibir los valores que dio el usuario con variables tipo String
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();
//parseo para convertir el string en int
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);
//radioButonVariable.isChecked    si el radiobutton esta seleccionado
        if (rb1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            //convertir la variable suma int a un string mediante un parseo
            String resultado = String.valueOf(suma);
            tv.setText(resultado);
        }else if (rb2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            //convertir la variable suma int a un string mediante un parseo
            String resultado = String.valueOf(resta);
            tv.setText(resultado);
        }

    }
}
