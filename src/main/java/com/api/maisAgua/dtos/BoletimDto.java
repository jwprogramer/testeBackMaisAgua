package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BoletimDto {

    @NotBlank
    private String tipoProblema_boletim;
    @NotNull
    private int latitude_boletim;
    @NotNull
    private int longitude_boletim;
    @NotBlank
    private String desc_boletim;

    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipoProblema_boletim) {
        this.tipoProblema_boletim = tipoProblema_boletim;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String desc_boletim) {
        this.desc_boletim = desc_boletim;
    }

    public int getLongitude_boletim() {
        return longitude_boletim;
    }

    public void setLongitude_boletim(int longitude_boletim) {
        this.longitude_boletim = longitude_boletim;
    }

    public int getLatitude_boletim() {
        return latitude_boletim;
    }

    public void setLatitude_boletim(int latitude_boletim) {
        this.latitude_boletim = latitude_boletim;
    }
}
