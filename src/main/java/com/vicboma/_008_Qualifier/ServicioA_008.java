package com.vicboma._008_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vicboma on 09/05/16.
 */
@Component("ServicioA_008")
public class ServicioA_008 implements Servicio_008_toString {

    @Autowired
    private String PRE;

    public static Servicio_008_toString create() {
        return new ServicioA_008();
    }

    ServicioA_008() {
    }

    @Override
    public String toString() {
        return PRE+" A_008";
    }
}
