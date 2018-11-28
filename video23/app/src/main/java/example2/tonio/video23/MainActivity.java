package example2.tonio.video23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo del boton siguiente (pasar del 1er activity al 2do activity)
    public void Siguiente (View view){
        Intent siguiente = new Intent(this,SegundoActivity.class);
        startActivity(siguiente);
    }
}
