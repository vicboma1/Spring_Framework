package com.vicboma._004_PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioB_004 implements Servicio_004 {

    @Autowired
    private String PRE;

    public static Servicio_004 create() {
     return new ServicioB_004();
    }

    ServicioB_004() {
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("@PostConstruct "+this.getClass().toString());
    }

    @Override
    public String toString() {
        return PRE+" B_004";
    }
}
