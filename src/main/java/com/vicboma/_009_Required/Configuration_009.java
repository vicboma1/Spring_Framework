package com.vicboma._009_Required;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_009 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    public Objectable objectale() {
        return new Objectable();
    }


    @Bean
    @Scope("singleton") //Default
    public ServicioA_009 servicioA() {
        return ServicioA_009.create();
    }


}
