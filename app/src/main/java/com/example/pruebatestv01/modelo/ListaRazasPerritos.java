package com.example.pruebatestv01.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListaRazasPerritos {

    @SerializedName("message")
    private List<String> listaRazas;
    private String status;

    public List<String> getListaRazas() {
        return listaRazas;
    }

    public void setListaRazas(List<String> listaRazas) {
        this.listaRazas = listaRazas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
