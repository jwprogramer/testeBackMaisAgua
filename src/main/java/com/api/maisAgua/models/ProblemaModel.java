package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_problema")
public class ProblemaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_problema;

    @Column(nullable = false)
    private String token_user;

    @Column(nullable = false)
    private String tipo_problema;

    @Column(nullable = false)
    private String logradouro_problema;

    @Column(nullable = false)
    private String numero_rua_problema;

    @Column(nullable = false)
    private String bairro_problema;

    @Column(nullable = false)
    private String cidade_problema;

    @Column(nullable = false)
    private String estado_problema;

    @Column(nullable = false)
    private String cep_problema;

    @Column(nullable = false)
    private String desc_problema;

    //@Column(nullable = false)
    private Date datahora_problema;


    public Date getDatahora_problema() {
        return datahora_problema;
    }

    public void setDatahora_problema(Date datahora_problema) {
        this.datahora_problema = datahora_problema;
    }


    @OneToMany()
    @JoinColumn(name = "id_foto")
    private List<FotosModel> listaFotos;

    public Long getId_problema() {
        return id_problema;
    }

    public void setId_problema(Long id_problema) {
        this.id_problema = id_problema;
    }

    public String getTipo_problema() {
        return tipo_problema;
    }

    public String getNumero_rua_problema() {
        return numero_rua_problema;
    }

    public void setNumero_rua_problema(String numero_rua_problema) {
        this.numero_rua_problema = numero_rua_problema;
    }


    public String getLogradouro_problema() {
        return logradouro_problema;
    }

    public void setLogradouro_problema(String logradouro_problema) {
        this.logradouro_problema = logradouro_problema;
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

    public void setTipo_problema(String tipoProblema) {
        this.tipo_problema = tipoProblema;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String descricao) {
        this.desc_problema = descricao;
    }

    public String getToken_user() {
        return token_user;
    }

    public void setToken_user(String tokenn) {
        this.token_user = tokenn;
    }

}


