package com.api.maisAgua.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name ="tb_fotos")
public class FotosModel implements Serializable {

    private static final long serialVersionUID = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_foto", nullable = false)
    private Long id_foto;

    @Column(nullable = false)
    private Byte foto;

    @ManyToOne
    @JoinColumn(name = "id_problema", nullable = false)
    private ProblemaModel problemaModel;

    public Long getId_foto() {
        return id_foto;
    }

    public void setId_foto(Long id_foto) {
        this.id_foto = id_foto;
    }

    public Byte getFoto() {
        return foto;
    }

    public void setFoto(Byte foto) {
        this.foto = foto;
    }

}
