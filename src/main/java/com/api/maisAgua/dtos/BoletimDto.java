package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BoletimDto {

    @NotBlank
    private String token_boletim;
    @NotBlank
    private String tipoProblema_boletim;
    @NotNull
    private float latitude_boletim;
    @NotNull
    private float longitude_boletim;
    @NotBlank
    private String desc_boletim;

    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipoProblema_boletim) {
        this.tipoProblema_boletim = tipoProblema_boletim;
    }

    public String getToken_boletim() {
        return token_boletim;
    }

    public void setToken_boletim(String token_boletim) {
        this.token_boletim = token_boletim;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String desc_boletim) {
        this.desc_boletim = desc_boletim;
    }

    public float getLongitude_boletim() {
        return longitude_boletim;
    }

    public void setLongitude_boletim(float longitude_boletim) {
        this.longitude_boletim = longitude_boletim;
    }

    public float getLatitude_boletim() {
        return latitude_boletim;
    }

    public void setLatitude_boletim(float latitude_boletim) {
        this.latitude_boletim = latitude_boletim;
    }
}
