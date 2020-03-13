package com.example.pruebatestv01.api;

import com.example.pruebatestv01.modelo.FotoPerrito;
import com.example.pruebatestv01.modelo.ListaRazasPerritos;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiPerritos {


    @GET("api/breeds/list/")
    Call<ListaRazasPerritos> getListaRazas();

    @GET("api/breed/{breed}/images/")
    Call<FotoPerrito> getListaImagenURL(@Path("breed") String breed);



}
