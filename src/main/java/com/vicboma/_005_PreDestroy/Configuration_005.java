package com.vicboma._005_PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_005 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    public ServicioA_005 servicioA() {
        return ServicioA_005.create();
    }

    @Bean
    public ServicioB_005 servicioB() {
        return ServicioB_005.create();
    }

}
