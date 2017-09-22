package com.developer.allef.ecommercestone.remote;


import com.developer.allef.ecommercestone.lojaServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by allef on 21/09/2017.
 */

public class EndPoint {

    /**
     * URLS.
     * Essa no caso é a base da Api
     */
    private static final String UrlBase= "https://raw.githubusercontent.com/stone-pagamentos/desafio-mobile/master/";

    /**
     *  Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(UrlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Get API Service
     *
     * Rotas
     *
     * @return API Service  Interface que possui os Gets, Posts, Puts,Delets
     */
    public static lojaServices getApiService() {
        return getRetrofitInstance().create(lojaServices.class);
    }






}
