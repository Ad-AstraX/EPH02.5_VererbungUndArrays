package model;

import java.util.Arrays;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Person {

    //Referenzen
    private Tadel[] tadelDesSchuelers;

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        super (name, alter);
    }

    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    public void addTadel(Tadel neuerTadel) {
        //TODO Hinzufügen eins Tadels für den Schüler.
        if (tadelDesSchuelers == null) {
            tadelDesSchuelers = new Tadel[]{neuerTadel};
        } else {
            Tadel[] newArray = new Tadel[tadelDesSchuelers.length + 1];
            for (int i = 0; i < tadelDesSchuelers.length; i++) {
                newArray[i] = tadelDesSchuelers[i];
            }
            newArray[tadelDesSchuelers.length] = neuerTadel;

            tadelDesSchuelers = newArray;
        }
    }

    public void addKurs (Kurs neuerKurs) {
        super.addKurs(neuerKurs);
        neuerKurs.addSchueler(this);
    }
    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        String tadelInfo = "";
        if (tadelDesSchuelers != null) {
            for (int i = 0; i < tadelDesSchuelers.length; i++) {
                tadelInfo += tadelDesSchuelers[i].getTadelBeschreibung();
                if (i != tadelDesSchuelers.length-1) {
                    tadelInfo += ", ";
                }
            }
        }
        String info = super.getInfo() +
                        "\nTadel: " + tadelInfo;
        return info;
    }
}
