package com.vicboma._002_Configuration_Bean;

/**
 * Created by vicboma on 09/05/16.
 */
public class ServicioA implements  Servicio {

    public static Servicio create() {
        return new ServicioA();
    }

    ServicioA() {
    }

    @Override
    public String toString() {
        return "Servicio A";
    }
}
