package example2.tonio.extra00_1;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;

public class MainActivity extends AppCompatActivity{
    //declaramos el objeto boton
    public TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enlace y castin
        tv = (EditText)findViewById(R.id.txt_codigo);
        // le damos el atributo onClick a este activity para que se ejecute lo que pongamos fuera del onCreate

//validacion de los permisos (mandamos las ventanas emergentes preguntando por los permisos)
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000);
        }
    }



        public class ScannerActivity extends Activity implements ZBarScannerView.ResultHandler {

            private ZBarScannerView mScannerView;
            public TextView tv;

                    @Override
                    public void onCreate(Bundle state) {
                        super.onCreate(state);
                        mScannerView = new ZBarScannerView(this);    // Programmatically initialize the scanner view
                        setContentView(mScannerView);                // Set the scanner view as the content view

                    }

                    @Override
                    public void onResume() {
                        super.onResume();
                        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
                        mScannerView.startCamera();          // Start camera on resume
                    }

                    @Override
                    public void onPause() {
                        super.onPause();
                        mScannerView.stopCamera();           // Stop camera on pause
                        tv = (EditText)findViewById(R.id.txt_codigo);
                    }

                    @Override
                    public void handleResult(Result rawResult) {
                        // Do something with the result here

                        //se manda el resultado mediante un log, pero nosotros no queremos el resultado en un log asi que solo las comentamos
                        //Log.v(TAG, rawResult.getContents()); // Prints scan results
                        //Log.v(TAG, rawResult.getBarcodeFormat().getName()); // Prints the scan format (qrcode, pdf417 etc.)

                        //escaneamos el resultado:
                        final String code = rawResult.getContents();
                        //escaneamos en formato qr o barras, etc:
                        final String format = rawResult.getBarcodeFormat().getName();
                        //concatenamos el codigo y el formato para mostrarlo en el imageView
                        final String fullMessage = "Contents = " + code + ", Format = "+format;

                        //aqui el del video puso in ring tone para avisar qeu se tomo el codigo, pero ami no me interesa eso asi que no lo puse

                        //mandamos a llamar la clase que vamos a crear para poder enviar el codigo a pantalla:


                        mScannerView.stopCamera();


                        showMessageDialog(fullMessage);



                    }

                    public void showMessageDialog(String message){
                        //mandamos un Toast con la variable string massage que almacena la variable string fullMessage
                        tv = findViewById(R.id.txt_codigo);
                        tv.setText(message);
                    }

                }

        }








