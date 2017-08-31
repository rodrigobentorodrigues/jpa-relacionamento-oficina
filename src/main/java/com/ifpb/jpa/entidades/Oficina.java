package com.ifpb.jpa.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Oficina implements Serializable {

    @Id
    @GeneratedValue
    private int ID;
    @Embedded
    private Endereco endereco;
    private double saldo;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "oficina_id")
    private List<Funcionario> funcionarios;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "oficina_id")
    private List<Conserto> consertos;

    public Oficina() {
        this.consertos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public Oficina(Endereco endereco, double saldo) {
        this();
        this.endereco = endereco;
        this.saldo = saldo;
    }
    
    public boolean addFuncionario(Funcionario f){
//        f.setOficina(this);
        return funcionarios.add(f);
    }
    
    public boolean removeFuncionario(Funcionario f){
//        f.setOficina(this);
        return funcionarios.remove(f);
    }
    
    public boolean addConserto(Conserto c){
        return consertos.add(c);
    }
    
    public boolean removeConserto(Conserto c){
        return consertos.remove(c);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
