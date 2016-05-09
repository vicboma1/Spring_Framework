package com.vicboma._009_Required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA_009 {

    @Autowired
    private String PRE;


    @Autowired
    @Required
    public Objectable objectable;

    public static ServicioA_009 create() {
        return new ServicioA_009();
    }

    ServicioA_009() {
    }

    @PostConstruct
    public void postConfigure() {
        System.out.println("@PostConstruct "+this.getClass().toString());
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("@PreDestroy "+this.getClass().toString());
    }

    @Override
    public String toString() {
        return PRE+" A_004";
    }



}
