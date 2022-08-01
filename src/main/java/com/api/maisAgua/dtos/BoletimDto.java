package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;

public class BoletimDto {

    @NotBlank
    private String tipo;
    @NotBlank
    private String lat;
    @NotBlank
    private String longi;
    @NotBlank
    private String descricao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
