package example2.tonio.video25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = (WebView)findViewById(R.id.WV1);
        // como es texto se usa variable String/ getIntent().getStringExtra("url");
        String URL = getIntent().getStringExtra("url");
        //indicar que navege dentro de la aplicacion y que no se salga: wv1.setWebViewClient(new WebViewClient());
        wv1.setWebViewClient(new WebViewClient());
        //metodo para iniciar la busqueda en el navegador
        wv1.loadUrl("http://" + URL);

    }

    //metodo del boton cerrar
    public void cerrar (View view){
        //finaliza el activity actual y te regresa al activity anterior
        finish();
    }
}
