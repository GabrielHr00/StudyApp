package com.example.schatzsuche;

import java.util.ArrayList;
import java.util.Vector;

public class Studium {
    private String modul;
    private String name;
    private Vector<Veranstaltung> LVS;


    public Studium(String modul, String name, Vector<Veranstaltung> LVS) {
        this.modul = modul;
        this.name = name;
        this.LVS = LVS;

    }

    public String getName() {
        return name;
    }

    public String getModul() {
        return modul;
    }

    public Vector<Veranstaltung> getLVS() {
        return LVS;
    }

    @Override
    public String toString() {
        return "BachelorStudium{" +
                "modul='" + modul + '\'' +
                ", name='" + name + '\'' +
                ", LVS=" + LVS +
                '}';
    }
}