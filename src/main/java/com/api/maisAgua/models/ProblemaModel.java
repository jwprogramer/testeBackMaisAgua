package com.api.maisAgua.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_problema")
public class ProblemaModel implements Serializable {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id_problema;

   @Column(nullable = false)
   private String token_problema;

   @Column(nullable = false)
   private Boolean status_problema;

   @Column(nullable = false)
   private String tipo_problema;

   @Column(nullable = false)
   private float latitude_problema;

   @Column(nullable = false)
   private float longitude_problema;

   @Column(nullable = false)
   private String desc_problema;

    public Date getDatahora_problema() {
        return datahora_problema;
    }

    public void setDatahora_problema(Date datahora_problema) {
        this.datahora_problema = datahora_problema;
    }

    @Column(nullable = false)
   private Date datahora_problema;

   @OneToMany()
   @JoinColumn(name = "id_foto")
   private List<FotosModel> listaFotos;

    public Long getId_problema() {
        return id_problema;
    }

    public void setId_problema(Long id_problema) {
        this.id_problema = id_problema;
    }
    public String getTipo_problema() {
        return tipo_problema;
    }

    public void setTipo_problema(String tipoProblema) {
        this.tipo_problema = tipoProblema;
    }

    public float getLatitude_problema() {
        return latitude_problema;
    }

    public void setLatitude_problema(float lat) {
        this.latitude_problema = lat;
    }

    public float getLongitude_problema() {
        return longitude_problema;
    }

    public void setLongitude_problema(float longi) {
        this.longitude_problema = longi;
    }

    public String getDesc_problema() {
        return desc_problema;
    }

    public void setDesc_problema(String descricao) {
        this.desc_problema = descricao;
    }

    public String getToken_problema() {
        return token_problema;
    }

    public void setToken_problema(String tokenn) {
        this.token_problema = tokenn;
    }

    public Boolean getStatus_problema() {
        return status_problema;
    }

    public void setStatus_problema(Boolean status) {
        this.status_problema = status;
    }

}
