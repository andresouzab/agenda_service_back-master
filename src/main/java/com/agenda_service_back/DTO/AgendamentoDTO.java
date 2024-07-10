package com.agenda_service_back.DTO;

import com.agenda_service_back.entity.Pessoa;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

public class AgendamentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer id;
    @NotNull(message = "O campo DATA DE INICIO é requerido")
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected DateTimeFormat data_inicio;
    @NotNull(message = "O campo DATA FINAL é requerido")
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected DateTimeFormat data_fim;
    @NotNull(message = "O campo OBSERVAÇÃO é requerido")
    protected String observacao;
    protected Integer servico_id;

    protected Pessoa pessoa;


    public AgendamentoDTO() {

    }

    public AgendamentoDTO(Integer id, DateTimeFormat data_inicio, DateTimeFormat data_fim, String observacao, Integer servico_id, Pessoa pessoa) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.observacao = observacao;
        this.servico_id = servico_id;
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DateTimeFormat getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(DateTimeFormat data_inicio) {
        this.data_inicio = data_inicio;
    }

    public DateTimeFormat getData_fim() {
        return data_fim;
    }

    public void setData_fim(DateTimeFormat data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getServico_id() {
        return servico_id;
    }

    public void setServico_id(Integer servico_id) {
        this.servico_id = servico_id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}

