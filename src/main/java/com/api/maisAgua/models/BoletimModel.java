package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_boletim")
public class BoletimModel implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_boletim;

    @Column(nullable = false)
    private String token_user_boletim;

    @Column(nullable = false)
    private String tipo_problema_boletim;

    @Column(nullable = false)
    private String logradouro_boletim;

    @Column(nullable = false)
    private String bairro_boletim;

    @Column(nullable = false)
    private String cidade_boletim;

    @Column(nullable = false)
    private String estado_boletim;
    @Column(nullable = false)
    private String cep_boletim;
    @Column(nullable = false)
    private String desc_boletim;
    @Column(nullable = false)
    private String previsao_boletim;

    public String getPrevisao_boletim() {
        return previsao_boletim;
    }

    public void setPrevisao_boletim(String previsao_boletim) {
        this.previsao_boletim = previsao_boletim;
    }

    public Long getId_boletim() {
        return id_boletim;
    }

    public void setId_boletim(Long id) {
        this.id_boletim = id;
    }

    public String getToken_user_boletim() {
        return token_user_boletim;
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

    public void setCidade_boletim(String cidade_boletim) {
        this.cidade_boletim = cidade_boletim;
    }

    public String getEstado_boletim() {
        return estado_boletim;
    }

    public void setEstado_boletim(String estado_boletim) {
        this.estado_boletim = estado_boletim;
    }

    public String getCep_boletim() {
        return cep_boletim;
    }

    public void setCep_boletim(String cep_boletim) {
        this.cep_boletim = cep_boletim;
    }

    public void setToken_user_boletim(String token_user_boletim) {
        this.token_user_boletim = token_user_boletim;
    }
    public String getTipo_problema_boletim() {
        return tipo_problema_boletim;
    }

    public void setTipo_problema_boletim(String tipo) {
        this.tipo_problema_boletim = tipo;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String descricao) {
        this.desc_boletim = descricao;
    }

}
