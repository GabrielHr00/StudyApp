package com.example.schatzsuche;

import java.util.Vector;

public class Person {
    // Instanzvariablen
    private String name,image, mail, fax, officehours;
    private Vector<String> lehrveranstaltungen;

    // Konstruktor
    public Person(String n,String i, String m, String f, String o, Vector<String> lv) {
        name = n;
        image = i;
        mail = m;
        fax = f;
        officehours = o;
        lehrveranstaltungen = lv;
    }

    // Getter Methoden
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getMail() {
        return mail;
    }

    public String getFax() {
        return fax;
    }

    public String getOfficehours() {
        return officehours;
    }

    public Vector<String> getLehrveranstaltungen() {
        return lehrveranstaltungen;
    }
}
