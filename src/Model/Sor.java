
package Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sor {
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
}
