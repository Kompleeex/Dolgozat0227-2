package Model;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
    
    public void fajlbeolvasas() throws IOException{
        String fn = "Dolgozat.txt";
        Path path = Paths.get(fn);
        List<String> sorok = Files.readAllLines(path);
        
        String fejlec = sorok.get(0);
        sorok.remove(0);
        
        List<Ember> emberek = new ArrayList<>();
        for (String sor : sorok) {
            emberek.add(new Ember(sor, ":"));
        }
        
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
