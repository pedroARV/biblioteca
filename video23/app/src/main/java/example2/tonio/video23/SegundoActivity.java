package example2.tonio.video23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    //metodo del boton siguiente (pasar del 2do activity al 1er activity)
    public void Atras (View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}
