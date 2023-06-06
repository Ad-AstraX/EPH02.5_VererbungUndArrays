package model;

import java.util.Arrays;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Person{
    protected String besoldungsGruppe;

    //Referenzen
    protected Unterrichtsfach[] faecherDesLehrers;

    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super (name, alter);
        this.besoldungsGruppe = besoldungsGruppe;
    }

    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }

    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        //TODO Hinzufügen eines Faches, das ein Lehrer unterrichten kann.
        Unterrichtsfach[] newArray = new Unterrichtsfach[faecherDesLehrers.length+1];
        for (int i = 0; i < faecherDesLehrers.length; i++) {
            newArray[i] = faecherDesLehrers[i];
        }
        newArray[faecherDesLehrers.length] = neuesFach;

        faecherDesLehrers = newArray;
    }

    public void addKurs(Kurs neuerKurs) {
        super.addKurs(neuerKurs);

        neuerKurs.setLehrkraft(this);
    }
    /**
     * Methode erstellt aus den Informationen zum Lehrer ((Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        //TODO Kompakte Zeichenkette zu den Informationen eines Lehrers - gut lesbar!
        super.getInfo();
        String info = super.getInfo() +
                        "\nBesoldungsgruppe: " + besoldungsGruppe +
                        "\nFächer: " + Arrays.toString(faecherDesLehrers);
        return info;
    }
}
