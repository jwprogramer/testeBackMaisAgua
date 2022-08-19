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
    private String tipoProblema_boletim;
    @Column(nullable = false)
    private int latitude_boletim;
    @Column(nullable = false)
    private int longitude_boletim;
    @Column(nullable = false)
    private String desc_boletim;

    public Long getId_boletim() {
        return id_boletim;
    }

    public void setId_boletim(Long id) {
        this.id_boletim = id;
    }
    public String getTipoProblema_boletim() {
        return tipoProblema_boletim;
    }

    public void setTipoProblema_boletim(String tipo) {
        this.tipoProblema_boletim = tipo;
    }

    public int getLatitude_boletim() {
        return latitude_boletim;
    }

    public void setLatitude_boletim(int latitude_boletim) {
        this.latitude_boletim = latitude_boletim;
    }

    public int getLongitude_boletim() {
        return longitude_boletim;
    }

    public void setLongitude_boletim(int longitude_boletim) {
        this.longitude_boletim = longitude_boletim;
    }
    public String getDesc_boletim() {
        return desc_boletim;
    }

    public void setDesc_boletim(String descricao) {
        this.desc_boletim = descricao;
    }

}
