import java.io.IOException;

public class Ihm {
    static GestionDesCoureurs g = new GestionDesCoureurs();
    public static void main(String[] args) throws IOException {
        g.Lirefichier();
        g.croissantalphabet();

        int choix = 0;
        System.out.println(" Lire la liste des coureurs dans le fichier\n" +
                " Afficher par ordre alphabétique de leur nom croissant\n" +
                " Afficher par ordre alphabétique de leur nom décroissant\n" +
                " Afficher par ordre alphabétique de leur prénom croissant\n" +
                " Afficher par ordre alphabétique de leur prénom décroissant\n" +
                " Afficher par ordre de classement croissant\n" +
                " Afficher par ordre de classement décroissant\n" +
                " Ajouter un coureur\n" +
                " Supprimer un coureur\n" +
                " Modifier un coureur");

        switch (choix) {
           case 1:
               System.out.println("voici la liste des coureurs dans le fichier");
            break;
           case 2:
                System.out.println("voici la liste par ordre alphabetique croissant");
                break;
           case 3:
                System.out.println("voici la liste des coureurs dans le fichier");
                break;
           case 4:
                System.out.println("voici la liste par ordre alphabetique croissant");
                break;



        }
    }
}