package com.api.maisAgua.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class ComentarioDto {

    @NotBlank
    private String texto_comentario;

    @NotBlank
    private String token_comentario;

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
