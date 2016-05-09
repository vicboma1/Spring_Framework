package com.vicboma._002_Configuration_Bean;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioB implements Servicio {

    public static Servicio create() {
     return new ServicioB();
    }

    ServicioB() {
    }

    @Override
    public String toString() {
        return "Servicio B";
    }
}
