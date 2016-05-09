package com.vicboma._005_PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PreDestroy;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA_005 {

    @Autowired
    private String PRE;

    public static ServicioA_005 create() {
        return new ServicioA_005();
    }

    ServicioA_005() {
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
