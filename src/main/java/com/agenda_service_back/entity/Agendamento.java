package com.agenda_service_back.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Agendamento implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected LocalDate data_inicio;
    protected LocalDate data_fim;
    @Null
    protected String observacao;
    @ManyToOne
    @JoinColumn(name = "servico_id")
    protected Servico servico;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "pessoa_fisica_id")
    protected PessoaFisica pessoaFisica;


    public Agendamento() {
    }

    public Agendamento(Integer id, LocalDate data_inicio, LocalDate data_fim, String observacao, Servico servico, PessoaFisica pessoaFisica) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.observacao = observacao;
        this.servico = servico;
        this.pessoaFisica = pessoaFisica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Servico getServico_id() {
        return servico;
    }

    public void setServico_id(Servico servico_id) {
        this.servico = servico_id;
    }

    public PessoaFisica getPessoaFisica_id() {
        return pessoaFisica;
    }

    public void setPessoaFisica_id(PessoaFisica pessoaFisica) {this.pessoaFisica = pessoaFisica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
