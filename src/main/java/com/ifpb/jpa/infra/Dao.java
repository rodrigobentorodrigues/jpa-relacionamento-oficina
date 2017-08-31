
package com.ifpb.jpa.infra;

import com.ifpb.jpa.entidades.Conserto;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
    
    private EntityManager manager;
    private EntityTransaction transaction;
    
    public Dao(){
        this.manager = Persistence.
                createEntityManagerFactory("UPersistence").createEntityManager();
        this.transaction = manager.getTransaction();
    }
    
    public void add(Conserto con){
        transaction.begin();
        manager.persist(con);
        transaction.commit();
    }
    
    public void remove(int id){
        Conserto conserto = manager.find(Conserto.class, id);
        System.out.println(conserto.toString());
        transaction.begin();
        manager.remove(conserto);
        transaction.commit();
    }
    
}
