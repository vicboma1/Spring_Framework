package com.vicboma._003_AutoSettersAttributes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA_003 implements Servicio_003 {

    @Autowired
    private String PRE;

    public static Servicio_003 create() {
        return new ServicioA_003();
    }

    ServicioA_003() {
    }

    @Override
    public String toString() {
        return PRE+" A_003";
    }
}
