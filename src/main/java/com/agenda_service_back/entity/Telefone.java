package com.agenda_service_back.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String numero;
//    @ManyToOne
//    @JoinColumn(name = "pessoa_fisica_id")
//    protected PessoaFisica pessoaFisica;
//    @ManyToOne
//    @JoinColumn(name = "pessoa_juridica_id")
//    protected PessoaJuridica pessoaJuridica;

    @ManyToOne
    @JoinColumn (name = "pessoa_telefone")
    protected Pessoa pessoa;



    public Telefone() {
    }

    public Telefone(Integer id, String numero) {
        this.id = id;
        this.numero = numero;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(id, telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
