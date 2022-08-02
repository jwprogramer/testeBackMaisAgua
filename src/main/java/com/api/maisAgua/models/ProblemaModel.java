package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "problema")
public class ProblemaModel implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id_problema;

   @Column()
   private String tokenn;

   @Column()
   private Boolean status;

   @Column()
   private String tipo;

   @Column()
   private String lat;
   @Column()
   private String longi;
   @Column()
   private String descricao;

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
