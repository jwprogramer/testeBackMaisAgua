package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;

public class BoletimDto {

    @NotBlank
    private String tipoProblema_boletim;
    @NotBlank
    private String latitudeBoletim;
    @NotBlank
    private String longitudeBoletim;
    @NotBlank
    private String desc_boletim;

    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipoProblema_boletim) {
        this.tipoProblema_boletim = tipoProblema_boletim;
    }

    public String getLatitudeBoletim() {
        return latitudeBoletim;
    }

    public void setLatitudeBoletim(String latitudeBoletim) {
        this.latitudeBoletim = latitudeBoletim;
    }

    public String getLongitudeBoletim() {
        return longitudeBoletim;
    }

    public void setLongitudeBoletim(String longitudeBoletim) {
        this.longitudeBoletim = longitudeBoletim;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String desc_boletim) {
        this.desc_boletim = desc_boletim;
    }
}
