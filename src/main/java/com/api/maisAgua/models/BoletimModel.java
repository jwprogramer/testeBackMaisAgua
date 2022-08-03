package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_boletim")
public class BoletimModel  implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_boletim;
    @Column(nullable = false)
    private String tipoProblema_boletim;
    @Column(nullable = false)
    private String latitudeBoletim;
    @Column(nullable = false)
    private String longitudeBoletim;
    @Column(nullable = false)
    private String desc_Boletim;

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

    public String getLatitudeBoletim() {
        return latitudeBoletim;
    }

    public void setLatitudeBoletim(String lat) {
        this.latitudeBoletim = lat;
    }

    public String getLongitudeBoletim() {
        return longitudeBoletim;
    }

    public void setLongitudeBoletim(String longi) {
        this.longitudeBoletim = longi;
    }

    public String getDesc_Boletim() {
        return desc_Boletim;
    }

    public void setDesc_Boletim(String descricao) {
        this.desc_Boletim = descricao;
    }

}
