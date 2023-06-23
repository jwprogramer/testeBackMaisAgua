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
    private String token_user;
    @Column(nullable = false)
    private String tipoProblema_boletim;

    @Column(nullable = false)
    private String tipo_boletim;

    @Column(nullable = false)
    private String logradouro_boletim;

    @Column(nullable = false)
    private String bairro_boletim;

    @Column(nullable = false)
    private String cidade_boletim;

    @Column(nullable = false)
    private String cep_boletim;
    @Column(nullable = false)
    private String desc_boletim;
    @Column(nullable = false)
    private int previsao_boletim;

    public int getPrevisao_boletim() {
        return previsao_boletim;
    }

    public void setPrevisao_boletim(int previsao_boletim) {
        this.previsao_boletim = previsao_boletim;
    }

    public Long getId_boletim() {
        return id_boletim;
    }

    public void setId_boletim(Long id) {
        this.id_boletim = id;
    }

    public String getToken_user() {
        return token_user;
    }

    public String getTipo_boletim() {
        return tipo_boletim;
    }

    public void setTipo_boletim(String tipo_boletim) {
        this.tipo_boletim = tipo_boletim;
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

    public String getCep_boletim() {
        return cep_boletim;
    }

    public void setCep_boletim(String cep_boletim) {
        this.cep_boletim = cep_boletim;
    }

    public void setToken_user(String token_user) {
        this.token_user = token_user;
    }
    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipo) {
        this.tipoProblema_boletim = tipo;
    }

    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String descricao) {
        this.desc_boletim = descricao;
    }

}
