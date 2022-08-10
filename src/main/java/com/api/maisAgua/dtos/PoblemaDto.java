package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;

public class PoblemaDto {

    @NotBlank
    private String tokenProblema;
    private Boolean statusProblema;
    @NotBlank
    private String tipo_problema;
    @NotBlank
    private String latitudeProblema;
    @NotBlank
    private String longitudeProblema;
    @NotBlank
    private String desc_problema;

    public String getTipo_problema() {
        return tipo_problema;
    }

    public void setTipo_problema(String tipo_problema) {
        this.tipo_problema = tipo_problema;
    }

    public String getLatitude() {
        return latitudeProblema;
    }

    public void setLatitude(String latitude) {
        this.latitudeProblema = latitude;
    }

    public String getLongi() {
        return longitudeProblema;
    }

    public void setLongi(String longi) {
        this.longitudeProblema = longi;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String desc_problema) {
        this.desc_problema = desc_problema;
    }

    public String getTokenProblema() {
        return tokenProblema;
    }

    public void setTokenProblema(String tokenProblema) {
        this.tokenProblema = tokenProblema;
    }

    public Boolean getStatusProblema() {
        return statusProblema;
    }

    public void setStatusProblema(Boolean statusProblema) {
        this.statusProblema = statusProblema;
    }
}
