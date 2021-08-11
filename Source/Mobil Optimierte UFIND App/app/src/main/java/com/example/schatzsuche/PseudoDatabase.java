package com.example.schatzsuche;

import java.util.Random;
import java.util.Vector;

public class PseudoDatabase {

    public Studium createMasterStudium(){
        Vector<Veranstaltung>lv = new Vector<>();
        String motivation = "Für die Lehrveranstaltung werden die Kenntnisse aus vorsemestrigen LV als bekannt vorausgesetzt. Diese werden vertieft und erweitert. \n" +
                "In der Vorlesung werden die Stoffinhalte in Form eines Frontalvortrags vermittelt. In den Übungseinheiten werden die erworbenen Kenntnisse praktisch umgesetzt, indem Lösungen zu vorgegebenen Problemstellungen gefunden werden.";
        String minimum = "Es finden über das Semester verteilt praktische Tests statt. " +
                "Diese sind als Präsenzveranstaltungen vor Ort zu absolvieren. Es sind dabei jeweils die bisher in den Übungen erarbeiteten Problemlösungen leicht zu ändern bzw. zu erweitern. " +
                "In jedem der Tests können bis zu 15 Punkte erreicht werden und es dürfen nur die von der LV-Leitung zur Verfügung gestellten, bzw. explizit freigegebenen Unterlagen verwendet werden.";
        String assessment = "Notwendige Bedingung für eine positive Beurteilung ist das Erreichen von insgesamt 100 Punkten, davon zumindest 25 Punkte bei der Abschlussklausur. Ist diese Voraussetzung erfüllt, so ergibt sich die Note aus allen erreichten Punkten nach folgendem Schlüssel:\n" +
                ">= 90 Punkte sehr gut (1)\n" +
                ">= 80 Punkte gut (2)\n" +
                ">= 70 Punkte befriedigend (3)\n" +
                ">= 50 Punkte genügend (4)\n" +
                "< 50 Punkte nicht genügend (5)";
        int ECTS = 6;
        Vector<String> programme = new Vector<String>();
        Vector<String> vortragende = new Vector<String>();
        Vector<String> termine = new Vector<String>();
        programme.add("Master Informatik - Allgemein");
        programme.add("Master Informatik - Data Science");
        vortragende.add("VortragendeR Eins");
        vortragende.add("VortragendeR Zwei");
        Random random = new Random();
        int rnd = random.nextInt(5);
        String possibleNames[] = {"VU Parallel Architectures and Programming Models", "VU Advanced Software Engineering", "VU Advanced Software Engineering", "VU Wissenschaftliches Arbeiten",
                "Combinatorial and Numerical Algorithms", "VU Algorithms and Data Structures 2", "AAL Advanced Algorithms", "DPA Distributed and Parallel Algorithms",
                "HPA Numerical High Performance Algorithms","STL Software Tools and Libraries for Scientific Computing ", "AT-AL Advanced Topics in Algorithms",
                "GFX Foundations of Computer Graphics", "VU Foundations of Computer Graphics", "CGA Cloud Gaming", "GAT Gaming Technologies ", "IMS Image Synthesis",
                "RCG Real-Time Computer Graphics ", " VU Advanced Topics in Computer Graphics", "VIS Visualisation and Visual Data Analysis", "FDA Foundations of Data Analysis",
                "CO Computational Optimisation", "DM Data Mining", "NLP Natural Language Processing", "VIS Visualisation and Visual Data Analysis", "AT-DA Advanced Topics in Data Analysis",
                "VU Scientific Data Management", "ISE Information Management & Systems Engineering ", "BI2 Business Intelligence II ", "SDM Scientific Data Management",
                "DSE Distributed Systems Engineering", "CC Cloud Computing", "SEC Network Security", "MCM Multimedia Content Management" };
        String [] studiums = {"informatik", "wirtschaftswissenschaft", "rechtwissenschaft", "geschichte", "romanistik", "philosophie"};
        String [] moduls ={"Anwendungsfach", "Praktikum Informatik 1","P2 Praktikum 2", "Wissenschaftliches Arbeiten ","WahlmodulGruppe"};
        for(int i = 0; i < 15; i++){
            Veranstaltung v = new Veranstaltung(possibleNames[random.nextInt(possibleNames.length-1)], motivation, minimum, assessment, ECTS, programme, vortragende, termine);
            lv.add(v);
        }


        Studium masterStudium = new Studium(moduls[random.nextInt(5)], "informatik", lv);

        return masterStudium;
    }


    public Studium createBachelorStudium(){

        Vector<Veranstaltung>lv = new Vector<>();
        String motivation = "Für die Lehrveranstaltung werden die Kenntnisse aus vorsemestrigen LV als bekannt vorausgesetzt. Diese werden vertieft und erweitert. \n" +
                "In der Vorlesung werden die Stoffinhalte in Form eines Frontalvortrags vermittelt. In den Übungseinheiten werden die erworbenen Kenntnisse praktisch umgesetzt, indem Lösungen zu vorgegebenen Problemstellungen gefunden werden.";
        String minimum = "Es finden über das Semester verteilt praktische Tests statt. " +
                "Diese sind als Präsenzveranstaltungen vor Ort zu absolvieren. Es sind dabei jeweils die bisher in den Übungen erarbeiteten Problemlösungen leicht zu ändern bzw. zu erweitern. " +
                "In jedem der Tests können bis zu 15 Punkte erreicht werden und es dürfen nur die von der LV-Leitung zur Verfügung gestellten, bzw. explizit freigegebenen Unterlagen verwendet werden.";
        String assessment = "Notwendige Bedingung für eine positive Beurteilung ist das Erreichen von insgesamt 100 Punkten, davon zumindest 25 Punkte bei der Abschlussklausur. Ist diese Voraussetzung erfüllt, so ergibt sich die Note aus allen erreichten Punkten nach folgendem Schlüssel:\n" +
                ">= 90 Punkte sehr gut (1)\n" +
                ">= 80 Punkte gut (2)\n" +
                ">= 70 Punkte befriedigend (3)\n" +
                ">= 50 Punkte genügend (4)\n" +
                "< 50 Punkte nicht genügend (5)";
        int ECTS = 6;
        Vector<String> programme = new Vector<String>();
        Vector<String> vortragende = new Vector<String>();
        Vector<String> termine = new Vector<String>();
        programme.add("Bachelor Informatik - Allgemein");
        programme.add("Bachelor Informatik - Data Science");
        vortragende.add("VortragendeR Eins");
        vortragende.add("VortragendeR Zwei");
        Random random = new Random();
        int rnd = random.nextInt(5);
        String[] possibleNames = {"OV Orientierungsveranstaltung","VU Programmierung 1","VO Technische Grundlagen der Informatik","PUE Repetitorium Technische Grundlagen der Informatik","VO Mathematische Grundlagen der Informatik 1","PUE Repetitorium Mathematische Grundlagen der Informatik 1","VO Theoretische Informatik","PUE Repetitorium Theoretische Informatik","VU Programmierung 2","VU Modellierung","VO Betriebssysteme","UE Betriebssysteme","VU Algorithmen und Datenstrukturen 1","VU Database Systems","VU Software Engineering 1","VU Informationssicherheit","VO Informatik und Recht","VU Informatik und Gesellschaft","VU Projektmanagement","VU Mensch-Computer-Interaktion","VO Mathematische Grundlagen der Informatik 2","UE Mathematische Grundlagen der Informatik 2","VO Einführung in Mathematische Modellierung","UE Einführung in Mathematische Modellierung","VU Algorithms and Data Structures 2","VU Numerical Algorithms","VU Software Tools and Libraries for Scientific Computing","VU Algorithms for Software Protection","Foundations of Computer Graphics","VU Cloud Gaming","VU Advanced Topics in Computer Graphics - Real-Time Ray Tracing","VU Foundations of Data Analysis","VU Natural Language Processing","VU Scientific Data Management","VU Mining Massive Data","VU Information Management & Systems Engineering","VU Business Intelligence I","VU Multimedia Content Management","VU Distributed Systems Engineering","VU Interoperability","VU Signal and Image Processing","VU Multimedia and Semantic Technologies","VU Cooperative Systems","VU Network-Based Communication Ecosystems","VO Network Security","UE Network Security","VU Parallel Computing","VU High Performance Computing","VU Program Optimisations and Runtime Systems","Softwarepraktikum mit Bachelorarbeit"};

        String [] studiums = {"informatik", "wirtschaftswissenschaft", "rechtwissenschaft", "geschichte", "romanistik", "philosophie"};
        String [] moduls ={"steop", "informatik","mathematik", "softwareentwicklung","gatekeeper","wahlmodulspruppen"};
        for(int i = 0; i < 15; i++){
            Veranstaltung v = new Veranstaltung(possibleNames[random.nextInt(possibleNames.length-1)], motivation, minimum, assessment, ECTS, programme, vortragende, termine);
            lv.add(v);
        }


        Studium bachelorStudium = new Studium(moduls[random.nextInt(5)], "informatik", lv);

        return bachelorStudium;
    }

    // s ist die Eingabe vom User, returnt wird ein Vector aller Personen, die diese Eingabe enthalten
    public Vector<Person> getPerson(String s) {
        Vector<Person> result = new Vector<Person>();

        //PSEUDO DATENBANK: in der realen App wären Namen, Mailadressen etc aus einer Datenbank abzurufen
        // Hier wird eine Liste aller Prof. und Ass.-Prof. der Fakultät für Informatik abgefragt
        // Wenn der gesuchte Name in dieser Liste enthalten ist, gilt dies als "Hit"
        String[] possibleNames = {"Ivo Hofacker", "Arndt von Haeseler", "Monika Henzinger", "Stefan Schmid", "Peter Reichl", "Karl Anton Fröschl", "Torsten Möller", "Claudi Plant", "Sebastian Tschiatschek", "Benjamin Roth", "Nils Morten Kriege", "Helmut Hlavacs", "Renate Motschnig", "Günter Haring", "Dimitris Karagiannis", "Wolfgang Klas", "Gerald Quirchmayr", "A Min Tjoa", "Erich Neuhold", "Moritz Grosse-Wentrup", "Edgar Weippl", "Siegfried Benkner", "Eduard Mehofer", "Hans Zima", "Uwe Zdun", "Monika Henzinger", "Wilfried Gansterer", "Erich Schikuta", "Maria Leitner", "Martin Polaschek", "Maria Knobelsdorf", "Erich Neuwirth", "Gabriele Uchida", "Christian Cenker"};
        Vector<String> personsFound = new Vector<String>();

        // Prüfe, ob der gesuchte Name enthalten ist
        for(int i = 0; i < possibleNames.length; i++) {
            if(possibleNames[i].toLowerCase().contains(s.toLowerCase())) {
                personsFound.add(possibleNames[i]);
            }
        }

        // Es wurde keine Person gefunden: Error
        if(personsFound.isEmpty());

        // PSEUDO FUNKTION: Rufe Daten für Person ab und füge die Personen in den result Vector ein
        for(int i = 0; i < personsFound.size(); i++) {
            Vector<String> lv = new Vector<String>();
            lv.add("• OV Orientierungsveranstaltung");
            lv.add("• VU Programmierung 1");
            lv.add("• VU Modellierung");
            lv.add("• UE Network Security");
            lv.add("• UE Betriebssysteme");
            lv.add("• VU Mensch-Computer-Interaktion");
            String name = personsFound.elementAt(i);
            Person p = new Person(name,"https://images.freeimages.com/images/large-previews/adf/sun-burst-1478549.jpg", "mustermail@univie.ac.at", "+43 100 200 300", "Sonntag, 18 Uhr", lv);

            result.add(p);
        }

        // returne den Vector an gefundenen Personen
        return result;
    }

    // s ist die Eingabe vom User, returnt wird ein Vector aller Veranstaltungen, die diese Eingabe enthalten
    public Vector<Veranstaltung> getVeranstaltung(String s){
        Vector<Veranstaltung> result = new Vector<Veranstaltung>();
        String[] possibleNames = {"OV Orientierungsveranstaltung","VU Programmierung 1","VO Technische Grundlagen der Informatik","PUE Repetitorium Technische Grundlagen der Informatik","VO Mathematische Grundlagen der Informatik 1","PUE Repetitorium Mathematische Grundlagen der Informatik 1","VO Theoretische Informatik","PUE Repetitorium Theoretische Informatik","VU Programmierung 2","VU Modellierung","VO Betriebssysteme","UE Betriebssysteme","VU Algorithmen und Datenstrukturen 1","VU Database Systems","VU Software Engineering 1","VU Informationssicherheit","VO Informatik und Recht","VU Informatik und Gesellschaft","VU Projektmanagement","VU Mensch-Computer-Interaktion","VO Mathematische Grundlagen der Informatik 2","UE Mathematische Grundlagen der Informatik 2","VO Einführung in Mathematische Modellierung","UE Einführung in Mathematische Modellierung","VU Algorithms and Data Structures 2","VU Numerical Algorithms","VU Software Tools and Libraries for Scientific Computing","VU Algorithms for Software Protection","Foundations of Computer Graphics","VU Cloud Gaming","VU Advanced Topics in Computer Graphics - Real-Time Ray Tracing","VU Foundations of Data Analysis","VU Natural Language Processing","VU Scientific Data Management","VU Mining Massive Data","VU Information Management & Systems Engineering","VU Business Intelligence I","VU Multimedia Content Management","VU Distributed Systems Engineering","VU Interoperability","VU Signal and Image Processing","VU Multimedia and Semantic Technologies","VU Cooperative Systems","VU Network-Based Communication Ecosystems","VO Network Security","UE Network Security","VU Parallel Computing","VU High Performance Computing","VU Program Optimisations and Runtime Systems","Softwarepraktikum mit Bachelorarbeit"};
        Vector<String> eventsFound = new Vector<String>();

        // Prüfe, ob der gesuchte Name enthalten ist
        for(int i = 0; i < possibleNames.length; i++) {
            if(possibleNames[i].toLowerCase().contains(s.toLowerCase())) {
                eventsFound.add(possibleNames[i]);
            }
        }

        // Es wurde keine Veranstaltung gefunden: Error
        if(eventsFound.isEmpty());

        // PSEUDO FUNKTION: Rufe Daten für Veranstaltung ab und füge die Veranstaltung in den result Vector ein
        for(int i = 0; i < eventsFound.size(); i++) {
            String motivation = "Für die Lehrveranstaltung werden die Kenntnisse aus vorsemestrigen LV als bekannt vorausgesetzt. Diese werden vertieft und erweitert. \n" +
                    "In der Vorlesung werden die Stoffinhalte in Form eines Frontalvortrags vermittelt. In den Übungseinheiten werden die erworbenen Kenntnisse praktisch umgesetzt, indem Lösungen zu vorgegebenen Problemstellungen gefunden werden.";
            String minimum = "Es finden über das Semester verteilt praktische Tests statt. " +
                    "Diese sind als Präsenzveranstaltungen vor Ort zu absolvieren. Es sind dabei jeweils die bisher in den Übungen erarbeiteten Problemlösungen leicht zu ändern bzw. zu erweitern. " +
                    "In jedem der Tests können bis zu 15 Punkte erreicht werden und es dürfen nur die von der LV-Leitung zur Verfügung gestellten, bzw. explizit freigegebenen Unterlagen verwendet werden.";
            String assessment = "Notwendige Bedingung für eine positive Beurteilung ist das Erreichen von insgesamt 100 Punkten, davon zumindest 25 Punkte bei der Abschlussklausur. Ist diese Voraussetzung erfüllt, so ergibt sich die Note aus allen erreichten Punkten nach folgendem Schlüssel:\n" +
                    ">= 90 Punkte sehr gut (1)\n" +
                    ">= 80 Punkte gut (2)\n" +
                    ">= 70 Punkte befriedigend (3)\n" +
                    ">= 50 Punkte genügend (4)\n" +
                    "< 50 Punkte nicht genügend (5)";
            int ECTS = 6;
            Vector<String> programme = new Vector<String>();
            Vector<String> vortragende = new Vector<String>();
            Vector<String> termine = new Vector<String>();
            programme.add("Bachelor Informatik - Allgemein");
            programme.add("Bachelor Informatik - Data Science");
            vortragende.add("VortragendeR Eins");
            vortragende.add("VortragendeR Zwei");

            // Hier die Termine smart hinzufügen, damit sie später für Semesterplanung genutzt werden können
            for(int j = 0; j < 3; j++) {
                if(eventsFound.elementAt(i).length() > j) {
                    //String termin = "Termin " + String.valueOf(j);
                    String termin = "Monday: 01.01. 16:45 - 18:15 Währin. Straße 29, HS1";
                    termine.add(termin);
                    termin = "Tuesday: 01.01. 13:15 - 14:45 Währin. Straße 29, HS1";
                    termine.add(termin);
                    termin = "Wednesday: 01.01. 16:45 - 18:15 Währin. Straße 29, HS1";
                    termine.add(termin);
                    termin = "Thursday: 01.01. 13:15 - 14:45 Währin. Straße 29, HS1";
                    termine.add(termin);
                    termin = "Friday: 01.01. 16:45 - 18:15 Währin. Straße 29, HS1";
                    termine.add(termin);
                }
            }

            // Veranstaltung erzeugen und an result übergeben
            String name = eventsFound.elementAt(i);
            Veranstaltung v = new Veranstaltung(name, motivation, minimum, assessment, ECTS, programme, vortragende, termine);

            result.add(v);
        }

        return result;
    }
}
