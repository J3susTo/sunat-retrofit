package com.sunat.sunatretrofit.client;

import com.sunat.sunatretrofit.model.SunatResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SunatApiClient {
    @GET("ruc")
    Call<SunatResponse> getRuc(@Query("numero") String numero);

    @GET("ruc/full")
    Call<SunatResponse> getRucFull(@Query("numero") String numero);
}