import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;

public class GestionDesCoureurs {
    ArrayList<Coureur> listeCoureurs = new ArrayList();

    public void Lirefichier() throws IOException {
        String line = null;
        BufferedReader br = Files.newBufferedReader(Paths.get("course.txt"));
        while ((line = br.readLine()) != null) {
            line = line.replace(" ", "");
            String[] s = line.split(",");
            listeCoureurs.add(new Coureur(
                            Genre.valueOf(s[0]),
                            s[1],
                            s[2],
                            Categorie.valueOf(s[3]),
                            LocalTime.ofSecondOfDay(Long.valueOf(s[4]))
                    )
            );
            System.out.println(line);
        }
        br.close();
    }


    public void croissantalphabet() throws IOException {
        /*for (Coureur c : listeCoureurs) {
            for (int i = 0 ; i < 1000; i++) {
                if (listeCoureurs.get(i).getNom().compareTo(listeCoureurs.get(i + 1).getNom()) < 0){
                    System.out.println(c.getNom());

                } else {
                }
            }
        }*/

        listeCoureurs.sort((Comparator.comparing(Coureur::getNom)));
    }
    public void decroissantalphabet() throws IOException {
        listeCoureurs.sort((Comparator.comparing(Coureur::getNom).reversed()));

    }
    public void croissantPrenom() throws IOException {
        listeCoureurs.sort((Comparator.comparing(Coureur::getPrenom)));
    }
    public void decroissantPrenom() throws IOException {
        listeCoureurs.sort((Comparator.comparing(Coureur::getPrenom).reversed()));
    }
}