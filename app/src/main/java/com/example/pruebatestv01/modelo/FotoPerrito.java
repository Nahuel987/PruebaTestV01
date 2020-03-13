package com.example.pruebatestv01.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FotoPerrito {

    @SerializedName("message")
    private List<String> listaImagenURL;
    private String status;

    public List<String> getListaImagenURL() {
        return listaImagenURL;
    }

    public void setListaImagenURL(List<String> listaImagenURL) {
        this.listaImagenURL = listaImagenURL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
