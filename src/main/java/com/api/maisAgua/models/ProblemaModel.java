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
   private String tokenProblema;

   @Column(nullable = false)
   private Boolean statusProblema;

   @Column(nullable = false)
   private String tipoProblema;

   @Column(nullable = false)
   private String latitudeProblema;

   @Column(nullable = false)
   private String longitudeProblema;

   @Column(nullable = false)
   private String desc_problema;

   @OneToMany()
   @JoinColumn(name = "id_comentario")
   @JoinColumn(name = "id_foto")
   @Column(nullable = true)
   private List<ProblemaModel> listaProblemas;

    public int getId() {
        return id_problema;
    }

    public void setId(int id) {
        this.id_problema = id;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipo) {
        this.tipoProblema = tipo;
    }

    public String getLatitudeProblema() {
        return latitudeProblema;
    }

    public void setLatitudeProblema(String lat) {
        this.latitudeProblema = lat;
    }

    public String getLongitudeProblema() {
        return longitudeProblema;
    }

    public void setLongitudeProblema(String longi) {
        this.longitudeProblema = longi;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String descricao) {
        this.desc_problema = descricao;
    }

    public String getTokenProblema() {
        return tokenProblema;
    }

    public void setTokenProblema(String tokenn) {
        this.tokenProblema = tokenn;
    }

    public Boolean getStatusProblema() {
        return statusProblema;
    }

    public void setStatusProblema(Boolean status) {
        this.statusProblema = status;
    }
}
