package com.api.maisAgua.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name ="tb_comentario")
public class ComentarioModel implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String textoComentario;

    @Column(nullable = false)
    private String tokenComentario;

    @ManyToOne
    @JoinColumn(name = "id_problema", nullable = false)
    private ProblemaModel problemaModel;

    public ProblemaModel getProblemaModel() {
        return problemaModel;
    }

    public void setProblemaModel(ProblemaModel problemaModel) {
        this.problemaModel = problemaModel;
    }

}
