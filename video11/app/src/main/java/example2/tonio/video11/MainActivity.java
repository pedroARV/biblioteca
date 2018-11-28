package example2.tonio.video11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaracion de los objetos en privado
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//hacer el castin para recibir los valores de los componentes
        et1 = (EditText) findViewById(R.id.txt_matematicas);
        et2 = (EditText) findViewById(R.id.txt_fisica);
        et3 = (EditText) findViewById(R.id.txt_quimica);
        tv1 = (TextView) findViewById(R.id.tv_estatus);
    }

    //crear el metodo que iniciara el evento del boton
    public void estatus(View view) {


        //declarar variables para obtener los valores que el usuario ingrese
        String matematicas_String = et1.getText().toString();
        String fisica_String = et2.getText().toString();
        String quimica_String = et3.getText().toString();


        if (matematicas_String.isEmpty() || fisica_String.isEmpty() || quimica_String.isEmpty()) {
            Toast.makeText(this, "Uno o mas de sus campos estan vacios", Toast.LENGTH_SHORT).show();
            tv1.setText("Estatus del estudiante ");
        } else {
            //parseo de variables para volver los string a int
            int matematicas_int = Integer.parseInt(matematicas_String);
            int fisica_int = Integer.parseInt(fisica_String);
            int quimica_int = Integer.parseInt(quimica_String);


            if (matematicas_int <= 10 && fisica_int <= 10 && quimica_int <= 10) {

                int promedio = (matematicas_int + fisica_int + quimica_int) / 3;


                if (promedio >= 6) {
                    tv1.setText("Estatus aprovado con " + promedio);
                } else if (promedio <= 5) {
                    tv1.setText("Estatus reprovado con " + promedio);

                } else {
                }
            }else {
                Toast.makeText(this, "Una o mas de sus materias es mayor a 10", Toast.LENGTH_SHORT).show();

                int promedio = (matematicas_int + fisica_int + quimica_int) / 3;


                if (promedio >= 6) {
                    tv1.setText("Estatus aprovado con " + promedio);
                } else if (promedio <= 5) {
                    tv1.setText("Estatus reprovado con " + promedio);

                }
            }
        }

    }
}
