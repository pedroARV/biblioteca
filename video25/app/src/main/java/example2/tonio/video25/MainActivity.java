package example2.tonio.video25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_web);
    }

    public void Navegar (View view){

        if (et1.length()==0){
            Toast.makeText(this,"favor de ingresar un sitio web",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, ActivityWeb.class);
            i.putExtra("url", et1.getText().toString());
            startActivity(i);
        }
    }
}
