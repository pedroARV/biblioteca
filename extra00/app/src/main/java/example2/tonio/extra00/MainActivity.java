package example2.tonio.extra00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    EditText codigo;
    Button escaner;
    //declaramos la libreria
    private ZXingScannerView vistaEscaner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codigo = (EditText)findViewById(R.id.edt_codigo);
        escaner = (Button)findViewById(R.id.btn_scanner);

    }

    //metodo
    public void Escaner (View view){
        //creamos un objeto de la clase
        vistaEscaner = new ZXingScannerView(this);
        //ponemos dentro la clase que creamos en el siguiente metodo
        vistaEscaner.setResultHandler(new zxingscanner());
        //seteamos el contenido de la variable
        setContentView(vistaEscaner);
        //iniciamos la camara
        vistaEscaner.startCamera();
    }

    //creamos una clase y le ponemos el nombre que sea
    //para quitar el error se necesita implementar la libreria externa: alt+enter
    class zxingscanner implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(Result result) {
            //
            String dato = result.getText();
            //obtenemos el ocntenido de la vista
            setContentView(R.layout.activity_main);
            //detenemos la camara
            vistaEscaner.stopCamera();
            //enviamos el resultado al componente editText
            codigo.setText(dato);
        }
    }
}
