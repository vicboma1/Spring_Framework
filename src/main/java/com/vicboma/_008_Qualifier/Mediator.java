package com.vicboma._008_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by vicboma on 09/05/16.
 */
public class Mediator {

    @Autowired
    //@Qualifier("ServicioA_008")
    private Servicio_008_toString servicioA;


    @Autowired
    //@Qualifier("ServicioB_008")
    private Servicio_008_Print servicioB;


    public static Mediator create() {
        return new Mediator();
    }


    Mediator(){

    }


    @PostConstruct
    public void PostConstruct() {
        System.out.println("PostConstruct Mediator");
    }

    @Override
    public String toString(){
        return servicioB.toPrint() +" "+servicioA.toString();
    }



}
