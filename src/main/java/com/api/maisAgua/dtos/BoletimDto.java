package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BoletimDto {

    @NotBlank
    private String token_user;
    @NotBlank
    private String tipoProblema_boletim;
    @NotBlank
    private String logradouro_boletim;

    @NotBlank
    private String bairro_boletim;
    @NotBlank
    private String cidade_boletim;

    @NotBlank
    private String estado_boletim;
    @NotBlank
    private String cep_boletim;

    @NotBlank
    private String desc_boletim;

    @NotBlank
    private float previsao_boletim;

    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipoProblema_boletim) {
        this.tipoProblema_boletim = tipoProblema_boletim;
    }

    public float getPrevisao_boletim() {
        return previsao_boletim;
    }

    public void setPrevisao_boletim(float previsao_boletim) {
        this.previsao_boletim = previsao_boletim;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String desc_boletim) {
        this.desc_boletim = desc_boletim;
    }

    public String getToken_user() {
        return token_user;
    }

    public void setToken_user(String token_user) {
        this.token_user = token_user;
    }

    public String getLogradouro_boletim() {
        return logradouro_boletim;
    }

    public void setLogradouro_boletim(String logradouro_boletim) {
        this.logradouro_boletim = logradouro_boletim;
    }


    public String getBairro_boletim() {
        return bairro_boletim;
    }

    public void setBairro_boletim(String bairro_boletim) {
        this.bairro_boletim = bairro_boletim;
    }

    public String getCidade_boletim() {
        return cidade_boletim;
    }

    public String getEstado_boletim() {
        return estado_boletim;
    }

    public void setEstado_boletim(String estado_boletim) {
        this.estado_boletim = estado_boletim;
    }

    public void setCidade_boletim(String cidade_boletim) {
        this.cidade_boletim = cidade_boletim;
    }

    public String getCep_boletim() {
        return cep_boletim;
    }

    public void setCep_boletim(String cep_boletim) {
        this.cep_boletim = cep_boletim;
    }
}
