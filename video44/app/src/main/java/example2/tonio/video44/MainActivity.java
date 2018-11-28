package example2.tonio.video44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //metodo para ocultar y mostrar el menuOverFlow
    //creamos un objeto de tipo menu para recibir un parametro
    public boolean onCreateOptionsMenu (Menu menu){
        //mostramos el menu
        getMenuInflater().inflate(R.menu.overflow, menu);
        //indicamos al metodo booleano que debe indicar un valor true
        return true;
    }

    //metodo para asignar las funciones a nuestras opciones del menu
    //parametro: recibimos el item que esta seleccionado
    public boolean onOptionsItemSelected (MenuItem item){
        //guardamos en la variable de tipo int el item seleccionado mediante el metodo .getItemId();
        int id = item.getItemId();
        //
        if (id == R.id.item1){
            Toast.makeText(this,"opcion1",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item2){
            Toast.makeText(this,"opcion2",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item3){
            Toast.makeText(this,"opcion3",Toast.LENGTH_SHORT).show();
        }
        //mandamos un return para regresar el valor booleano
        //return para regresar/ super para subirlo a la clase / la clase a la que se subira el valor / el objeto de tipo MenuItem
        return super.onOptionsItemSelected(item);
    }
}
