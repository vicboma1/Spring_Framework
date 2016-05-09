package com.vicboma._008_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vicboma on 09/05/16.
 */
@Component("ServicioB_008")
public class ServicioB_008 implements Servicio_008_Print {

    @Autowired
    private String PRE;

    public static Servicio_008_Print create() {
     return new ServicioB_008();
    }

    ServicioB_008() {
    }

    public String toPrint() {
        return PRE+" B_008";
    }
}
