package com.developer.allef.ecommercestone.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by allef on 21/09/2017.
 */

public class produtosModel {


    /**
     * Nome dos atributos precisa ser igual nome dos atributos da Api
     * para serem parseados .
     */

@SerializedName("title")
    String titulo;
@SerializedName("price")
    Double valor;
@SerializedName("zipcode")
    String cep;
@SerializedName("seller")
    String loja;
@SerializedName("thumbnailHd")
    String urlFoto;
@SerializedName("date")
    String data;


    public produtosModel() {
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
