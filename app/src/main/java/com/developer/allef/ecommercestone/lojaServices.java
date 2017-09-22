package com.developer.allef.ecommercestone;

import com.developer.allef.ecommercestone.Model.produtosModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by allef on 21/09/2017.
 */

public interface lojaServices {
    /**
     * aqui estamos dando um get no caso seu post ficaria mais para baixo e depois so chamalo.
     * @return
     */

    @GET("products.json")
    Call<List<produtosModel>>listaProdutos();




}
