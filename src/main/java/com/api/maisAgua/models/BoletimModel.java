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
    private String token_boletim;
    @Column(nullable = false)
    private String tipoProblema_boletim;
    @Column(nullable = false)
    private float latitude_boletim;
    @Column(nullable = false)
    private float longitude_boletim;
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

    public String getToken_boletim() {
        return token_boletim;
    }

    public void setToken_boletim(String token_boletim) {
        this.token_boletim = token_boletim;
    }
    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipo) {
        this.tipoProblema_boletim = tipo;
    }

    public float getLatitude_boletim() {
        return latitude_boletim;
    }

    public void setLatitude_boletim(float latitude_boletim) {
        this.latitude_boletim = latitude_boletim;
    }

    public float getLongitude_boletim() {
        return longitude_boletim;
    }

    public void setLongitude_boletim(float longitude_boletim) {
        this.longitude_boletim = longitude_boletim;
    }
    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String descricao) {
        this.desc_boletim = descricao;
    }

}
