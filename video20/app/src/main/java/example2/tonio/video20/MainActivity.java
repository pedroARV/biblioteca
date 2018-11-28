package example2.tonio.video20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//objetos para comunicarse con la parte grafica
    private TextView tv1;
    private ListView lv1;

    // 2 arrays para colocar los elementos que se mostrararan en el ListView
    // el primero se encarga de mostrar los elementos cuando se inicie el layout
    private String nombre [] = {"Samuel","Valentina","Santiago","Alejandro","Valeria","Benjamin","Gerardo","Carlos","David","Sofia"};
    // debe ser la misma cantidad de elementos en ambos array
    // se encarga de mostrar los elementos que contiene nuestro ListView despues de que sea seleccionado
    private String edades [] = {"18","25","32","17","24","20","27","15","19","23"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//relacion entre xml y java haciendo un castin
        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);
//creamos un array adapter para meter los elementos del vector nombre dentro del listView
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.listview_item_design, nombre);
        lv1.setAdapter(adapter);

        //funcion que permite mostrar un mensaje de acuerdo a la opcion que escojamos (imprimir la edad segun el nombre)
        //el parametro debe ser una *clase anonima (new AdapterView.OnItemClickListener)
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + "es: " + edades[i] + "años");
            }
        });
    }
}
