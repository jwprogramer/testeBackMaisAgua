package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;

public class PoblemaDto {

    @NotBlank
    private String token_problema;
    private Boolean status_problema;
    @NotBlank
    private String tipo_problema;
    @NotBlank
    private String latitude_problema;
    @NotBlank
    private String longitude_problema;
    @NotBlank
    private String desc_problema;

    public String getTipo_problema() {
        return tipo_problema;
    }

    public void setTipo_problema(String tipo_problema) {
        this.tipo_problema = tipo_problema;
    }

    public String getLatitude() {
        return latitude_problema;
    }

    public void setLatitude(String latitude) {
        this.latitude_problema = latitude;
    }

    public String getLongi() {
        return longitude_problema;
    }

    public void setLongi(String longi) {
        this.longitude_problema = longi;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String desc_problema) {
        this.desc_problema = desc_problema;
    }

    public String getToken_problema() {
        return token_problema;
    }

    public void setToken_problema(String token_problema) {
        this.token_problema = token_problema;
    }

    public Boolean getStatus_problema() {
        return status_problema;
    }

    public void setStatus_problema(Boolean status_problema) {
        this.status_problema = status_problema;
    }
}
