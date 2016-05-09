package com.vicboma._008_Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_008 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    public Servicio_008_toString servicioA() {
        return ServicioA_008.create();
    }

    @Bean
    public Servicio_008_Print servicioB() {
        return ServicioB_008.create();
    }

    @Bean
    public Mediator mediator() {
        return Mediator.create();
    }
}
