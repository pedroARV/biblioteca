package example2.tonio.video19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaracion de objetos para recuperar valores dentro de los componentes
    private EditText et1, et2;
    private TextView tv;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crear objetos para encontrar por id, los valores de los componentes (castin)
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv = (TextView)findViewById(R.id.txt_resultado);
        spinner1 = (Spinner)findViewById(R.id.spinner);
//se crea un array para darle nombre a las opciones del spinner
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};

        // creamos clase para que el array se pueda comunicar con el spinner del xml
        //clase/tipo de variable/nombre de objeto/nuevo objeto "String"/contexto, item (de deja espacio, el otro si)/ nombre de la variable con el array que vamos a mostrar
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this, R.layout.spinner_item_design, opciones);
        //indicar que pongan lo de la variable "adapter" dentro de la variable "spinner1" para que se muestre con el xml
        spinner1.setAdapter(adapter);
    }

    //metodo
    public void Calcular (View view) {
//recibir los valores que dio el usuario con variables tipo String
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();
//parseo para convertir el string en int
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);


        // se toma la seleccion del usuario con este comando
        //clase seleccion sera igual a lo que spinner1 tenga seleccionado/y se convierte a string
        String seleccion = spinner1.getSelectedItem().toString();

        //estructuras condicionales
        if (seleccion.equals("sumar")){
            int suma = valor1_int + valor2_int;
            //convertir la variable suma int a un string mediante un parseo
            String resultado = String.valueOf(suma);
            tv.setText(resultado);
        }else if (seleccion.equals("restar")){
            int resta = valor1_int - valor2_int;
            //convertir la variable suma int a un string mediante un parseo
            String resultado = String.valueOf(resta);
            tv.setText(resultado);
        } else if (seleccion.equals("multiplicar")){
            int multiplicacion = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicacion);
            tv.setText(resultado);
        }else if (seleccion.equals("dividir")){

            if (valor2_int != 0){
                int division = valor1_int / valor2_int;
                String resultado = String.valueOf(division);
                tv.setText(resultado);
            }else {
                Toast.makeText(this, "el segundo valor no puede ser 0", Toast.LENGTH_LONG).show();
            }

        }

    }
}
