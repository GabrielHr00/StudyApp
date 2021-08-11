package com.example.schatzsuche;

import java.util.Vector;

public class Veranstaltung {
    // Instanzvariablen
    private String name, motivation, minimum, assessment;
    private int ECTS;
    private Vector<String> programme, vortragende, termine;

    // Konstruktor
    public Veranstaltung(String n, String mot, String min, String ass, int e, Vector<String> p, Vector<String> v, Vector<String> t) {
        name = n;
        motivation = mot;
        minimum = min;
        assessment = ass;
        ECTS = e;
        programme = p;
        vortragende = v;
        termine = t;
    }

    // Getter Methoden
    public String getName() {
        return name;
    }

    public String getMotivation() {
        return motivation;
    }

    public String getMinimum() {
        return minimum;
    }

    public String getAssessment() {
        return assessment;
    }

    public int getECTS() {
        return ECTS;
    }

    public Vector<String> getProgramme() {
        return programme;
    }

    public Vector<String> getVortragende() {
        return vortragende;
    }

    public Vector<String> getTermine() {
        return termine;
    }
}
