package com.ifpb.jpa.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conserto implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    private double valor;
    
    @Temporal(value = TemporalType.DATE)
    @Convert(converter = ConversorData.class)
    private LocalDate data;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "func_id")
    private Funcionario funcionario;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Oficina oficina;

    public Conserto() {
        this.data = LocalDate.now();
    }

    public Conserto(double valor) {
        this();
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    //
    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return "Conserto{" + "id=" + id + ", valor=" + valor + ", data=" + data + ", funcionario=" + funcionario + ", oficina=" + oficina + '}';
    }
    
    

}
