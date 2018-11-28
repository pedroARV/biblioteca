package example2.tonio.video30;
//importamos la lcase para crear la base de datos en android con SQLite
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//video 30
//utilizamos la herencia antes de la llave y agregamos 2 metodos de esta forma:
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {
        //creamos una tabla deonde guardaremos los productos y articulos de esta forma
        //nombre de la base de datos/.execSQL/en los parametros creamos la tabla y le asignamos un nombre dentro de las comillas/ en las comillas asignamos el nombre del primer campo de la primer columna de mi tabla/ despues de la coma indicamos el nombre de mi segundo campo y su tipo/ ponemos el nombre del 3er campo tipo real
        BaseDeDatos.execSQL("create table articulos(codigo int primary key, descripcion text, precio real)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
