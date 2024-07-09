package com.agenda_service_back.DTO;

import com.agenda_service_back.entity.Pessoa;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class TelefoneDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;

    @NotNull(message = "O campo NUMERO é requerido")
    protected String numero;
    protected Pessoa pessoa;

    public TelefoneDTO(Integer id, String numero, Pessoa pessoa) {
        this.id = id;
        this.numero = numero;
        this.pessoa = pessoa;
    }
    public TelefoneDTO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
