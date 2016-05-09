package com.vicboma._004_PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vicboma on 09/05/16.
 */
public class ManagerServicio {

    private List<Servicio_004> list;

    @Autowired
    private ServicioA_004 servicioA_004;

    @Autowired
    private ServicioB_004 servicioB_004;

    public static ManagerServicio create() {
        return new ManagerServicio();
    }

    ManagerServicio(){
    }

    @PostConstruct
    public void postConfigure() {
        this.list = Arrays.asList(servicioA_004, servicioB_004);
    }

    public void println() {
        for(int i = 0; list.size() > i; i++) {
            final Servicio_004 servicio = list.get(i);
            System.out.println(servicio.toString());
        }
    }
}
