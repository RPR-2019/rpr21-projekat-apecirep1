package ba.unsa.etf.rpr;

public class Zadatak {
    private String naziv;
    private String datum;
    private String vrijeme;
    private int bitno;

    public Zadatak(String naziv, String datum, String vrijeme, int bitno) {
        this.naziv = naziv;
        this.datum = datum;
        this.vrijeme = vrijeme;
        this.bitno = bitno;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

    public int getBitno() {
        return bitno;
    }

    public void setBitno(int bitno) {
        this.bitno = bitno;
    }
}
