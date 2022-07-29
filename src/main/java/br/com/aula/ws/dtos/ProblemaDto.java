package br.com.aula.ws.dtos;

import javax.validation.constraints.NotBlank;

public class ProblemaDto {

    @NotBlank
    private String tipo;
    @NotBlank
    private String lat;
    @NotBlank
    private String longi;
    @NotBlank
    private String descricao;
}
