package com.agenda_service_back.DTO;

import com.agenda_service_back.entity.Endereco;
import com.agenda_service_back.entity.Telefone;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PessoaDTO implements Serializable{
        private static final long serialVersionUID = 1L;

        protected Integer id;

        @NotNull(message = "o campo NOME é requerido.")
        protected String nome;
        @NotNull(message = "o campo EMAIL é requerido.")
        protected String email;

        @NotNull(message = "o campo SENHA é requerido.")
        protected String senha;

        protected List<Telefone> telefone;

        protected Endereco endereco;

    public PessoaDTO(Integer id, String nome, String email, String senha, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }
    public PessoaDTO() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
