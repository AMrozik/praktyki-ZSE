package Kwiatek;

public class Kwiatek {
    String nazwa;
    String nazwaŁacinska;
    String kolorPłatków;
    String kolorLiści = "Zielony";
    String rzadkośćWystępowania;

    boolean czyTrujący;

    public Kwiatek(){}

    public Kwiatek(String nazwa, String nazwaŁacinska, String kolorPłatków, String rzadkośćWystępowania, boolean czyTrujący) {
        this.nazwa = nazwa;
        this.nazwaŁacinska = nazwaŁacinska;
        this.kolorPłatków = kolorPłatków;
        this.rzadkośćWystępowania = rzadkośćWystępowania;
        this.czyTrujący = czyTrujący;
        System.out.println("Utworzyliśmy właśnie kwiatek :)");
    }

    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public void setNazwaŁacinska(String nazwaŁacinska){
        this.nazwaŁacinska = nazwaŁacinska;
    }
    public void setKolorPłatków(String kolorPłatków){
        this.kolorPłatków = kolorPłatków;
    }
    public void setKolorLiści(String kolorLiści){
        this.kolorLiści = kolorLiści;
    }
    public void setRzadkośćWystępowania(String rzadkośćWystępowania){
        this.rzadkośćWystępowania = rzadkośćWystępowania;
    }
    public void setCzyTrujący(boolean czyTrujący){
        this.czyTrujący = czyTrujący;
    }

    public String getNazwa(){
        return this.nazwa;
    }
    public String getNazwaŁacinska() {
        return nazwaŁacinska;
    }
    public String getKolorPłatków() {
        return kolorPłatków;
    }
    public String getKolorLiści() {
        return kolorLiści;
    }
    public String getRzadkośćWystępowania() {
        return rzadkośćWystępowania;
    }
    public boolean isCzyTrujący() {
        return czyTrujący;
    }
}
