package com.api.maisAgua.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Optional;

@Entity(name ="tb_comentario")
public class ComentarioModel implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false)
    private Long id;

    @Column(nullable = false)
    private String texto_comentario;

    @Column(nullable = false)
    private String token_comentario;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "problema_id", nullable = false)
    private ProblemaModel problemaModel;

    public ComentarioModel() {
    }

    public ProblemaModel getProblemaModel() {
        return problemaModel;
    }

    public void setProblemaModel(ProblemaModel problemaModel) {
        this.problemaModel = problemaModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto_comentario() {
        return texto_comentario;
    }

    public void setTexto_comentario(String texto_comentario) {
        this.texto_comentario = texto_comentario;
    }

    public String getToken_comentario() {
        return token_comentario;
    }

    public void setToken_comentario(String token_comentario) {
        this.token_comentario = token_comentario;
    }

}
