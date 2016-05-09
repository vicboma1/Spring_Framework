package com.vicboma._003_AutoSettersAttributes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_003 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    public Servicio_003 servicioA() {
        return ServicioA_003.create();
    }

    @Bean
    public Servicio_003 servicioB() {
        return ServicioB_003.create();
    }
}
