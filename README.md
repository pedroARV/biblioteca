# biblioteca

pedro.antonio.reyes.valdes@gmail.com


LinkedInd: java y android studio; jpa persistence, spring mvc
VIDEO 01: 
introduccion e instalacion del IDE:

android no es un lenguaje de programacion, Es un SO para dispositivos moviles de pantalla tactil, el cual permite instalacion, destribucion y ejecucion de software dentro de el con el nombre de "aplicaciones moviles"
1) instalar jdk
2)instalar Android Studio
*IDE: entorno de desarrollo integrado



VIDEO 02:
creacion de un nuevo proyecto:

1) start a new project
2)indicar el nombre, direccion, next
3)indicar para que dispositivos se programara
4)seleccionar activity (se divide en 2 partes, la logica y la grafica)

VIDEO 03:
la herramienta ConstraintLayout

te permimte utilizar la vista design y blue print para darle formato al activity



VIDEO 04:
crear y administrar dispositivos virtuales

crear:
1)tools/avd manager/crear un nuevo emulador
2)create a virtual device
3)phone/nexus 5X */next
4)elegir versiones de android (recomendadas)
5)nombrar(para diferenciarlo de otros)

administrar:
1)tools/avd manager/crear un nuevo emulador
2)flecha negra(opciones)
  2.1)eliminar emulador
3)lapiz (editar) 
4)(correr emulador)
  4.1)los 3 puntos de abajo(opciones avanzadas para emular)



VIDEO 05:
conectar y configurar dispositivos fisicos

* el dispositivo debe ser reconocido por la maquina, ya ea automaticamente o instalar drivers manualmente

** ajustes/acerca del dispositivo/"version de software" o "numero de compilacion" (presionar 7 veces)
opciones del programador/depuracion/"depuracion por USB" y "ubicacion de prueba" (activar)

1)activar las opciones del desarrollador del telefono**
2)run app(presionar)
3)seleccionar el celular fisico
4)ok(presionar)



VIDEO 06: 
ciclo de vida de un activity

onCreate(crea el activity)
onStart(inicia el activity)
onResume(muestra el activity)
onPause(pasa a segundo plano)
onStop(se detiene el activity)
onDestroy(se elimina el activity)
onRestart(inicia de nuevo el activity y pasa al primer paso)


VIDEO 07:
debugeo de aplicaciones

flecha verde (corre la app)
rayo(actualiza los cambios en los dispositivos virtuales)
engranaje(inicia el debugeo de la app)

flecha abajo con lineas arriba y abajo(continua con la siguiente linea)
cuadrado rojo(detiene el debugeo)


1)agregar los breakpoints para controlar la ejecucion de la app
2)presionar el engranaje (aceptar reiniciar la app y escoger el dispositivo)
3)continuar el debugeo con el atajo f8 (flecha azul con lineas)
4) detener el bugeo con el boton cuadrado rojo



VIDEO 08:
mensajes emergentes con Toast

Toast: es una notificacion emergente para los usuarios, se muestra en el activity que se esta usando y no interrimpe las funciones de la aplicacion, sin interaccion, necesita de la libreria: import android.widget.Toast;

estructura toast:
Toast.makeTeaxt(Context contexto, String texto, int duracion).show();



VIDEO 09:
mi primera aplicacion "grafica"

EditTextNumber (solo acepta numeros)
TextView (muestra texto)
Buton(permite interaccion)

Vistas:
Designe: permite una vista previa del diseño
BluePrint: permite relacionar los atributos mediante los "circulos" (mantener presionado para relacionar y dar click para quitarlos)

*android:hint="texto" //pone un texto tenue que desaparece al escribir sobre el//

1) poner los componentes
2) darles id unicas a los atributos
3) relacionar a los componentes para que no se muevan
4) darles formato (tamaño, texto, etc.)



VIDEO 10:
mi primera aplicacion "logica"

View=vista(componente)
R.(clase para comunicarse entre la parte logica(.java) y la parte grafica(.xml))

1) se declaran los objetos en privado dentro de la clase (antes del onCreate)
2) hacer un "castin" para darle el valor (textView) del .xml al (editText) de .java  (de esta forma la parte logica se comunica con la grafica)
3) se crea un metodo en el cual se hara la suma
4) en la parte grafica (.xml) click al button/atributos/onClick y seleccionar el metodo "sumar"



VIDEO 11:
ejercicio practico


1) poner los componentes, darles id unicas a los atributos, relacionar a los componentes para que no se muevan y darles formato (tamaño, texto, etc.)
2)se declaran los objetos en privado dentro de la clase (antes del onCreate)
3) dentro del onCreate hacer un "castin" para darle el valor (textView) del .xml al (editText) de .java  
4) se crea el metodo que iniciara el evento del boton public (para que lo pueda leer el .xml) void (para que pueda regresar un valor) nombreX (View view){}
5) se declaraon las variables String que recibiran los valores que ingrese el usuario, las cuales se igualan con las variables privadas previamente declaradas
6) parseamos los datos de String a int
7) se hace la operacion para sacar el promedio con las variables tipo int
8) se crea la sentencia if para los posibles resultados, para mandar el texto al textView del .xml es lo siguiente: nombreDeVariable.setTExt("texto a mostrar" + variableAConcatenar);
9)en la parte de diseño, seleccionar boton, ir al atributo onClick, seleccionar el metodo creado



VIDEO 12:
solucionar advertencia de HardcodedString

1) meterse al Strings.xml: app/res/values/Strings.xml
2) crear las etiquetas igual que las de arriba
3) ponerle un nombre para identificarlas, y ponerles el texto que mostraran
4)dentro del campo, en el atributo text o hint segun sea el caso, click en los 3 puntos a la dercha y escoger el "String" previamente creado



VIDEO 13:
radioGroup y radioButton parte grafica

1) crear los componentes necesarios (ya conocidos)
2) agrear el componente "RadioGroup" y darle un tamaño adecuado
3) agregar dentro del RadioGroup los RAdioButton necesarios
4) seleccionar el RadioGroup y en el atributo layout_height seleccionar wrap_content para mejorar el diseño
5) agregar los demas componentes necesarios (fuera del radioGroup)
6) acomodarlos en el blue print y darles sus respectivos id
7) darles texto mediante Stringss.xml (a exepcion del RadioGRoup)
8) darles el tamaño y formato deseado



VIDEO 14:
radioGroup y radioButton parte logica

1) en el public clas (antes del onCreate) declaramos objetos en privado
2) crear objetos para encontrar por id, los valores de los componentes (dentro el onCreate) (castin) incluyendo los radioButton
3) crear el metodo a ejecutar, cuando el usuario presione el boton de modo public void y fuera del onCreate
4) recuperar los valores con variables String
5) parseamos las variables de tipo string a int
6) creamos una sentencia tipo if donde revise si el radio buton esta seleccionado: if (rb1.isChecked() == true){}
7)se hace la operacion y el resultado se convierte a string mediante un parseo: String resultado = String.valueOf(suma);
8) se devuelve el resultado: tv.setText(resultado);
9) en el .xml seleccionar el boton y en el etributo onClick seleccionar el metodo creado



VIDEO 15:
ejercicio practico con radioGroup y RadioButton parte grafica

1) crear los componentes necesarios con el formato deseado
2) acomodarlos en el blue print y darles sus respectivos id
3) darles texto mediante Stringss.xml



VIDEO 16:
ejercicio practico con radioGroup y RadioButton parte logica

1) declaramos los objetos en privado antes del onCreate
2) crear objetos para encontrar los valores por id dentro del onCreate (castin)
3) crear el metodo fuera del onCreate
4) recuperar los valores con variables tipo String y las parseamos de String a Int
5) Creamos las sentencias if para checar si esta activado el radioButton
6) creamos las operaciones dentro del if correspondiente y las enviamos al textView del xml



VIDEO 17:
control CheckBox

1) se crean los componentes en el xml, se les da id, se le da el formato deseado y se le asigna texto mediante el string.xml
2) declaramos objetos privados antes del onCreate
3) creamos objetos dentro del onCreate (castear los valores del .xml)
4) crear metodo fuera del onCreate y asignar los valores a variables tipo String para parsearlas a tipo Int
5) se crea una variable tipo String que mostrara el resultado de la operacion: String = String + suma;
6) dentro de los if hacer la operacion correspondiente a cada if *no se utiliza el else, CheckBoxVariable.isChecked == true



VIDEO 18:
control spinner

1) se crean los componentes (el spinner) en el xml , se les da id, se le da el formato deseado y se le asigna texto mediante el string.xml (a exepcion del spinner)
2) declaramos objetos privados antes del onCreate (tambien el spinner)
3) creamos objetos dentro del onCreate (castear los valores del .xml) tambien el spinner
4) se crea un array para darle el texto a las opciones spinner
5) creamos una objeto nuevo de tipo ArrayAdapter de tipo String, context this y se le pone la variable que contiene el array, se hace referencia con el id al spinner del xml
6) a el objeto casteado se le introduce el texto en array del objeto ArrayAdapter de esta forma: spinner1.setAdapter(adapter);
7) se crea el metodo que se ejecutara con el boton fuera del onCreate
8) asignar los valores a variables tipo String para parsearlas a tipo Int
9) se toma la seleccion del usuario con este comando:         String variableSeleccion = spinner1.getSelectedItem().toString();
10) dentro de los if hacer la operacion correspondiente a cada seleccion: if (variable .equals("nombre de opcion")){}
11) mostrar el resultado en el textView: String resultado = String.valueOf(multiplicacion); tv.setText(resultado);



VIDEO 19:
personailzar un spinner

*el spinner ya debe de estar creado perviamente
1) crear un layaout en la carpeta layaout con click derecho: new/layaout resources file    y poner el siguiente nombre estructurado: spinner_item_nombreCualquiera
2) eliminar todas las lineas de codigo dentro del xml, a exepcion de la primera
3) <TextView
3.1)  android: layout_widht="match_parent"
3.2)  android: layout_height="wrap_content"
3.3)  xmlns:android="http://schemas.android.com/apk/res/android" />
4) se modifica este xml con codigo xml para darle formato al spinner ejemplo de comandos: textSize, padding y textColor
5) nos regresamos al .java donde se le asigna el texto al spinner y dentro de esa linea de comando borramos la referencia anterior y le introducimos la direccion del xml que creamos, ejemplo:         ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this, R.layout.spinner_item_design, opciones);



VIDEO 20:
control ListView

1) creamos los componentes deseados y se les de un tamaño y formato deseado, dar texto mediante le spring.xml a exepcion del listView
2) creamos un layout resources file, dentro de la carpeta layout y le borramos sus lineas decodigo a exepcion de la primera
3) darle atributos al xml, tales como: layout_width,layout,height, background, textSize, padding, textColor
4) se crean los objetos para comunicarse con el .xml (antes del onCreate)
5) se crean 2 arrays, el primero contiene los nombres, el segundo almacena las edades (onCreate)
6) declaracion de variables para comunicarse con el .xml y se le hace un castin
7) se hace un nuevo objeto tipo ArrayAdapter para ingreasar los elementos de nombre al objeto nuevo "adapter"
8) se mueve los nombres desde "adapter" al .xml: lv1.setAdapter(adapter);
9) se usa una funcion que permite detectar la opcion seleccionada y hacer un evento de acuerdo a la seleccion         lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
10) dentro de la funcion se imprime en el textView la edad                 tv1.setText("La edad de " + lv1.getItemAtPosition(i) + "es: " + edades[i] + "años");



VIDEO 21:
control ImageButton

*las imagenes deben medir 50x50 pixeles aproximadamente
** el nombre de las imagenes debe de ir en minusculas

1) copiar las imagenes i pegarlas en androidStudio en la direccion: app/res/mipmap  damos click derecho sobre mipmap y seleccionamos pegar, dar en ok y luego ok otra vez
2) agreagmos el componente ImageButton y seleccionamos la imagen deseada
3) establecer distancias entre los componentes, *no es necesario ponerles id
4) añadir texto describtivo mediante el Srping.xml y ponerla en el atributo contentDescription de cada ImageButton
5) *no es necesario objetos de imageButton y tampoco es necesario crear una relacion dentro del metodo onCreate
6) creamos los metodos, uno para cada boton
7) en el .xml accedemos al atributo onClick de cada ImageButton y le asignamos el metodo corespondiente

VIDEO 22:
control EditText y validacion de campos

1) se crean los componentes necesarios, se les da sus id respectivos, se les da texto mediante Strings.xml y se acomodan en el blue print
2) en el .java: se crean los objetos privados antes del onCreate
3) se crea la relacion y con un castin
4) se crea el metodo (fuera del onCreate)
5) se crean variables de tipo String para recuperar los valores que ingreso le usuario en los campos
6) validacion de campos (ver que no esten vacios), hay muchas formas para esta validacion, pero utilizaremos: variableNombre.lenght() == 0 // asi sabremos la cantidad de caracteres y luego la comparamos para ver si tiene 0 caracteres escritos el campo
7) de la misma forma se puede checar que ambos campos no esten vacios y despues mandar un Toast: variableNombre.lenght() != 0

VIDEO 23:
pasar de una activity a otra: intent

*cada vez que cambie de pantalla(activity) la aplicacion, debe lanzar o iniciar (onCreate, onStart, onResume) una nueva activity
**intent: es un objeto de accion que se utiliza para solicitar una accion de otro componente en la aplicacion
*** como crear un intent: 
0.1) se crea un objeto de tipo intent, 
0.2) se le asignan 2 parametros, el contexto actual y el contexto del activity al que queremos ir asignandole el .clas al final
0.2.1) Intent nombreDelObjeto = new Intent(this,contextoDelActivity.class);
0.3) en la siguiente linea se coloca: startActivity (nombreDelObjeto);

1) se agregan los componentes al 1er activity, se les da texto mediante strings.xml, se acomodan en el blue print y se les da formato (no es necesario agregar id)
2) creamos un nuevo activity: click derecho en app: new/activity/Empty Activity,   //se le asiga un nombre 
3) repetimos el paso 1 para el 2do activity
4) 1er activity: creamos un metodo afuera del onCreate
5)     
    public void Siguiente (View view){
        Intent siguiente = new Intent(this,SegundoActivity.class);
        startActivity(siguiente);
    }
6) repetir el paso 4 y 5 en el segundo activity
7) se asignan los metodos en los onCreate de los respectivos botones

VIDEO 24:
pasar parametros de una activity a otra

1) se crean los componentes del primer activity (plain text y button) se le asignan textos mediante el strings.xml, se acomodan en blue print y se le da formato
2) 1er activity: declaracion de objetos (EditText)
3) 1er activity: relacion con castin (en el onCreate)
4) 1er activity: crear un metodo fuera del onCreate 
5) 1er activity: se crea un objeto Intent con los contextos del primer y segundoActivity.class
6) 1er activity: pasar parametros con este codigo:         NombreObjeto.putExtra("dato", et1.getText().toString());
7) 1er activity: startActivity(NombreObjeto);
8) 2do activity: declaracion de objetos (TextView)
9) 2do activity: relacion con castin (en el onCreate)
10) 2do activity: se recibe el valor que serecibio en el activity anterior con:         String dato = getIntent().getStringExtra("dato");
11) colocamos el valor asignado por el usuario en el textView del segundo activity: tv1.setText("hola " + dato);
12) se crea el metodo fuera del onCreate
13)     public void Atras(View view) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }




VIDEO 25:
control WebView

*encapsulacion, investigar...

1) agregar los componentes (plainText y button), darles formato, blue print, strings.xml y id del MainActivity
	2) click derecho en app: new/activity/empty activity lo nombramos ActivitiWeb
	3) en el activity_web.xml añadimos el componente WebView, modificarel tamaño para dejar un espacio abajo para el boton de "cerrar" o "regresar"
	4) en el bue print solo se referencia hacia arriba y hacia la izquiera para el WebView
	5) se les asigna id (WebView), texto mediante string.xml y formato (boton)
		6) pasamos al 1eractivity: objeto segun el tipo del componente
		7) en el onCreate hacer la comunicacion y un castin
		8) crear el metodo para el boton fuera del onCreate
		9) hacer el intent para pasar al 2do activity que contiene el WebView
		10) pasamos parametros: i.putExtra("url", et1.getText().toString());
		11) iniciamos el 2do activity: startActivity(i);
	12) pasamos al 2do Activity
	13) creamos el objeto tipo default para el WebView asi: WebView wv1;
	14) en el metodo onCreate establecemos la comunicacion y hacemos un castin
	15) hacer que el activity recupere los valores del 1erActivity:         String URL = getIntent().getStringExtra("url");
	16) indicar que navege dentro de la aplicacion y que no se salga:         wv1.setWebViewClient(new WebViewClient());
	17) indicar inicie la busqueda:         wv1.loadUrl("http://" + URL);
	18) creamos el metodo para el boton "cerrar" o "regresar" fuera del onCreate
	19) en el metodo ponemos un nuevo metodo que cierra el activity actual y te regresa al anterior: finish();
20) darle permisos a la app para que pueda navegar por internet
21) app/manifest/AndroidManifest.xml
22) dentro del manifes nos localizamos debajo de la 3 linea o la linea que dice "packege" y copiamos el siguiente codigo:     <uses-permission android:name="android.permission.INTERNET" />



VIDEO 26:
almacenamiento de datos, clase sharedPreferences

*sharedPreferences: es uan clase que almacena datos para mejorar la experiencia del usuario, tales como: informacion personal, opciones de presentacion y configuracion.
** se utiliza para almecenar una cantidad limitada de datos, ejemplo: colores de pantalla, nivel actual de un juego, datos iniciales de controles de entrada de dato, etc.

1) se crean los componentes (EditText tipo E-mail), se les da formato, blue print, strings.xml y id (tambien el E-mail)
2) en el .java: se crean los objetos fuera del onCreate
3) dentro del onCreate se hace el castin y relacion 
4) en el onCreate se manda a llamar lo que esta dentro del sharedPreferences,         SharedPreferences preferences = getPreferences("datos", Context.MODE_PRIVATE);
5) colocar los valores encontrados en el sharedPreferences dentro del objeto EditText:         et1.setText(preferences.getString("mail", ""));
6) fuera del onCreate creamos el metodo para darle una funcion a nuestro boton
7) dentro del metodo se crea otro objeto de sharedPreferences, igual que al anterior
8) para guardar el archivo utilizamos la clase .Editor de la siguiente manera:         SharedPreferences.Editor ObjEditor = preferencias.edit();
9) guardamos el valor ingresado por el usuario dentro del preferences:         ObjEditor.putString("mail", et1.getText().toString());
10) confirmamos la accion de guardar el valor de la siguiente manera:         ObjEditor.commit();
11) terminamos el activity para cerrar la app con: finish();
12) en el .xml se añade el metodo creado dentro del atributo onClick del boton



VIDEO 27:
agenda de contactos con la clase shared Preferences

*editTExtMultiline: es un componente que permite tener varias lineas de texto

1) añadimos los controles necesarios (editText de tipo Miltiline), se les da: formato, blueprint, string.xml y id
2) en el .java antes del onCreate y creamos los objetos que utilizaremos
3) en el onCreate hacemos la relacion y un castin
4) creamos los metodos para los 2 botones 
	5) primer boton (Guardar o registrar): 
	6) se crean 2 variables temporales tipo String para almacenar los valores nombre y datos que introduce el usuario, estas variables son locales, por lo que solo funcionan dentro del metodo
	7) creamos un objeto de la clase sharedPreferences:         SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
	8) creamos un objeto para editar el archivo:         SharedPreferences.Editor obj_editor = preferencias.edit();
	9) asignar los valores:         obj_editor.putString(nombre, datos);
	10) confirmar que se editen y guarden los valores en el shared preferences:         obj_editor.commit();
	11) le damos un Toast para que el usuario sepa que el registro sea completado con exito, de esta forma el metodo Guardar esta terminado
		12) segundo boton, metodo Buscar
		13) se crea 1 variable temporal tipo String para almacenar el valor nombre que introduce el usuario, esta variable es local, por lo que solo funciona dentro del metodo
		14) creamos un objeto de la clase sharedPreferences:         SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
		15) creamos otra variable String en donde guardamos los datos de contacto que el usuario esta buscando:         String datos = preferencias.getString(nombre, "");
			16) creamos una estructura condicional para saber si esta el contacto guardado o no
			17) usamos un if else,   if (datos.length()==0){
            Toast.makeText(this, "No se encontro ningun registro", Toast.LENGTH_SHORT).show();}
            18) ahora en el else ponemos el codigo para que muestre los datos:             et_datos.setText(datos);
            	19) en el atributo onClick de los respectivos botones se les pone el metodo adecuado



VIDEO 28:
almacenamiento de datos-sistema interno de ficheros-bitacora

*otra forma de almacenar datos en nuestro dispositivo android es mediante de ficheros, estos ficheros solo pueden ser leidos por la propia aplicacion, no pueden ser leidos por otra app o por el usuario de forma externa

cada app dispone de una carpeta donde almacenar ficheros: (/data/data/nombre_del_paquete/files).

ventaja: cuando desinstalas la aplicacion se borran los ficheros

1) se añaden los componentes (textMultiline), se les asigna id, strng.xml, formato, blue print
2) en el componente multiLineText dentro del atributo gravity se activa el atributo top dentro de gravity: esto hara que el texto ingresado por el usuario se escriba en la parte superior del componente, y no en la parte inferior como esta predeterminado
3) textColor: para cambiar el color del texto, con el codigo hexadecimal
4) background: para cambiar el color del fondo con codigo hexadecimal
	6) en la parte logica creamos un objeto de tipo EditText antes del onCreate
		7) se crea la conexion con un castin para los objetos y los componentes (dentro del onCreate)
		8) primero tiene que ir a buscar los ficheros a travez de un array, y se almacena en una variable (vector):         String archivos [] = fileList();
		9) se crea una estructura condicional para indicar que hacer cuando halla algo dentro de los ficheros y cuando no
		10) hacemos un if y la condicion sera un metodo booleano:         if (ArchivoExiste(archivos, "bitacora.txt")){}
		11) creamos un objeto del tipo InputStreamReader para poder abrir un archivo, y abrimos el fichero con el metodo openFileInput:             InputStreamReader archivo = new InputStreamReader(openFileInput("bitacora.txt"));
		marcara error porque hay que agregar..
		12) pones: try{linea de comandos para recivir }catch(){}
		y con esto se te quita el error anterior
		13) despues utilizamos un objeto de la clase BufferedReader para leer el archivo que se abrio con la clase anterior
		14) indicamos donde guardar la primera linea de texto  que contiene el fichero:                 String linea = br.readLine();
		15) declaramos una variable que contendra todo el texto del fichero
		16) hacemos un ciclo while para leer la linea de texto y añadirla a la variable que contiene todo el texto, de esta forma: while (linea != null){
                    bitacoraCompleta = bitacoraCompleta + linea + "\n";
                    linea = br.readLine();
                }
       	17) ceramos el lector y el archivo: br.close(); y archivo.close();
       	18) mostramos el texto en el componente: et1.setText(bitacoraCompleta);
19) y asi acabamos la parte que se encarga de mostrar los datos que estaban dentro de los ficheros cuando se habre la app
			20) crearemos el metodo booleano que utlizamos en el if para eliminar el error
			21) salimos del onCreate y creamos un metodo booleano que recibe 2 parametros (los mismos del if), un vector tipo string y el nombre del archivo:     private boolean ArchivoExiste (String archivos [], String NombreArchivo){}
* en un metodo booleno no es necesario usar llaves de apertura ni de cierre para las sentencias
			22) recorremos el vector archivos con un for:         for (int i = 0; i< archivos.length; i++)
			23) se guira moviendose hasta encontrar el fichero bitacora.txt : if (NombreArchivo.equals(archivos[i]))
                return true;
        return false;
        	24) esto complementa la parte anterior porque el valor booleano antes no exixtia
25) creamos el metodo para el boton guardar
				26) indicamos que mandaremos texto a un fichero:             OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
				27) saltara un error y eso es porque no estamos usando un try: try{codigo para abrir el archivo}catch (IOException e){}
				27) poner el siguiente metodo para meter lo escrito en el componente dentro del fichero:
					 28) metemos al fichero lo que esta en el componente             archivo.write(et1.getText().toString());
					 29) hacemos un buffer para limpiar el canal por donde enviamos el texto del componente al fichero: archivo.flush();
					 30) despues de leer o escribir en un fichero es necesario cerrar el fichero asi: archivo.close();
					 31) ponemos un Toast fuera del catch para indicar que se a guardado correctamente el archivo
					 32) ponemos el comando: finish(); para cerrar el layout, con esto terminamos el metodo Guardar
33) le asignamos el metodo al boton en su atributo onClick



VIDEO 29:
almacenamiento de datos externos - tarjeta sd

1) se crean los componentes: 1PlainText, 1MultiLineText, 2buttons
2) se les da formato, string.xml, blue print, id, al multiline se le da: txt color, background y gravity top
3) ir al manifest, asignamos permiso para almacenar datos en la tarjeta sd:     <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
4) vamos a la parte logica y creamos los objetos antes del onCreate
5) creamos la relacion con los componentes y un castin dentro del onCreate
6) fuera del onCreate creamos el metodo publico para el botn guardar
7) dentro del metodo creamos variables para guardar los parametros qeu pase el usuario en los campos
8) creamos la estructura try catch y en el catch ponemos un toast que diga: no se pudo guardar
9) dentro del try debemos indicarle a la app donde esta la sd:             File tarjetaSD = Environment.getExternalStorageDirectory();
10) mandamos un Toast con la direccion de la SD:             Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_LONG).show();
11) creamos un nuevo objeto file y le pasamos 2 parametros, la url y el nombre del fichero:             File rutaArchivo = new File(tarjetaSD.getPath(), nombre);
12) abrimos el fichero para poder escribir dentro de el:             OutputStreamWriter abrirArchivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));
13) pasar el contenido que queremos que guarde dentro del fichero: abrirArchivo.write(contenido);
14) limpiamos el buffer: abrirArchivo.flush(); y cerramos el fichero: abrirArchivo.close();
15) mandamos un Toast para decir que se guardo correctamente y limpiamos los campos respectivamente:             et_nombre.setText("");
16) con esto terminamos el metodo Guardar y fuera del metodo Guardar creamos el metodo Consultar
17) creamos una variable para poder recuperar el nombre del fichero que el usario esta buscando: String nombre = et_nombre.getText().toString();
18) ponemos un try catch para poder modificar el fichero: try{codigo}catch (IOException e){}
19) indicaremos donde esta la ubicacion de la sd: File tarjetaSD = Environment.getExternalStorageDirectory();
20) buscamos al fichero que esta dentro de la ubicacion de la tarjetaSD: File rutaArchivo = new File(tarjetaSD.getPath(), nombre);
21) abrimos el archivo: InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nombre));
22) leemos la linea de texto para guardarla dentro de una variable:             BufferedReader leerArchivo = new BufferedReader(abrirArchivo);
23) leer la primera linea de texto y guardarla en una variable: String linea = leerArchivo.readLine();
24) creamos una variable que contendra todas las lineas de texto: String contenidoCompleto = "";
25) ciclo while para leer todas las lineas de texto e ingresarlas todas dentro de una sola variable: while (linea != null){//almacena las lineas en una varialbe//    contenidoCompleto = contenidoCompleto + linea + "\n";  //leemos linea por linea//  linea = leerArchivo.readLine(); }
26) cerramos la lectura del fichero y cerramos el fichero: leerArchivo.close(); y abrirArchivo.close();
27) imprimimos todo el contenido del fichero: et_contenido.setText(contenidoCompleto);
28) en el atributo onClick de los botones se le asignan los metodos segun sea el caso




VIDEO 30:
base de datos-altas(SQLite)

*base de datos: conjuntos de datos de un mismo contexto y se almacenan sistematicamente para su posterior uso
**SGBD: sistemas gestores de base de datos, permiten almacenar y acceder a los datos de forma rapida y estructurada
***SQLite: es un motor de BD para android, se usa porque: ofrece caracteristicas interesantes, tales como: pequeño tamaño, no utuliza un servidor, precisa poca configuracion, es transaccional y es de codigo libre:
****sintaxis para crear, actualizar y conectar con una BD SQLite: 
*****SQLiteOpenHelper, es una clase con 1 constructor y 2 metodos abstractos: onCreate() y onUpgrade() que sirven para crear nuestra BD y para actualizar su estructura

1) creamos una clase java en la misma carpeta que se encuentra nuestra clase main y la nombramos: AdminSQLiteOpenHelper
2) al final de package e importarmos una clase: import android.database.sqlite.SQLiteOpenHelper;
3) en la misma linea de texto donde se crea la clase agregamos la herencia: public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {}
4) ponemos el cursor justo despues de añadir la herencia a la clase y presionamos la combinacion de teclas: alt+enter o ctrl+enter, despues agregamos los metodos y se agregaran de manera automatica los override con los metodos onCreate y onUpgrade
5) agregamos el constructor con la combinacion de teclas alt+enter y/o ctrl+enter y escojemos al que tiene 4 parametros: context, nombre, factory, version: con esto se eliminaran los errores faltantes, con esto terminamos el cuerpo base de la clase
6) en el metodo onCreate le cambiamos el nombre a la base de datos de la siguiente manera:     public void onCreate(SQLiteDatabase BaseDeDatos) {
7) en el metodo onCreate creamos la tabla donde guardaremos nuestros productos y articulos:         BaseDeDatos.execSQL("create table articulos(codigo int primary key, descripcion text, precio real)");
	8) nos pasamos al xml y ponemos los siguientes campos: TextNumber, PlainText y TextNumberDecimal, ademas de 4 botones
	9) a los campos se le pone formato, blue print, id y su texto en string.xml
		10) en la parte logica creamos los objetos de tipo EditText antes del onCreate
		11) dentro del onCreate hacemos la relacion y un castin
			12) fuera del onCreate creamos el metodo para el boton Registrar
			13) dentro del metodo creamos un objeto de la clase que recien hicimos y le pasamos 4 parametros: contexto, nombre de BD, null, Version de BD:         AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
			14) abrimos la BD en modo lectura y escritura: SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
			15) recibimos los valores de los campos:         String codigo = et_codigo.getText().toString();
			16) validamos los campos (checar que no esten vacios) 
				17) en la estructura if se utiliza .isEmpty para ver si el valor es igual a vacio: !codigo.isEmpty(), se usa el ! para devir si No esta vacio
				18) en el else se le manda un Toast que diga "llene todos los campos" y se cierra la Base De Datos:         if (!codigo.isEmpty()){
			19) en el if creamos un objeto de la clase ContentValues para ingresar los valores a la BD: ContentValues registro = new ContentValues();
			20) al objeto se le ingresan los valores con .put:             registro.put("codigo", codigo);
			21) hasta ahi ingresamos los valores a la BD, ahora toca meter los valores dentro de la tabla:             BaseDeDatos.insert("articulos", null, registro);
			21) cerramos la base de datos:             BaseDeDatos.close();
			22) limpiamos los campos con .setText y las comillas sin nada, y mandamos un Toast para avisar al usuario que se registro correctamente



VIDEO 31:
base de datos-consultas(SQLite)(continuacion del 30)

23) creamos un metodo para el boton de consultas
24) dentro del metodo creamos un objeto de la clase que hicimos y le pasamos 4 parametros: contexto, nombre de BD, null, Version de BD:         AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
25) abrimos la BD en modo lectura y escritura: SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
26) recuperamos el valor del campo codigo para hacer una busqueda mediante el codigo:         String codigo = et_codigo.getText().toString();
	27) validamos el campo:         if (!codigo.isEmpty()){// y se le pone un Toast en el else para indicar que debe llenar el campo codigo
	28) dentro del if creamos un objeto de la clase Cursor y lo usamos para seleccionar en la tabla los campos que estamos buscando: Cursor fila = BaseDeDatos.rawQuery
                    ("select descripcion, precio from articulos where codigo =" + codigo, null);
    	29) creamos otro if para ver que la consulta no venga con valores vacios (que no halla nada registrado) la condicion para ver si estan vacios es:             if (fila.moveToFirst()){
    	30) en el if seteamos los valores de la tabla al campo:                 et_descripcion.setText(fila.getString(0)); // es importante que el numero del ultimo parametro siempre inicie en 0 y luego continue normal
    	31) despues debemos cerrar la base de datos con el metodo .close();
    	32) en el else tambien hay que cerrar la base de datos porque quedo abierta desde antes de este if y mandamos un Toast que no se encontro ningun articulo



VIDEO 32:
base de datos-bajas(SQLite)(continuacion del 30 y 31)

33) creamos un metodo para el boton de Bajas o Eliminar
34) dentro del metodo creamos un objeto de la clase que hicimos y le pasamos 4 parametros: contexto, nombre de BD, null, Version de BD:         AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
35) abrimos la BD en modo lectura y escritura: SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
36) recibimos el codigo del producto que va a ser eliminado: String codigo = et_codigo.getText().toString();
	37) validamos el campo del codigo:         if (!codigo.isEmpty()){// en el else mandamos un Toast para avisar que debe llenar el campo
	38) borramos los valores de la tabla segun donde indique el codigo ingresado por el usuario:             int cantidad = BaseDeDatos.delete("articulos", "codigo=" + codigo, null);
	39) cerramos la BaseDeDatos: BaseDeDatos.close();
		40)creamos otro if, este indicara si ya se elimino el articulo o si no existe tal articulo mediante la condicion:             if (cantidad==1){// en el if se manda un Toast diciendo que se elimino y en el else un Toast que diga que el producto no existe




VIDEO 33: 
base de datos-modificaciones(SQLite)(coninuacion de los videos 30, 31 y 32)

41) creamos un metodo para el boton de Modificaciones
34) dentro del metodo creamos un objeto de la clase que hicimos y le pasamos 4 parametros: contexto, nombre de BD, null, Version de BD:         AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
35) abrimos la BD en modo lectura y escritura: SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
36) recibimos los valores que a modificado el usuario: String codigo = et_codigo.getText().toString(); String descripcion = et_descripcion.getText().toString(); String precio =et_precio.getText().toString();
	37)validamos los campos con un if y la condicion: if (!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){ // de esta forma no habra ningun campo vacio, y en el else ponemos un Toast para avisar que no puede dejar los campos vacios
	38) en el if creamos un objeto de la clase ContentValues para almacenar de manera temporal los valores que ingresaremos a la tabla de la base de datos:             ContentValues registro = new ContentValues();
	39) guardamos las modificaciones dentro del objeto ContentValues llamado registro:             registro.put("codigo", codigo);            registro.put("descripcion", descripcion);
	40) modificamos los valores dentro de la base de datos:             int cantidad = BaseDeDatos.update("articulos", registro, "codigo=" + codigo, null);
	41) cerramos la base de datos: BaseDeDatos.close();
		42) validamos que el articulo a modificar exista:             if (cantidad==1){// ponemos un Toast que indique el exito de la modificacion y un Toast en el else indicando que no existe tal articulo




VIDEO 34:
LinearLayout

*es un grupo de vista que alinea todos los campos secundarios en una sola direccion, tanto vertical como horizontal, esta direccion se puede especificar con el atributo orientation

0.1) en el xml agregamos un linearLayoutHorizontal
0.22) todos los componentes que metamos en este linearLayout se acomodaran a modo de columnas (horizontal)
0.3) si cambiamos el atributo layout_widht y layaout_height a warp content(lo que abarque el contenido) esto se reducira al espacio que abarquenlos componentes que estan dentro de el
	0.4) agrgamos un linearLayout vertical (filas) 
	0.5) todos los componentes que pongamos dentro se estiraran a lo largo del layout y pontran los componentes uno debajo del anterior
	0.6) si cambiamos el atributo layout_widht y layaout_height a warp content(lo que abarque el contenido) esto se reducira al espacio que abarquenlos componentes que estan dentro de el

1) haremos una pantala de login
2) linearLayoutVErtical, blue print, 
	3)añadimos los componentes de tipo EditText: E-mail, password, añadimos un boton
	4) se le asigna texto desde el string.xml y se le da formato
	5) cambiamos los atributos de medida del layout: widgth: match_constraint y al height wrap_content



VIDEO 35:
TableLayout

*tableLayout: permite agrupar componentes en filas y columnas, table Layout es un conjunto de componentes TableRow y estos agrupan componentes por cada fila a diferencia de linearLayout, en esta se añade una nueva dimension donde se puedencolocar nuevos componentes tanto vertical, como horizontalmente en forma de tabla
**TableLayout en realidad es una especializacion de LinearLayoutVertical, pero con comportamiento particularizado
***TableRow: es una especializacion de LinearLayoutHorizontal
****siendo asi que en realidad un TableLayout es un grupo de LinearLayoutHorizontales dentro de un LinearLayoutVertical

0.1) añadimos un TableLayout en el xml, blue print, dentro del componente TableLayou(horizontal)t hay 4 TableRow y estas 4 tableRow son las filas (verical) de la tabla
0.2) se le indica que usaremos 1 de sus filas: arrastramos el componente dentro de el arbol de componentes para que se acomode en forma de tabla
	0.3) atributos del componente TableLayout:
	0.4) para expandir el tamaño de un componente boton, seleccionamos el boton y en sus atributos buscamos :layout_span, en este atributo indicaremos cuantas columnas queremos que se expanda nuestro boton


1) añadimos un TableLayout, arrastramos 2 TableRow en el arbol del TableLayout para tener un total de 6 columnas
2) añadimos 2 boton a cada TableRow de modo que habra un boton por fila
3) añadimos un total de 3 botones por fila(TableRow) a exepcion de la ultima, donde se utilizara solo 1 boton
4) seleccionamos los 3 botones de la linea con shit+click y nos aparecera un menu en la parte superior con 4 botones, clickeamos la opcion que dice: Distribute Weights Evenly: de esta forma se acomodaran los 3 botones abarcando todo el espacio del layout
5) en el ultimo TableRow que solo tiene 1 boton, seleccionas el boton y cambiaras el atributo layout_weight por elnumero 3 (es importanto hacerlo despues del paso anterior o no saldra correctamente, al menos 1 fila(TableRow)  debe de estar distribuida)
6) damos texto a los botones mediante el string.xml
7) ponemos un componente de tipo TextView y le asignamos texto mediante el string.xml, le ponemos un 0 y con esto terminamos el formato de clculadora del xml



VIDEO 36:
frameLayout

*frameLayout: es el layout mas simple, pues no realiza ninguna distribucion de los componentes, solo los coloca uno encima del otro, suele utilizarse para mostrar un solo control, ejemplo: una imagen

1) agregamos un FrameLayout, blue print y se ponemos 2 componentes adentro: un ImageView y un boton
2) en el imageView dentro del atributo visibility le asignamos la propiedad: invisible 
3) se asignamos texto al boton mediante el strings.xml
	4) en la parte logica creamos 2 objetos, uno para el ImageView y otro para el Button (se crean antes del onCreate)
	5) creamos la relacion y un castin dentro del onCreate (tambien al boton)
		6) fuera del metodo onCreate, hacemos el metodo para el boton ocultar
		7) usamos el metodo .setVisibility para desirle que cambiaremos ese atributo, usamos a View en el parametro y le ponemos .Visible o .Invisible segun sea el caso
		boton1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
        	8) en el atributo onClick asignamos el metodo creado



VIDEO 37: 
ScrollView

*ScrollVieweste componente permite colocar una cantidad de componentes mayor a los que el dispositivo en cuestion puede mostrar, de esta forma el usuario podra desplazarse dentro de la interfaz creada 

1) seleccionamos y copiamos las imagenes que queremos meter al proyecto, estas imagenes no deben tener mayusculas ni caracteres especiales
2) las pegamos dentro de drawable, ok y ok
3) añadimos el componente scrollView, en el blue print y le ponemos dependencias abajo y a los 2 lados pero no arriba 
4) añadimos un imageButton en el arbol de componentes dentro del LinearLayout que esta dentro del ScrollView y le ponemos una de las imagenes previamente agregadas al proyecto, un id correspondiente a la imagen y en los atributos le cambiamos el background a color verde con codigo hexadecimal
5) le añadimos una descripcion mediante el string.xml, se puede usar la misma descripcion para todos los botones porque no hace falta explicar nada de cada boton, esta descripcion se coloca en el atributo contentDescription
6) repetimos el proceso para todos los imageButton hasta acabarnos las imagenes
7) creamos 1 metodo y usaremos un switch para mandar a llamar los id de los botones con la condicion:         switch (view.getId()){
8) en cada caso mandamos a buscar el id del boton, ejemplo:             case R.id.fresa: // y ponemos un break; para detener el caso, repetimos el proceso para los demas botones
9) a cada boton le ponemos el metodo creado en el atributo onClick



VIDEO 38:
cambiar icono, colores y nombre de una app

*descargamos una imagen de preferencia png: el nombre de la imagen debe tener todas las letras en minusculas y las dimensiones de la imagen no son importantes

** https://www.materialpalette.com

1) en el arbol del proyecto damos click derecho en: app / new / image asset
2) icon type: launcher icons (adaptive and legacy): esta opcion nos genrea icono para varios tamaños y para el icono de la play store
3) name: ic_launcher //de preferencia no cambiar el nombre porque si lo cambiamos tambien hay que cambiarlo en el manifest
3) image type: image
4) path: //buscamos nuestra imagen mediante el directorio que sale al presionar los 3 puntos
5) trim: yes
6) resize: normalmente se deja en 100% pero se puede modificar segun nos paresca // con esto terminamos la dicion del icono
7) vamos a la pestaña Background Layers
8) layer name: //no cambiarel nombre preferentemente
9) asset type: color // y ponemos un color que estara detras de nuestra imagen o bien podemos poner// image // y reducir el tamaño para que solo se vea el icono 
10) trim: yes
11) pasamos al legacy: todos los generate: yes
12) shape: none // shape es la forma del icono, se puede cambiar segun nos paresca pero en esta ocasion usaremos none
13) next (se ignora la advertencia que lanza por tener el mismo nombre) y luego finish
//vamos a poner el icono de nuestra app al lado del nombre de nuestra app
14) vamos a la parte logica y dentro del onCreate ponemos:         getSupportActionBar().setDisplayShowHomeEnabled(true);
15) despues llamamosal icono mediante R.mipmap.ic_launcher:         getSupportActionBar().setIcon(R.mipmap.ic_launcher);
//con esto terminamos de poner el icono en el actionBar(donde aparece el nombre del proyecto)
//ahora cambiamos el color del actionBar
16) vamos a: https://www.materialpalette.com : aqui seleccionamos 2 colores, el primer color sera para el actionBar y el segundo para componentes (ninguno de los componentes que hemos visto hasta ahora son afectados por este color
17) una vez seleccionados los colores a utilizar vamos a dar click en download y escojemos la opcion xml y guardamos el archivo
18) vamos a la carpeta donde se almaceno el archivo y lo abrimos con sublime text, si no tenemos sublime text usamos el block de notas y copiamos lo que hay dentro, solo las lineas que tienen android color
19) vamos a res / values / colors.xml y pegamos ahi dentro el codigo que copiamos previamente
20) el codigo previo al que pegamos tiene 3 lineas de color con sus respectivas referencias, debemos ubicar las 3 lineas con esas 3 referencias de los que copiamos y eliminamos las que sobran 
21) sustituimos las referencias respectivamente y borramos las 3 lineas que no vamos a usar 
//con eso terminamos de cambiar el color de la actionBar
//ahora vamos a cmabiar el nombre de la app
22)nos dirijimos a res / values / string.xml y en la linea de codigo que diga : app_name le cambiamos el texto al deseado
//con esto terminamos de cambiar el nombre a la app



VIDEO 39:
reproduccion de audio- clases mediaPlayer y soundPool

* se pueden incluir sonidos a nuestra aplicacion, ya sean sonidos de corta o larga duracion; existen 2 clases que nos permiten hacer esto: la clase MediaPlayer y la clase SoundPool 
** la clase SoundPool es utilizada para reproducir archivos de audio muy cortos, con un tamaño maximo del audio de 1mb
*** la clase MediaPlayer se utiliza para reproducir archivos de audio largos, tales como musica o grabaciones de audio:
**** los audios deben estar en formato mp3 y el nombre de los audios debe de estar siempre en minusculas


***** si no aparece la pista de sonido solo hay que cerrar y abrir AndroidStudio

1) debemos dar click derecho en los audio seleccionados y damos en copiar
2) en el arbol de la aplicacion vamos a: app / res // en res damos click derecho new / directory // donde el nombre del directorio sera: raw //solo puede llamarse raw, ya que de otra forma no reconocera el directorio
3) damos click derecho sobre: raw  // y damos en pegar// de esta forma pegamos los audios que ya habiamos copiado en el paso 1, damos en ok
	4) pasamos a la parte grafica y ponemos 2 botones, blue print, string.xml, y les damos un id al boton que usara la clase SoundPool
		5) pasamos a la parte logica y nos enfocaremos en la clase SoundPool
		6) antes del onCreate necesitaremos hacer 2 objetos y una variable tipo int: Button play; SoundPool sp; int sonido_de_reproduccion; 
		7) creamos la relacion entre la parte grafica y la parte logica y le hacemos un castin
		8) le pasamos 3 parametros a objeto SoundPool que creamos:         sp = new SoundPool(1, AudioManager.STREAM_MUSIC, );
		9) metemos la pista de audio dentro del objeto que creamos de la clase SoundPool mediante la clase int previamente creada:         sonido_de_reproduccion = sp.load(this, R.raw.tone_short, 1);
			10) salimos del onCreate para crear el metodo para el boton que activara el SoundPool
			11) reproducimos la pista de sonido mediante el objeto:         sp.play(sonido_de_reproduccion, 1, 1, 1, 0, 0);
		// ahora que acabamos con el objeto SoundPool nos pasamos a explicar como reproducir con MediaPlayer
		12) creamos un metodo fuera de la clase onCreate para el boton que activara el MediaPlayer
		13) creamos un objeto de la clase MediaPlayer que almacenara la pista de sonido:         MediaPlayer mp = MediaPlayer.create(this, R.raw.rise_long); // es importante que el objeto tenga el metodo .create
		14) reproducimos la pista:         mp.start();
15) vamos a la parte grafica y a cada boton le ponemos el metodo en el atributo onClick segun sea el caso 



VIDEO 40:
reproductor de musica - diseño grafico

*las imagenes deben tener el nombre en minusculas y no tener caracteres especiales paa evitar errores

1) copiamos las imagenes que usaremos y las pegamos en new / drawable 
2) creamos un directorio dentro de la carpeta res y se llamara raw
3) copiamos las canciones que usaremos y las pegamos en res / raw 
	4) vamos al xml y lo primero que haremos sera cambiar el background, seleccionamos el constraintLayout que esta en el arbol de componentes, y buscamos el atributo background, en este atributo ponemos la imagen que copiamos previamente en el drawable que en este caso se llama: background
	5) añadimos un ImageView para que contenga las imagenes que se usaran de portada para las canciones, el ImsgeView lanzara un warning, este warning se quita si le pones una descripcion mediante el strings.xml
	//como cambiar el diseño del ImageView con 1 boton
	6) ponemos 1 boton, blue print, id,
	7) borramos el texto del atributo: Text para que no tenga letras y le damos una forma cuadrada mediante los atributos: layout_width layout_height
	8) vamos a los atributos del boton y buscamos background, ahi le asignamos la imagen que copiamos al drawable, en este caso llamada reproducir
	9) repetimos el proceso con los otros botones
		10) pasamos a la parte logica y creamos los objetos y variables que usaremos: los 2 botones dinamicos, un objeto de la clase MediaPlayer y un objeto ImageView, tambien crearemos 2 clases int, una para el boton repetir donde inicia con el valor 2 y la otra variable sera posicion, esta ultima sera nuestro indice para cambiar las canciones mediante un vector; tambien crearemos un vector de tipo MediaPlayer y se llamara vectormp: en este vector se guardaran las pistas de audio. Quedaria asi: 
		11) sintaxis: Button btn_play_pause, btn_repetir;		MediaPlayer mp;						ImageView iv;		int repetir = 2, posicion = 0;					MediaPlayer vectormp []  = new MediaPlayer [4];
			12)nos metemos al onCreate y hacemos la relacion mas un castin para los botones y para el imageView
				13) ahora pasaremos las canciones o pistas de audio al vector de MediaPlayer:         vectormp[0] = MediaPlayer.create(this, R.raw.race);
//metodo para el boton play-pause
			14) nos salimos del onCreate para crear los metodos necesarios, iniciaremos con el metodo para el boton PlayPause
				15) hacemos un if else con la condicion:         if (vectormp[posicion].isPlaying()){
				16) primero pausamos la cancion:             vectormp[posicion].pause();
				17) cambiamos la apariencia del boton:             btn_play_pause.setBackgroundResource(R.drawable.reproducir);
				18) mandamos un Toast para avisar que se puso pausa
			19) primero iniciamos la cancion:             vectormp[posicion].start();
			20) despues cambiamos la imagen del boton:             btn_play_pause.setBackgroundResource(R.drawable.pausa);
			21) mandamos un Toast para avisar que se le dio play a la cancion



VIDEO 41: 
reproductor de musica-diseño logico (continuacion del 40)
// metodo para el boton stop
22) estructura if pero sin el else con la condicion:         if (vectormp[posicion] != null){ //comprobando asi que hay una cancion reproduciendose
23) detenemos la cancion:             vectormp[posicion].stop();
24) asignamos las canciones otra ves al array de tipo MediaPlayer:             vectormp[0] = MediaPlayer.create(this, R.raw.race);
25) la variable que usamos como indice parareproducir las cancionese la movemos a la primera cancion:             posicion = 0;
26) cambiamos la imagen del boton play:             btn_play_pause.setBackgroundResource(R.drawable.reproducir);
27) cambiamos la portada a la primera cancion:             iv.setImageResource(R.drawable.portada1);
28) mandamos un Toast avisando que se a puesto stop al reproductor
//metodo para el boton repetir
	29) estructura if else donde la condicion es:         if (repetir == 1){
	30) cambiamos el aspecto del boton:             btn_repetir.setBackgroundResource(R.drawable.no_repetir);
	31) hacemos que deje de repetirse:             vectormp[posicion].setLooping(false);
	32) mandamos un toast para decir que ya no se repite
	33) la variable que usamos para saber si esta repitiendo o no la devolvemos al valor donde se deja de repetir, ejemplo:             repetir = 2;
//else
	34) cambiamos el aspecto del boton:            btn_repetir.setBackgroundResource(R.drawable.repetir);
	35) mandamos un toast que diga que se esta repitiendo
	36) hacemos que la cancion empieze a repetirse:             vectormp[posicion].setLooping(true);
	37) devolvemos el valor que si se repite a la variable que usamos para identificar si se esta repitiendo o no:             repetir = 1;
//metodo para el boton siguiente
		38) usamos un if else donde la condicion sea:         if (posicion < vectormp.length -1){// esto evitara un fallo en el que la app deje de funcionar
	39) mandamos un toast en el else avisando que ya no hay mas canciones
		40) dentro del if haremos otra estructura if else donde la condicion sea:      if (vectormp[posicion].isPlaying()){//para saber si se esta reproduciendo
			41) dentro del if detendremos la cancion actual:                vectormp[posicion].stop();
			42) incrementamos el valor del indice en 1              posicion++;
			43) iniciamos la cancion en la que se encuentra el indice:                 vectormp[posicion].start();
			44) cambiamos las portadas con una serie de if donde la condicion sea el indice: 
			if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
		44) en el else solo se incrementa el indice en 1:
		45) y cambiamos la portada mediante una serie de if: 
		if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
//hacemos un metodo para el boton anterior
			46) usamos un if else donde la condicion sea:         if (posicion <= 0){// esto evitara un fallo en el que la app deje de funcionar
		39) mandamos un toast en el else avisando que ya no hay mas canciones
				40) dentro del if haremos otra estructura if else donde la condicion sea:      if (vectormp[posicion].isPlaying()){//para saber si se esta reproduciendo
				41) dentro del if detendremos la cancion actual:                vectormp[posicion].stop();
				42) reducimos el valor del indice en 1              posicion--;
				43) cambiamos las portadas con una serie de if donde la condicion sea el indice: 
				if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }
				44) iniciamos la cancion en la que se encuentra el indice:                 vectormp[posicion].start();
				
			44) en el else solo se reduce el indice en 1:
			45) y cambiamos la portada mediante una serie de if: 
			if (posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if (posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if (posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }else if (posicion == 3){
                    iv.setImageResource(R.drawable.iconworlds);
                }



VIDEO 42:
grabacion de audio - clase MediaRecorder 

* la clase MediaRecorder se utiliza para grabar audio y video en diferentes formatos, para mas informacion de la clase MediaRecorder: https://developer.android.com/reference/android/media/MediaRecorder
** cuando desarrollamos app que requieren usar sensores del dispositivo, tales como: microfono y camara, y/o aparte de almacenar audios o videos se requiere el permiso del usuario,/////// para esto colocaremos los permisos dentro del codigo, ya que si no colocamos los permisos la app no funcionara

*** el nombre de las imagenes debe de estar en minusculas y sin caracteres especiales

1) copiamos las imagenes que usaremos para diseñar la app
2) pegamos las imagenes en el directorio: drawable
	3) pasamos al xml y hacemos el diseño, ponemos un background para el constraintLayout
	4) agregamos un ImageView con la imagen correspondiente para darle un mejor diseño, lanzara un warning pero se quita facil con poner un texto desde el strings.xml dentro del atributo contentDescription
	5) agregamos 2 botones, blue print, le ponemos un id porque seran botones didacticos (cambiaran su apariencia), le asignamos una medida cuadrada segun nuestro gusto y le borramos el texto y en el atributo background le asignamos las imagenes correspondientes
		6) cambiamos los colores del actionBar, vamos al colors.xml y se le cambia el numero hexadecimal segun nuestro parecer, una opcion mas grafica es dando click al cuadro de color que esta al lado izquierdo de cada linea
	7) vamos a la parte logica de la app y  agregamos 3 elementos antes del onCreate: private MediaPlayer grabacion;
    private Button btn_recorder;
    private String archivo_salida = null;
    	8) pasamos dentro del onCreate y ponemos la relacion entre la parte logica y grafica del boton para grabar, ademas de un castin
    	9) la siguiente linea de codigo activa el manifest y envia los mensajes emergentes que piden el permiso de usario para guardar audio: if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    10) ahora toca hacer los metodos para los botones, iniciamos con el boton que graba el audio
    11)hacemos un if else donde la condicion sea:         if (grabacion == null){ //para ver si el objeto esta grabado
    	12)dentro del if se pone lo que hara si no esta grabando nada: 
    	13) almacenamos en un string con la direccion en la que se creara la pista de audio:             archivo_salida = Environment.getExternalStorageDirectory(.getAbsolutePath()) + "/Grabacion.mp3";
    	14) creamos el objeto de tipo MediaRecorder:             grabacion = new MediaRecorder();
    	15) usamos el censor microfono para obtener la pista de audio:             grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
    	16) le cambiamos el formato a la pista de audio:             grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP); //el ultimo parametro es para darle el tipo de audio, esto no interfiere con la extencion que le dimos en el directorio
    	17) le hacemos un encoder al audio:             grabacion.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
    	18) le ponemos el nombre que almacenamos en la variable string a nuestra pista de audio:             grabacion.setOutputFile(archivo_salida);
    		19)necesitaremos usar 2 metodos especificos de la clase MediaRecorder, por lo que debemos poner un try catch para poder ejecutarlos: 				try {
                20) preparamos el objeto para empezar a grabar
                grabacion.prepare();
                21) comenzamos a grabar
                grabacion.start();
            22) ponemos la exepcion en el catch: }catch (IOException e){}
            23) cambiamos el aspecto del boton:             btn_recorder.setBackgroundResource(R.drawable.rec);
            24) mandamos un Toast para avisar que esta grabando
    25) pasamos al else y le ponemos otra estructura if donde la condicion sea:         }else if (grabacion != null){
    26) detenemos la grabacion: grabacion.stop();
    27) ponemos la grabacion en estado finalizado: grabacion.release();
    28) indicamos que el objeto de tipo MediaRecorder en este caso llamado grabacion y le regresamos un valor nulo: grabacion = null;
    29) solo falta cambiar la imagen del boton: btn_recorder.setBackgroundResource(R.drawable.stop_rec);
    30) mandamos un Toast avisando que dejo de grabar
//creamos el metodo para el boton reproducir
31) creamos un objeto de la clase MediaPlayer:         MediaPlayer mediaPlayer = new MediaPlayer();
	32) ponemos un try catch para poder ejecutar los siguientes metodos dentro del try:
	33) dentro del objeto MediaPlayer le pasamos el audio que queremos reproducir con el metodo .setDataSource y como parametro pasamos el nombre del audio:             mediaPlayer.setDataSource(archivo_salida);
	34) preparamos el audio con el metodo .prepare:             mediaPlayer.prepare();
35) en el catch no se pone nada:         }catch (IOException e){}
36) reproducimos la pista de audio con el metodo .start //este metodo se puede usar fuera del try, por eso lo dejamos fuera del try:         mediaPlayer.start();
37) mandamos un Toast avisando que se esta reproduciendo el audio
	38) vamos a la carpeta manifest y abrimos el manifest
	39) nos situamos arriba de la etiqueta application y ponemos las siguientes lineas de codigo: <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
40) vamos a la parte de diseño y le asignamos los metodos correspondientes a los botones con el atributo onClick



VIDEO 43:
aplicaciones multilenguaje

* internacionalizacion: es un metodo que nos permite distribuir nuestras aplicaciones mobiles en distintos idiomas sin la necesidad de crear mas de una version de la misma app, esta es la razon por la que colocamos todos nuestros textos mediante el archivo strings.xml

1) ponemos los componentes: plainText, Password, Button y text view (1 de cada 1), les ponemos el blue print y le ponemos texto mediante strings.xml
	2) creamos un Value Resource File desde la carpeta values y se llamara: strings y seleccionamos el qualifiers locale// se nos abriran 2 ventanas mas y la ventana lenguage seleccionamos el otro idioma que usaremos , en este caso english , despues en la ventana siguiente escogemos para que regiones de esa lengua sera traducido, en este caso pondremos Any Region
		3) entramos al nuevo archivo que creamos llamado strings.xml(en)
		4) copiamos las mismas etiquetas del strings.xml original y las pegamos al nuevo, posteriormente traducimos el texto manualmente
//ya con esto terminamos la parte de multilenguaje
*) para probarlo debemos de cambiar el idioma del dispositivo y el texto se cambiara automaticamente: ajustes / teclado e idioma / idioma / english y abrimos la app de nuevo, en cuanto se habra ya se habran mostrado los cambios de idioma



VIDEO 44:
actionBar - menu OverFlow

* ActionBar: proporciona una estructura visual y elementos interactivos al activity 
** elementos interactivos de la ActionBar: ActionButtons y menu overFlow
*** menuOverFlow: es un menu desplegable que muestra opciones disponibles dentro de nuestra app, pero que no tiene espacio para aparecer dentro del actionBar o que no son muy importantes para mostrar de primera instancia

1) crearemos un nuevo activity donde desarrollaremos el menu para posteriormente ponerlo en el activity_main
	1.1) en la rama del proyecto vamos a res y le damos click derecho: new / Android Resource File///// se puede llamar como sea pero debe ser un nombre en minusculas//////Resource type: menu////// damos en ok
	2) arrastramos el componente MenuItem dentro del actionBar////con esto se pone el icono de los 3 puntos y sale una opcion desplegable///para poner mas opciones hay que arrastrar mas MenuItem dentro del anterior
	2.1) les damos un id que sera especificamente: item1, item2,item3 //////y les asignamos un texto mediante el strings.xml, el texto se debe asignar en el atributo Title
		3) vamos a la parte logica de la app y fuera del metodo onCreate para crear un metodo que ocultara y mostrara el menuOverFlow
		4) creamos un metodo publico de tipo booleano que se debe llamar onCreateOptionsMenu y debemos crear un objeto de tipo Menu para pasar el parametro:     public boolean onCreateOptionsMenu (Menu menu){
		5) mostramos u ocultamos el menu:         getMenuInflater().inflate(R.menu.overflow, menu);
		6) regresamos el valor true de nuestro metodo booleano:         return true;
	//creamos otro metodo publico pero este sera para las funciones de nuestro menu
	7) creamos un metodo publico de tipo booleano que se debe llamar onOptionsItemSelected y en el parametro recibira la opcion que se selecciono:     public boolean onOptionsItemSelected (MenuItem item){
	8) creamos una variable de tipo int que nos permita obtener cual fue el item seleccionado:         int id = item.getItemId();
		9) creamos una serie de if y else donde la condicion sea:         if (id == R.id.item1){
			10) mandaremos un Toast en cada if o if else diciendo que opcion presiono
	11) retornamos el valor booleano:         return super.onOptionsItemSelected(item);



VIDEO 45: 
actionButtons

*actionButtons: aparecen directamente en la actionBar con un icono y/o texto, estos se utilizan en las acciones que no tienen espacio para aparecer dentro del ActionBar o no son lo suficientemente importantes 

** las medidas de los iconos que usaremos para los actionButtons deben ser de 24x24pixeles, ademas que el nombre debe ir todo en minusculas y no tener caracteres especiales

1) copiamos las imagenes que usaremos como iconos y las pegamos en drawable
2) creamos un nuevo Android Resource File en la carpeta res, el nombre no importa , pero en Resource type debemos escojer Menu, finalmente damos en ok
	3) arrastramos un MenuItem al actionBar y le ponemo un id y en el atributo icon lse ponemos la imagen que agregamos anteriormente, sin embargo el icono aun no se mostrara
	3.1) para mostrar el icono debemos ir al atributo showAsAction y ponemos la opcion: always
	4) repetimos el paso 3 para el 2do actionButton
	5) y para poner un MenuOverFlow solo hay que añadir un MenuItem y quitar el valor always del atributo showAsAction, y añadimos otra opcion(o item) de la misma forma
	6) le damos texto a los componentes mediante el archivo strings.xml en su atributo Title
	7) para quitar las advertencias de los componentes MainItem que usaremos como ActionBar debemos seleccionar el primer MenuItem que dejamos como MenuOverFlow y en su atributo showAsAction ponemos: ifRoom
		8) pasamos a la parte logica: .java y fuera del metodo onCreate vamos a crear un metodo para mostrar y ocultar los ActioButtons y las opciones del MenuOverFlow
			9) metodo booleano y el nombre debe ser onCreateOptionsMenu para que funcione, el parametro debe ser un objeto de la clase Menu:     public boolean onCreateOptionsMenu (Menu menu){
			10)mostramos el menu con el metodo .inflate y mostramos la ruta de nuestro menu: getMenuInflater().inflate(R.menu.menuacciones, menu);
			11) regresamos un valor booleano:         return true;
		12) creamos un metodo para las funciones de nuestros botones: el metodo sera booleano y el nombre debe ser onOptionsItemSelected para que funcione, el parametro debe ser un objeto de la clase MenuItem:     public boolean onOptionsItemSelected (MenuItem item){
		13) recuperar los id que le asignamos a nuestros botones y para eso usaremos una variable int
        int id = item.getItemId();
        14) estructuras if else segun el boton que halla sido presionado
        if (id == R.id.compartir){
            Toast.makeText(this,"Compartir",Toast.LENGTH_SHORT).show();
        15)regresamos el valor booleano: return true;// y asi para todos los botones
        16) fuera de las estructuras ir else retornamos a la clase mediante un super el objeto MenuItem:         return super.onOptionsItemSelected(item);



VIDEO 46:
camara de los dispositivos android - tomar fotos

1) copiamos las imagenes que usaremos y las pegamos dentro del directorio drawable
2) creamos un imageView y le ponemos la imagen para fotos y creamos un imageButton con la imagen para camara, blue print
3) para que el boton muestr su fondo transparente debemos buscar el atributo background y en la seccion color / android seleccionamos un fondo transparente
4) para quitar los warning debemos darle una descripcion mediante el archivo strings.xml
5) agregamos los id, en este caso como solo hay 2 controlles y son diferentes entre si no hace falta cambiarle el id
	6) vamos al manifest y agregamos 2 lineas de codigo, el primero nos da acceso a la camara y la 2da nos da permiso para guardar las imagenes en el dispositivo, estas lineas se colocan antes de la etiqueta application: <uses-feature android:name="android.hardware.camera" android:required="true"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    7) colocamos una ultima linea de codigo entre el cierre de etiqueta de activity y el cierre de etiqueta de: application: 
    <provider
            android:name="android.support.v4.content.FileProvider"
            android:authorities="com.example.android.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/file_paths">
            </meta-data>
        </provider>
    8) aqui puedes buscar la documentacion de android donde ecplica el codigo del paso 7: https://developer.android.com/training/camera/photobasics
    9) basicamente el paso 7 nos permite tener acceso a la camara mediante un xml, @xml/file_paths este archivo nos permite poder indicarle a la app donde va a estar alojada la app en el dispositivo
    10) nos mostrara un error en @xml/file_paths, para solucionarlo solo debemos colocarnos encima y teclear alt+enter y seleccionamos crear el xml y damos en ok
//ahora pomemos la ruta que la app debe seguir para crear un backup
    	11) nos dirigimos al xml creado y vamos a la parte text y modificamos el codigo
    	12) justo abajo de la primera linea de codigo creamos una etiqueta llamada paths y dentro de paths copiamos el codigo que esta en la etiqueta preferences y lo pegamos dentro del codigo paths: 
    		13) entre las etiquetas paths colocamos donde se van a guardar las imagenes, para esto abrimos una etiqueta: external path
    			14) aqui colocamos el nombre directoryo donde pondremos las imagenes: name = "my images"
    			15) ahora ponemos la ruta donde se guardaran las imagenes, para poner el directorio debemos fijarnos en lo que esta escrito en el package de nuestro mainActivity, iniciamos con la palabra Android porque es el directorio general de los dispositivos android y le decimos que entre a la carpeta data y despues colocamos la msma direccion que tiene nuestro package, una vez puesta toda la direccion podemos crear los directorios como queramos y fuera de las comillas cerramos las etiquetas////// con esto se quita el error anterior porque antes no existia el archivo pero ahora si
    16) vamos a la parte logica de la app y declaramos el objeto imageView:     private ImageView img;
    17) creamos la relacion entre la parte logica y la grafica y le hacemos un castin:         img = (ImageView)findViewById(R.id.imageView);
// documentacion de estas lineas de codigo: https://developer.android.com/training/camera/photobasics
    18) validamos los permisos: if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000);
        }
    	19) fuera del onCreate creamos el siguiente metodo para asignar nombres unicos a las fotos que guardemos: String mCurrentPhotoPath; 						private File createImageFile() throws IOException {
    	20) creamos el nombre de imagen con la fecha en la que fue tomada la foto:         String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    	21) creamos una variable string donde se guardara el nombre ocmpleto de la imagen:         String imageFileName = "Backup_" + timeStamp + "_";
    	22) guardamos el nombre dentro del directorio:         File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    	23) obtenemos el nombre creado, su extencion y la ruta:         File image = File.createTempFile(imageFileName, ".jpg", storageDir);
    	24) guardamos el path (la direccion donde se almacenara la foto)creado previamente:	mCurrentPhotoPath = image.getAbsolutePath();
    	25) retorna el nombre y la ruta donde se almacenara la imagen: 		return image;
    //creamos el metodo que tomara la foto y generara el archivo .jpg (el que guardara la foto como imagen en el dispositivo)
   	26) hacemos el metodo publico: 			static final int REQUEST_TAKE_PHOTO = 1;		 public void tomarFoto(View view) {
   	27) cerramos de manera momentanea el activity actual para poner el activity de la camara:         Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
   	28) verifica si ya se tomo la foto:         if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
   	29) crea un objeto de tipo File y le asigna un valor de tipo nulo: 		File photoFile = null;
   	30) ponemos un try catch para ejecutar el siguiente metodo y el catch para recivir cualquier error: try {
        31)recupera el nombre y la ruta de donde se va a guardar la imagen: 	photoFile = createImageFile();
        32)agarra cualquier error:	 } catch (IOException ex) {}
    33) ponemos un if donde la condicion sea:             if (photoFile != null) {// dice que si sea tomado una foto que haga lo siguiente
    34) obtenemos la uri (url paraandroid) donde sera guardada la foto:                 Uri photoURI = FileProvider.getUriForFile(this,"com.example.android.fileprovider", photoFile);
    35) aqui toma la imagen para crear el archivo: 	takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
    36) crea el archivo: 		startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);// y cerramos las llaves: }}}
//creamos el metodo que pondra la foto dentro del imageView
    		37) vamos a sobreescribir un metodo por lo que solo se puede llamar el metodo de esta forma: static final int REQUEST_IMAGE_CAPTURE = 1;			 @override		 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    		38) la foto que fue tomada se mostrara en el imageView: 										if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            //la foto que se tome se mostrara dentro de este imageView
            img.setImageBitmap(imageBitmap);
            38) cerramos las llaves: }}
        


VIDEO 47:
grabacion de video en Android Studio

* documentacion de los codigos empleados se encuentran en este link: https://developer.android.com/training/camera/videobasics

1) copiamos la imagen que usaremos y la pegamos dentro de drawable
2) ponemos in imageButton con la imagen que acabamos e agregar al proyecto
3) hacemos transparente el fondo del boton con el atributo background en la opcion colores / trasparent y le asignamos una descripcion mediante un Strngs.xml
	4) vamos a lmanifest e incluimos los permisos que usaremos 1ro para poder guardar elementos dentro del dispositivo y el 2do para poder usar el hardware de la camara del dispositivo: <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-feature android:name="android.hardware.camera" android:required="true"/>
    	5) vamos a la parte logica y ponemos el siguiente codigo para la validacion de permisos dentro del onCreate: if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000);
	}
		6) copiamos y pegamos el siguiente codigo fuera del onCreate: static final int REQUEST_VIDEO_CAPTURE = 1;

    public void GrabarVideo(View view) {
        7)invoca el activiti que nos permite tener acceso a la camara
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        8)verifica si se tomo video
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            9)retorna al activity original
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);}}
    10) vamos al atributo onClick del imageButton y le asignamos el metodo creado



VIDEO 48:
aplicaciones con diseño adaptable

* diseño adaptable (responsive design): consiste en el desarrollo de apps que adapten su apariencia al dispositivo donde se esten ejecutando, los dispositivos android tienen diferentes tamaños de pantalla y dimenciones, por eso debemos usar el diseño adaptable y asi mejorar la experiencia del usuario
** esta solo es 1 alternativa de diseño adaptable, hay muchas mas y mejores 

1) vamos a la parte de text de la parte grafica 
2)modificamos la etiqueta de constraintLayout, la borramos toda y ponemos: RelativeLayout
3) volvemos a la vista design y ponemos los componentes necesarios: Plain text (las distancias a los bordes se ponen automaticamente) tambien tenemos un nuevo boton que nos permite cambiar el tamaño de pantalla que estamos emulando
4) agregamos un boton, un editText de tipo Multitext y nos dirigimos al atributo text del Multitext y le asignamos un texto mediante el strings.xml
5) agregamos 3 botones mas, abajo de todo en forma de columnas
6) no importa con que tamaño de pantalla pongamos en nuestra app, esta se modificara para quedar lo mejor posible

//ahora haremos que aunque el dispositivo de vuelta que la app no rote con el celular
7) vamos al archivo manifest y buscamos esta linea de codigo: activity android:name=".MainActivity" // y le añadimos antes de cerrar la etiqueta el siguiente codigo:             android:screenOrientation="portrait">
8) con eso anterior indicamos a nuestra app que no queremos que se rote la app y se mantenga en modo retrato (vertical)



EXTRA 00:
lector de codigos de barra y qr

* intento 1: https://www.youtube.com/watch?v=wnOj5LCAlcI

** intento 2: https://www.youtube.com/watch?v=W6-kK6tAML4



EXTRA 01:
configurando el retrofit para consumir servicios web

* json: es una respuesta de la parte web y viene con un arreglo de objetos 

** endPoint: son las palabras despues del slash en las url, ejemplo: http://intranet01.ucad.edu.mx/home/alumno/index //// aqui el ultimo endPoint seria: index

1) validamos la respuesta del json en la pagina: https://jsonlint.com/
1.1) para validarlos debemos copiar nuestro json y pegarlo en esta pagina, posteriormente damos click al boton: validate JSON
1.2) en el mismo lugar donde pegamos el JSON se mostrara como esta mandando el contenido del JSON, de esta forma veerificaremos si hay un error

2) nos dirigimos al build.gradle (Module: app) y añadimos 2 dependencias:
'com.squareup.retrofit2:retrofit:2.1.0'
'com.squareup.retrofit2:converter-gson:2.1.0'
* la version de retrofit y del converter-gson deben ser las mismas o mandara error

3) vamos al manifest y agregamos el permiso para acceder al internet: uses-permission android:name="android.permission.INTERNET"

4) vamos a la carpeta que almacena nuestro MainActivity y creamos una nueva Java Class, se puede llamar como sea pero en la opcion: Kind: seleccionamos Interface

5) en esta clase que creamos vamos a meter todos los metodos para los **endPoint que usaremos en nuestra app

	6) en este caso nuestro endPoint contiene un array de objetos en JavaScrip, por esta razon debemos convertirlo a Java (pojo ó entiti) de la siguiente forma:

	7) vamos a la pagina: http://www.jsonschema2pojo.org/
	8) pegamos nuestro json 
	8.1) le ponemos un nombre (el que sea)
	8.2) Source Type: JSON
	8.3) Anotation Style: none
	8.4) marcamos las siguientes opciones: Use primitive types // Use double numbers // Iclude getters and setters // Incude constructors
	8.4) y quitamos la marca en: Allow additional propieties
	9) y damos click en preview, se abrira una ventana y va a generar la clase java que necesitamos, la copemos copiar o descargar
	10) creamos otra clase dentro de la misma carpeta con el mismo nombre que tiene la clase que genero la pagina, ademas el Kind: sera: class
	11) y ponemos dentro todo el contenido de la clase generada por la pagina

//con esto obtenemos el objeto que mandara la respuesta del servicio web a la app

12) regresamos al archivo interface de tipo java que creamos en el paso 4

//*** 
13) llamamos al metodo get y colocamos el nombre del endPoint:
    @GET("usersFake")

14) y llamamos a la clase que recibe el servicio, en este caso mediante una Lista de objetos, porque el servicio contiene una Lista de objetos:
    Call<List<ResponseService>> getUsersGet();
// haremos lo mismo que con el get pero ahora llamamos el metodo @POST, la siguiente liena de codigo queda igual que la del metodo anterior
15) ahora usamos el metodo Post:    @POST("usersFake") // y repetimos el paso 14

// haremos la relacion sincrona
	16) vamos al MainActivity y creamos un metodo fuera del onCreate y el nombre del metodo puede ser el que sea y se le pone un extends AsincTask



/////////////////////////////////////////////



EXTRA 02:
retrofit: get y post

* curso de retrofit, casi 1 hora de videos: https://www.youtube.com/watch?v=BF7bqxWDnws

//repositorio del curso: https://github.com/David-Hackro/AndroidTutorials/tree/master/%23AndroidTutorials_Retrofit

//documentacion del curso: 
//..https://square.github.io/retrofit/
//..https://square.github.io/retrofit/2.x/retrofit/
//..https://github.com/google/gson

	VIDEO 1:

	* Retrofit es una libreria desarrollada por square y sirve para hacer peticiones http a los servicios, ter permite hacer peticiones sincronas y asincronas, las implementaciones que se usaran no son las mas eficientes pero serviran para entender el codigo 

	1) 





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Fragments:

* un fragment necesita un activity para vivir y el mismo fragment se puede usar en diferentes activitys y tambien se pueden usar multiples fragments en una sola activity para 	crear uan UI multipanel 

** el fragment debe ser totalmente independiente de contextos o acciones para que se pueda utilizar en varios activitys, para entender mejor lo podemos ver como un widget dentro de nuestro activity

*** podemos pensar en un fragmento como una seccion modular de una activity que tiene su ciclo de vida propio, muy similar al de los activitys

**** recibe sus propios eventos de entrada y puedes agregar o quitar mientras esta el activity se esta ejecutando

***** para comunicarse entre fragments se hace mediante la activity que contiene los fragments

****** una ventaja de usar fragments es: aunque en dispositivos moviles para mano (HandSet) no sea necesario los fragments para tablets si sera necesario, ya que en caso contrario debera crearse una 3ra activity y clonar el codigo ahi para poder renderizar

Parte1:

1) vamos a la carpeta que almacena nuestro MainActivity y creamos 2 paquetes nuevos: fragments y activitys, meteremos nuestro activity en el package activitys

2) vamos al package fragments y le damos click derecho new / fragment / fragment (blank)

3) el nombre le ponemos el que sea, seleccionamos: create Layout xml// para obtener una vista asociada al fragment

4) quitamos la seleccion en: include fragment factory methods? // y quitamos :// include interface callbacks? // este ultimo establece la conexion entre el activity y el fragment (porque en esta situacion vamos a agregarlos nosotros mismos)

5) una ves creado el fragment esperamos a que se cordine y vamos al metodo onCreateView y pondremos una linea de codigo despues de la llave de apertura de la clase: 				View view = inflater.inflate(R.layout.fragment_details, container, false); // esta linea de codigo hace lo mismo que la ultima linea de codigo del metodo onCreateView, pero lo mevemos arriba para poder ingresar metodos y codigo dentro del metodo onCreateView

	6) vamos al mainActivity.java y vamos a declarar los fragments

	7) vamos a la linea de codigo donde la clase MainActivity es declarada y justo despues de la palabra reservada extends cambiamos el appCompatActivity y le ponemos FragmentActivity

		8) vamos al xml del MainActivity y cambiamos el RelativeLayout y le ponemos un LinearLayout 
		8.1) borramos las 4 lineas de codigo que dicen padding
		8.2) borramos la linea que le da id al layout porque no lo vamos a usar
		8.3) y le ponemos la orientacion vertical justo debajo de Layout_height //vertical para poder usar la parte superior para un fragment y la mitad inferior para el otro fragment
		8.4) borramos el hello world

		9) añadimos un fragment: donde su tamaño en width sera match_parent y en height sera odp
		9.1) le ponemos el atributo: layout_weight "50"

		10) llamamos al layout que usaremos, en este caso el fragent_data: tools:layout="@layout/fragment_data"

		11) y le ponemos un id:         android:id="@+id/dataFragment"

		12) hacemos lo mismo para el segundo fragment...
//tip: en weight tambien se pueden cambiar los 50 por 1 y tendra los mismos efectos ya que solo estamos dividiendo el activity a la mitad 

	13) vamos a los layout y entramos a nuestro fragment_data.xml y le ponemos un hello desde el data

14) corremos la app y veremos que la compilacion se detendra por un error que no marca el ide, y esto es porque en el Activity_Main.xml debajo del id le falta un: android:name=""








