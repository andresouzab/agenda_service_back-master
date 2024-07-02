package com.agenda_service_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class PessoaFisica extends Pessoa{
    private static final long serialVersionUID = 1L;
    protected String cpf;
    protected Date data_nascimento;

    @OneToMany (mappedBy = "pessoaFisica")
    protected List<Agendamento> agendamento = new ArrayList<>();
//    @OneToMany (mappedBy = "pessoaFisica")
//    protected List<Telefone> telefone = new ArrayList<>();


    public PessoaFisica() {
       super();
    }

    public PessoaFisica(String cpf, Date data_nascimento) {
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}

