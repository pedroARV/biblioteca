package example2.tonio.video45;

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

    //metodo para mostrar los actionButton y el OverFlow
    public boolean onCreateOptionsMenu (Menu menu){
        //mostramos el menu con el metodo .inflate y mostramos la ruta de nuestro menu
        getMenuInflater().inflate(R.menu.menuacciones, menu);
        //regresamos el valor booleano
        return true;
    }

    //metodo para agregar las acciones de nuestros botones
    public boolean onOptionsItemSelected (MenuItem item){
        //recuperar los id que le asignamos a nuestros botones y para eso usaremos una variable int
        int id = item.getItemId();

        //estructuras if else segun el boton que halla sido presionado
        if (id == R.id.compartir){
            Toast.makeText(this,"Compartir",Toast.LENGTH_SHORT).show();
            //regresamos el valor booleano
            return true;
        }else if (id == R.id.buscar){
            Toast.makeText(this,"Buscar",Toast.LENGTH_SHORT).show();
            //regresamos el valor booleano
            return true;
        }else if (id == R.id.opcion1){
            Toast.makeText(this,"Opcion1",Toast.LENGTH_SHORT).show();
            //regresamos el valor booleano
            return true;
        }else if (id == R.id.opcion2){
            Toast.makeText(this,"Opcion2",Toast.LENGTH_SHORT).show();
            //regresamos el valor booleano
            return true;
        }
        //retornamos el objeto
        return super.onOptionsItemSelected(item);

    }
}
