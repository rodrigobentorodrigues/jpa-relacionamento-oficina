
package com.ifpb.jpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String cpf;
    private String rg;
    private double salario;
    @Enumerated(EnumType.STRING)
    private funcao funcao;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, double salario, funcao funcao) {
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(funcao funcao) {
        this.funcao = funcao;
    }
    
    public enum funcao{
        Gerente,
        Empregado
    }
    
}
