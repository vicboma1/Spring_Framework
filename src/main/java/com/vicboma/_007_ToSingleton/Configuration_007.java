package com.vicboma._007_ToSingleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by vicboma on 09/05/16.
 */
@Configuration
public class Configuration_007 {

    @Bean
    public String PRE() {
        return "Servicio";
    }

    @Bean
    @Scope("singleton") //Default
    public ServicioA_007 servicioA() {
        return ServicioA_007.create();
    }


}
