package example2.tonio.video36;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1;
    // esta ves si se declara el boton porque necesitamos que interactue con el imageView
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacion y castin
        iv1 = (ImageView)findViewById(R.id.imageView);
        boton1 = (Button)findViewById(R.id.button);
    }

    //metodo del boton
    public void Ocultar (View view){
        //este metodo nos permite hacer visibles o invisibles los componentes de nuestro activity
        //nombre del objeto que usaremos/.setVisibility /parametros: View.Invisible para hacerlo invisible y Visible para hacerlo visible
        boton1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);

    }
}
