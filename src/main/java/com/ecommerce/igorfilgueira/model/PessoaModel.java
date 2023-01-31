package com.ecommerce.igorfilgueira.model;

import java.util.Date;

public class PessoaModel {
    private Long id;
    private String name;
    private String CPF;
    private String RG;
    private Date dataNascimento;
    private String estadoCivil;
    private Long telefone;
    private String email;


    public PessoaModel() {
    }

    public PessoaModel(Long id, String name, String CPF, String RG, Date dataNascimento, String estadoCivil, Long telefone, String email) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}