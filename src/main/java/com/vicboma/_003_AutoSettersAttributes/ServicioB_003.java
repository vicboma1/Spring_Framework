package com.vicboma._003_AutoSettersAttributes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioB_003 implements Servicio_003 {

    @Autowired
    private String PRE;

    public static Servicio_003 create() {
     return new ServicioB_003();
    }

    ServicioB_003() {
    }

    @Override
    public String toString() {
        return PRE+" B_003";
    }
}
