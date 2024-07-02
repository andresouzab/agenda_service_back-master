package com.agenda_service_back.DTO;

import com.agenda_service_back.entity.Agendamento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServicoDTO implements Serializable{
        private static final long serialVersionUID = 1L;

        protected Integer id;
        @NotNull(message = "O campo NOME é requerido")
        protected String nome;
        @NotNull(message = "O campo PREÇO é requerido")
        protected Double preco;
        @NotNull(message = "O campo DESCRIÇÃO é requerido")
        protected String descricao;
        protected String informacoes_extras;
        @NotNull(message = "O campo STATUS é requerido")
        protected String status;
        protected Integer categoria_id;
        protected Integer pessoaJuridica_id;
        private List<Agendamento> agendamento = new ArrayList<>();

        public ServicoDTO(Integer id, String nome, Double preco, String descricao, String informacoes_extras, String status, Integer categoria_id, Integer pessoaJuridica_id, List<Agendamento> agendamento) {
                this.id = id;
                this.nome = nome;
                this.preco = preco;
                this.descricao = descricao;
                this.informacoes_extras = informacoes_extras;
                this.status = status;
                this.categoria_id = categoria_id;
                this.pessoaJuridica_id = pessoaJuridica_id;
                this.agendamento = agendamento;
        }

        public ServicoDTO() {

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

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public String getInformacoes_extras() {
                return informacoes_extras;
        }

        public void setInformacoes_extras(String informacoes_extras) {
                this.informacoes_extras = informacoes_extras;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Integer getCategoria_id() {
                return categoria_id;
        }

        public void setCategoria_id(Integer categoria_id) {
                this.categoria_id = categoria_id;
        }

        public Integer getPessoaJuridica_id() {
                return pessoaJuridica_id;
        }

        public void setPessoaJuridica_id(Integer pessoaJuridica_id) {
                this.pessoaJuridica_id = pessoaJuridica_id;
        }

        public List<Agendamento> getAgendamento() {
                return agendamento;
        }

        public void setAgendamento(List<Agendamento> agendamento) {
                this.agendamento = agendamento;
        }
}
