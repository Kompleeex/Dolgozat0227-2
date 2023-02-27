package Model;

public class Ember {
    private String nev;
    private int kor;
    private String neme;
    private int MunkToltEV;

    public Ember(String nev, int kor, String neme, int MunkToltEV) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.MunkToltEV = MunkToltEV;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunkToltEV() {
        return MunkToltEV;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public void setMunkToltEV(int MunkToltEV) {
        this.MunkToltEV = MunkToltEV;
    }
    
    
}
