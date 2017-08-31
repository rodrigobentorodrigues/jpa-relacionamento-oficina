
package com.ifpb.jpa.main;

import com.ifpb.jpa.entidades.Conserto;
import com.ifpb.jpa.entidades.Endereco;
import com.ifpb.jpa.entidades.Funcionario;
import com.ifpb.jpa.entidades.Oficina;
import com.ifpb.jpa.infra.Dao;

public class Loader {

    public static void main(String[] args) {
//        Conserto con = new Conserto(6000);
//        Oficina o = new Oficina(new Endereco("AAAA", "BBBB", "CCCC"), 18000);
//        Funcionario f = new Funcionario("222-222", "222-555", 3000, Funcionario.funcao.Empregado);
//        o.addFuncionario(f);
//        con.setFuncionario(f);
//        con.setOficina(o);
        Dao dao = new Dao();
//        dao.add(con);
        dao.remove(1);
    }
    
}
