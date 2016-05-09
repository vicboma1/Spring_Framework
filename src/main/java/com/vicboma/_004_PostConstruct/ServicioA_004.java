package com.vicboma._004_PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA_004 implements Servicio_004 {

    @Autowired
    private String PRE;

    public static Servicio_004 create() {
        return new ServicioA_004();
    }

    ServicioA_004() {
    }

    @PostConstruct
    public void postConfigure() {
        System.out.println("@PostConstruct "+this.getClass().toString());
    }

    @Override
    public String toString() {
        return PRE+" A_004";
    }
}
