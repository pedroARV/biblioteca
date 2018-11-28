package example2.tonio.video30;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_codigo, et_descripcion, et_precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_codigo = (EditText)findViewById(R.id.txt_codigo);
        et_descripcion = (EditText)findViewById(R.id.txt_descripcion);
        et_precio = (EditText)findViewById(R.id.txt_precio);
    }

    //metodo para registrar, video 30
    public void Registrar (View view){
        //creamos un objeto de la clase que creamos y le pasamos los siguientes 4 parametros: context, nombre de la BD que usaremos, null, numero de version de la BD con la que trabajamos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        //abrimos la BD en modo lectura y escritura creando un objeto de la clase SQLiteDataBase/ con .getWritableDatabase podemos abrir la BD en modo lectura y escritura
        //con esto terminamos la conexion con la clase y a la vez abrimos la BD en tipo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        //recibimos los valores que ponga el usuario en los campos
        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();

        //validamos el campo para comprobar que no esten vacios los campos

        // !codigo.isEmpty: si la variable codigo NO esta vacia, codigo.isEmpty: si la variable codigo esta vacia...
        if (!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){
            //vamos a ingresar los valores dentro de la BD
            // creamos un objeto de la clase ContentValues
            ContentValues registro = new ContentValues();
            //colocamos los datos que acabamos de recibir de los valores dentro del objeto ContentValues
            //ponemos el nombre con el que vamos a referenciar el dato que estamos pasando/ notese que es el mismo nombre que en la clase donde creamos la tabla
            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);
            //hasta ahi ingresamos los valores a la BD, ahora toca meter los valores dentro de la tabla
            //colocamos el nombre de la Base de Datos/ .insert para meter los valores/ nombre de la tabla/null/ el objeto de ContentValue, en este caso: registro
            BaseDeDatos.insert("articulos", null, registro);

            //cerramos la base de datos
            BaseDeDatos.close();

            //limpiamos los campos
            et_codigo.setText("");
            et_descripcion.setText("");
            et_precio.setText("");

            //mandamos un Toast para avisar qeu se guardaron los valores
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Favor de llenar todos los campos", Toast.LENGTH_SHORT).show();
            //cerramos la Base de datos
            BaseDeDatos.close();
        }
    }

    //metodo Consultar, video 31
    public void Buscar (View view){
        //creamos un objeto de la clase que creamos y le pasamos los siguientes 4 parametros: context, nombre de la BD que usaremos, null, numero de version de la BD con la que trabajamos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        //abrimos la BD en modo lectura y escritura creando un objeto de la clase SQLiteDataBase/ con .getWritableDatabase podemos abrir la BD en modo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        //recuperamos el valor con el que vamos a buscar nuestros valores
        String codigo = et_codigo.getText().toString();

        //validacion de campo
        if (!codigo.isEmpty()){
            //creamos un objeto de la clase cursor para seleccionar un producto a travez de su codigo
            //objeto cursor es igual/ a mi objeto SQLiteDatabase, que se llama BaseDeDatos/ metodo .rawQuery para aplicar un select/ entre comillas los paramtros:
            //parametros: select(para seleccionar los campos/ nombre de campos/ from: de la tabla/ nombre de tabla/where: donde el campo tal/ nombre del campo tal/ fuera de las comillas concatenamos la variable con la cual estamos buscando/ parametro null)
            Cursor fila = BaseDeDatos.rawQuery
                    ("select descripcion, precio from articulos where codigo =" + codigo, null);

            //estructura condicional para ver si hay datos dentro de la tabla
            //condicion: el objeto de la clase Cursor, en este caso llamado fila/ con el metodo .moveToFirst verificara si los campos de la consulta vienen vacios
            if (fila.moveToFirst()){
                //colocaremos dentro del campo/ con .setText /y el objeto fila/.getString para recibir el valor / y el parametro siempre debe ser 0 cuando seteas el primer texto
                et_descripcion.setText(fila.getString(0));
                //la sintaxis es igual pero el parametro debe seguir en el 1 y asi sucesivamente como si fuera un vector, inicia en 0 y continua normal
                et_precio.setText(fila.getString(1));

                //cerramos la Base de Datos
                BaseDeDatos.close();
            }else {
                //avisamos que el producto no existe
                Toast.makeText(this, "No existe el articulo", Toast.LENGTH_SHORT).show();
                //debemos cerrar la base de datos porque esta abierta desde antes del if y por consiguiente sigue abierta
                BaseDeDatos.close();
            }


        }else{
            Toast.makeText(this, "Favor de ingresar el codigo para iniciar la consulta", Toast.LENGTH_SHORT).show();
        }
    }

    //metodo para bajas o eliminar un producto de la BD, video 32
    public void Eliminar (View view){
        //creamos un objeto de la clase que creamos y le pasamos los siguientes 4 parametros: context, nombre de la BD que usaremos, null, numero de version de la BD con la que trabajamos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper
                (this, "administracion", null, 1);
        //abrimos la BD en modo lectura y escritura creando un objeto de la clase SQLiteDataBase/ con .getWritableDatabase podemos abrir la BD en modo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        //recuperar el valor con el que el usario va a eliminar el resto de campos, en teste caso el codigo par a eliminar la descripcion y el precio y el mismo codigo
        String codigo = et_codigo.getText().toString();

        //validamos el campo
        if (!codigo.isEmpty()){
            //si .delete borra un dato, el valor que va a regresar es 1, por eso se declara un int y no string
            //se usa el objeto BaseDeDatos porque .delete entra a la BD y la reescribe, por eso necesita abrirla en modo lectura y escritura con este objeto
            //el metodo .delete borra un valor de la base de datos en SQLite/ parametros: nombre de la tabla/condicion para buscar el articulo/null
            int cantidad = BaseDeDatos.delete("articulos", "codigo=" + codigo, null);
            //cerramos la BD
            BaseDeDatos.close();

            //if para verificar que se halla eliminado el articulo o que no se encuentra el articulo
            //condicion: la variable cantidad recibe el valor 1 porque se elimino 1 producto
            if (cantidad==1){
                Toast.makeText(this, "Articulo eliminado exitosamente", Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(this, "El articulo no existe", Toast.LENGTH_SHORT).show();
            }
            //limpiamos los campos:
            et_codigo.setText("");
            et_descripcion.setText("");
            et_precio.setText("");

        }else {
            Toast.makeText(this, "Debes introducir el codigo del articulo a eliminar", Toast.LENGTH_SHORT).show();
        }
    }
    //metodo para el boton modificar
    public void Modificar (View view){
        //creamos un objeto de la clase que creamos y le pasamos los siguientes 4 parametros: context, nombre de la BD que usaremos, null, numero de version de la BD con la que trabajamos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        //abrimos la BD en modo lectura y escritura creando un objeto de la clase SQLiteDataBase/ con .getWritableDatabase podemos abrir la BD en modo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        //guardamos lo que el usuario halla modificado
        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio =et_precio.getText().toString();

        //validamos los campo para evitar que el usario deje en blanco los campos con un if
        if (!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){
            //creamos un objeto de la clase ContentValues
            ContentValues registro = new ContentValues();
            //guardamos las modificaciones dentro del objeto ContentValues llamado registro/.put/referencia / variable que contiene el valor a guardar en la referencia
            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            //modificamos los valores dentro de la base de datos
            //se declara una variable int porque el metodo .update regresa el numero de registros que actualizo/ se usa el objeto BaseDeDatos porque se necesita actualizar la tabla y este objeto la abre en modo lectura y escritura
            //parametros: nombre de tabla/ nombre del objeto que contiene las modificaciones(valores)/ elemento con el que identificara el articulo que queremos modificar/null
            int cantidad = BaseDeDatos.update("articulos", registro, "codigo=" + codigo, null);
            //cerramos la BaseDeDatos
            BaseDeDatos.close();

            //validamos que el articulo que quiere modificar se modifico correctamente o si no existe
            if (cantidad==1){
                Toast.makeText(this, "Articulo modificado correctamente", Toast.LENGTH_SHORT).show();
                //limpiamos los campos:
                et_codigo.setText("");
                et_descripcion.setText("");
                et_precio.setText("");
            }else {Toast.makeText(this,"El articulo que quiere modificar no existe", Toast.LENGTH_SHORT).show();}


        }
        else {Toast.makeText(this,"No debe haber campos vacios", Toast.LENGTH_SHORT).show();}

    }
}
