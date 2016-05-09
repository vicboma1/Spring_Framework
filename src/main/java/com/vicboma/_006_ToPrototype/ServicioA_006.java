package com.vicboma._006_ToPrototype;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA_006 {

    @Autowired
    private String PRE;

    public static ServicioA_006 create() {
        return new ServicioA_006();
    }

    ServicioA_006() {
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
