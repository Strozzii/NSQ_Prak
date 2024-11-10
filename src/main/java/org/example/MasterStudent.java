package org.example;

public class MasterStudent {
    private String vorname;
    private String nachname;
    private int matnr;
    private int semester;
    private String studiengang;
    private Anschrift anschrift;

    @Override
    public String toString() {
        return "Student " + this.getVorname() + " " + this.getNachname() +
                " mit der Matrikelnummer: " + this.matnr + " wohnt in " +
                this.anschrift.getPlz() + " " + this.anschrift.getOrt() + ".";
    }

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public int getMatnr() {
        return this.matnr;
    }

    public int getSemester() {
        return this.semester;
    }

    public String getStudiengang() {
        return this.studiengang;
    }

    public Anschrift getAnschrift() {
        return this.anschrift;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setMatnr(int matnr) {
        this.matnr = matnr;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }


}
