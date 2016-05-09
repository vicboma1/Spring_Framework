package com.vicboma._002_Configuration_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_002 {

    @Bean
    public Servicio servicioA() {
        return ServicioA.create();
    }

    @Bean
    public Servicio servicioB() {
        return ServicioB.create();
    }
}
