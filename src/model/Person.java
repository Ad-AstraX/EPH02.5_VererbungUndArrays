package model;

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
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        //TODO Kompakte Zeichenkette zu den Informationen einer Person - gut lesbar!
        String info =   "Name: " + getName() +
                        "\nAlter: " + getAlter() +
                        " ";
        return info;
    }
}
