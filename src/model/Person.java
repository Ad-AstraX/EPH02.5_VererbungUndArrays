package model;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Person {
    //Attribute
    protected String name;
    protected int alter;
    protected Kurs[] kurse;

    public Person (String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs){
        //TODO Hinzufügen eines Kurses, den ein Schüler aufsuchen muss.
        Kurs[] newArray = new Kurs[kurse.length+1];
        for (int i = 0; i < kurse.length; i++) {
            newArray[i] = kurse[i];
        }
        newArray[kurse.length] = neuerKurs;

        kurse = newArray;
    }

    /**
     * Methode erstellt aus den Informationen zur Schnittstelle von Lehrer und Schüler (Name, Alter, Kurse) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        //TODO Kompakte Zeichenkette zu den Informationen einer Person - gut lesbar!
        String info =   "Name: " + getName() +
                        "\nAlter: " + getAlter() +
                        "\nKurse: " + Arrays.toString(kurse);
        return info;
    }
}
