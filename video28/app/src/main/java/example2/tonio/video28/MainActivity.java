package example2.tonio.video28;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_bitacora);
//se almacena lo que esta en los ficheros dentro de un vector tipo string
        String archivos [] = fileList();


        //estructura condicional con un metodo booleano: este metodo pasa 2 parametros: el vector que recien creamos y el nombre del fichero
        if (ArchivoExiste(archivos, "bitacora.txt")){
// se pone el try para recibir los datos que se leen con las clases proximas
            try {
                //el objeto InputStreamReader te permite leer un archivo, y el metodo openFileInput para indicar que archivo quieres abrir
                InputStreamReader archivo = new InputStreamReader(openFileInput("bitacora.txt"));
                // con el objeto BufferedReader leemos el archivo abierto con InputStreamReader
                BufferedReader br = new BufferedReader(archivo);
                //leer la primera linea de texto del fihero y la guardara en la variable tipo string
                String linea = br.readLine();
                // aqui se guardara el contenido completo del fichero
                String bitacoraCompleta = "";
//con este ciclo leemos el fichero entero
                while (linea != null){
                    bitacoraCompleta = bitacoraCompleta + linea + "\n";
                    linea = br.readLine();
                }
                //cerramos el lector y el archivo
                br.close();
                archivo.close();
                //mandamos al componente el texto del fichero
                et1.setText(bitacoraCompleta);
            }catch (IOException e){

            }


        }

    }

    private boolean ArchivoExiste (String archivos [], String NombreArchivo){
        //recorremos el vector archivos con un for para moverlo mediante el indice
        for (int i = 0; i< archivos.length; i++)
            //va a recorrer NombreArchivo hasta que encuentre bitacora.txt que es nuestro fichero
            if (NombreArchivo.equals(archivos[i]))
                return true;
        return false;
    }

    public void Guardar (View view){

        //correjimos el error con un try como antes:
        try {
            //objeto OutputStreamWriter para indicar que meteras texto // openFileOutput para abrir el archivo, indicamos que archivo y el modo del activity
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
            //hacemos el metodo para meter lo del componente dentro del fichero
            archivo.write(et1.getText().toString());
            //hacemos un buffer para limpiar el canal por donde pasamos los datos del componente
            archivo.flush();
            archivo.close();

        }catch (IOException e){

        }
        Toast.makeText(this, "Se a guardado su bitacora", Toast.LENGTH_LONG).show();
        finish();
    }
}
