package com.rain.code;


import com.rain.code.Model.CodeModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 */
public interface CodeService {

    @GET("1151-2")
    Call<CodeModel> getResult(@Query("appid") int id, @Query("secret") String secret, @Query("zip") String zip);

}