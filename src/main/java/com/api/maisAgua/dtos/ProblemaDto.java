package com.api.maisAgua.dtos;

import javax.validation.constraints.NotBlank;

public class ProblemaDto {
    @NotBlank
    private String token_user_problema;
    @NotBlank
    private String nome_user_problema;
    @NotBlank
    private String tipo_problema;
    @NotBlank
    private String logradouro_problema;
    @NotBlank
    private String numero_rua_problema;
    @NotBlank
    private String bairro_problema;
    @NotBlank
    private String cidade_problema;
    @NotBlank
    private String estado_problema;
    @NotBlank
    private String cep_problema;
    @NotBlank
    private String desc_problema;
    @NotBlank
    private String foto;

    public String getNome_user_problema() { return nome_user_problema; }

    public void setNome_user_problema(String nome_user_problema) { this.nome_user_problema = nome_user_problema; }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getToken_user_problema() {
        return token_user_problema;
    }

    public void setToken_user_problema(String token_user_problema) {
        this.token_user_problema = token_user_problema;
    }

    public String getTipo_problema() {
        return tipo_problema;
    }

    public void setTipo_problema(String tipo_problema) {
        this.tipo_problema = tipo_problema;
    }

    public String getLogradouro_problema() {
        return logradouro_problema;
    }

    public void setLogradouro_problema(String logradouro_problema) {
        this.logradouro_problema = logradouro_problema;
    }

    public String getNumero_rua_problema() {
        return numero_rua_problema;
    }

    public void setNumero_rua_problema(String numero_rua_problema) {
        this.numero_rua_problema = numero_rua_problema;
    }

    public String getBairro_problema() {
        return bairro_problema;
    }

    public void setBairro_problema(String bairro_problema) {
        this.bairro_problema = bairro_problema;
    }

    public String getCidade_problema() {
        return cidade_problema;
    }

    public void setCidade_problema(String cidade_problema) {
        this.cidade_problema = cidade_problema;
    }

    public String getEstado_problema() {
        return estado_problema;
    }

    public void setEstado_problema(String estado_problema) {
        this.estado_problema = estado_problema;
    }

    public String getCep_problema() {
        return cep_problema;
    }

    public void setCep_problema(String cep_problema) {
        this.cep_problema = cep_problema;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String desc_problema) {
        this.desc_problema = desc_problema;
    }

}
