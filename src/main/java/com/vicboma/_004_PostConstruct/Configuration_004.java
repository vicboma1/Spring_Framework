package com.vicboma._004_PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_004 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    public Servicio_004 servicioA() {
        return ServicioA_004.create();
    }

    @Bean
    public Servicio_004 servicioB() {
        return ServicioB_004.create();
    }

    @Bean
    public ManagerServicio managerServicio() {
        return ManagerServicio.create();
    }

}
