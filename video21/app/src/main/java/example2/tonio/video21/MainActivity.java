package example2.tonio.video21;

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

    public void MensajeBoton1 (View view){
        Toast.makeText(this, "el boton verde fue presionado",Toast.LENGTH_SHORT).show();
    }
    public void MensajeBoton2 (View view){
        Toast.makeText(this, "el boton gris fue presionado",Toast.LENGTH_SHORT).show();
    }
}
