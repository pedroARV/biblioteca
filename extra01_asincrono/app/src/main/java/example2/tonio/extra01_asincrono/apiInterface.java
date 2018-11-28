package example2.tonio.extra01_asincrono;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface apiInterface {
    @GET("usersFake")
    Call<List<ResponseService>> getUsersGet();

    @POST("usersFake")
    Call<List<ResponseService>> getUsersPost();
}
