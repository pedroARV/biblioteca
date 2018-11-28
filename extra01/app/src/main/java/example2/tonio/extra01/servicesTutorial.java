package example2.tonio.extra01;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface servicesTutorial {
    //consumiremos el servicio del ejemplo con un Get:

    //el metodo con el que lo llamaremos, en este caso get/parametro: colocamos el nombre del endPoint pero sin el slash
    @GET("usersFake")
    // normalmente se pone: Call<ResponseService>
    //pero como el json contiene un array (arreglo) de objetos debemos poner que recivira una lista de objetos
    // e importamos la libreria List
    // por ultimo le ponemos un nombre a nuestro metodo
    Call<List<ResponseService>> getUsersGet();


    //ahora consumiremos el servicios mediante un post:

    //llamamos al metodo con @POST / repetimos los pasos anteriores
    @POST("usersFake")
    Call<List<ResponseService>> getUsersPost();
}
