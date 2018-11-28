package example2.tonio.video37;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Seleccion (View view){
        //obtenemos el id de los componentes botones
        switch (view.getId()){
            //cuando se ejecute el id fresas haras esto:
            case R.id.f_fresa:
                Toast.makeText(this, "fresa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_aguacate:
                Toast.makeText(this,"aguacate", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_kiwi:
                Toast.makeText(this,"kiwi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_mandarina:
                Toast.makeText(this,"mandarina", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.f_manzana:
                Toast.makeText(this,"manzana", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_naranja:
                Toast.makeText(this,"naranja", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_papaya:
                Toast.makeText(this,"papaya", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_pera:
                Toast.makeText(this,"pera", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_platano:
                Toast.makeText(this,"platano", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_sandia:
                Toast.makeText(this,"sandia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.f_frambuesa:
                Toast.makeText(this,"frambuesa", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    }
