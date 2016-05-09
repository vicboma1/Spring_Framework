package com.vicboma._001_Hello_World_Arguments.model;

import java.io.Serializable;

/**
 * Created by vicboma on 09/05/16.
 */
public class Helloable implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String str;

    public static Helloable create(String str) {
        return new Helloable(str);
    }

    public Helloable(String str) {
        this.str = str;
    }

    public String get() {
        return this.str;
    }
}
