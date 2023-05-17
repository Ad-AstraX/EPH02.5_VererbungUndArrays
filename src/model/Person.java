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

    public void addObject (@NotNull Object neuesObjekt, @NotNull Object[] array) {
        Object helpVar = new Object[1];
        if (array.length > 0) {
            helpVar = new Object[array.length];
        }

        for (int i = 0; i < array.length; i++) {
            //helpVar[i] = array[i]
        }
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
