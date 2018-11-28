package example2.tonio.video09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//1) declaracion de objetos
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//2) castin de los objetos y comunicacion con la parte grafica
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    //3) metodo para realizar la suma
    public void Sumar(View view){

        // recibe el valor de los componentes, .toString() es para "parsear"
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();


        //parseo paracambiar de String a int
        int num1 =  Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        //String result = suma + "";  forma sencilla pero menos profesional para parsear de int a string
        //String result = String.valueOf(suma);  forma profesional creando un metodo para parsear de int a string
        String result = String.valueOf(suma);

        //mostrar el result en el .xml
        tv1.setText(result);

    }
}
