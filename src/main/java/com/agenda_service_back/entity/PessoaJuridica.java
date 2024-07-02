package com.agenda_service_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class PessoaJuridica extends Pessoa{
    private static final long serialVersionUID = 1L;

    protected String cnpj;
    protected String razao_social;

    @OneToMany(mappedBy = "pessoaJuridica")
    protected List<Servico> servico = new ArrayList<>();

//    @OneToMany(mappedBy = "pessoaJuridica")
//    protected List<Telefone> telefone = new ArrayList<>();

    public PessoaJuridica() {
       super();
    }


    public PessoaJuridica(String cnpj, String razao_social) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
}

