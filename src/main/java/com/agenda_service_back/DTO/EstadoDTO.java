package com.agenda_service_back.DTO;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class EstadoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;

    @NotNull(message = "o campo NOME é requerido.")
    protected String nome;
    @NotNull(message = "o campo UF é requerido.")
    protected String uf;


    public EstadoDTO() {

    }
    public EstadoDTO(Integer id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
