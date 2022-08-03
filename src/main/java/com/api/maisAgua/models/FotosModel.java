package com.api.maisAgua.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name ="tb_fotos")
public class FotosModel implements Serializable {

    private static final long serialVersionUID = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String foto;

    @ManyToOne
    @JoinColumn(name = "id_problema")
    @Column(nullable = false)
    private ProblemaModel problemaModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
