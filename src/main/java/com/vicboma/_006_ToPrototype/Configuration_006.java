package com.vicboma._006_ToPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_006 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    @Scope("prototype")
    public ServicioA_006 servicioA() {
        return ServicioA_006.create();
    }


}
