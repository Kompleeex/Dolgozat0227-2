package Model;



public class Ember {
    private String nev;
    private int kor;
    private String neme;
    private int MunkToltEV;

    public Ember(String nev, int kor, String neme, int MunkToltEV) {
        this(nev+";"+kor+";"+neme+";"+MunkToltEV);
    }
    
    public Ember(String sor){
        this(sor, ";");
    }
    
    public Ember(String sor, String sep){
        String[] s = sor.split(sep);
        this.nev =s[0];
        this.kor =Integer.parseInt(s[1]);
        this.neme = s[2];
        this.MunkToltEV =Integer.parseInt(s[3]);
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
