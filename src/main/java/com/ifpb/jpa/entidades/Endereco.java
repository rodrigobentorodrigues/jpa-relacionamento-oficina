
package com.ifpb.jpa.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable {
    
    private String rua;
    private String bairro;
    private String localizacao;
    
    public Endereco(){};
    
    public Endereco(String rua, String bairro, String local){
        this.rua = rua;
        this.bairro = bairro;
        this.localizacao = local;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
