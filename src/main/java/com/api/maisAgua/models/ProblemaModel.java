package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_problema")
public class ProblemaModel implements Serializable {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id_problema;

   @Column(nullable = false)
   private String tokenn;

   @Column(nullable = false)
   private Boolean status;

   @Column(nullable = false)
   private String tipo;

   @Column(nullable = false)
   private String lat;

   @Column(nullable = false)
   private String longi;

   @Column(nullable = false)
   private String descricao;

   @OneToMany()
   @JoinColumn(name = "id_comentario")
   @Column(nullable = true)
   private List<ProblemaModel> listaProblemas;

    public int getId() {
        return id_problema;
    }

    public void setId(int id) {
        this.id_problema = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTokenn() {
        return tokenn;
    }

    public void setTokenn(String tokenn) {
        this.tokenn = tokenn;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
