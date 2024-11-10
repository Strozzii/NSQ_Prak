package org.example;

public class Anschrift {
    private String ort;
    private int plz;
    private String strasse;
    private int hausnr;

    public String getOrt() {
        return this.ort;
    }

    public int getPlz() {
        return this.plz;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public int getHausnr() {
        return this.hausnr;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnr(int hausnr) {
        this.hausnr = hausnr;
    }


}
