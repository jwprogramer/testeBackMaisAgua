package br.com.aula.ws.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Problema")
public class ProblemaModel implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Column(nullable = false)
   private String tipo;
   @Column(nullable = false)
   private String lat;
   @Column(nullable = false)
   private String longi;
   @Column(nullable = false)
   private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
