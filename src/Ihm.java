import clavier.In;

import java.io.IOException;

public class Ihm {
    GestionDesCoureurs g = new GestionDesCoureurs();

    public void Start() throws IOException {
        int choix = 0;
        do {

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
            choix = In.readInteger();


            switch (choix) {
                case 1:
                    System.out.println("voici la liste des coureurs dans le fichier");
                    g.Lirefichier();
                    AfficheCoureurs();
                    break;
                case 2:
                    System.out.println("voici la liste par ordre alphabétique de leur nom croissant");
                    g.croissantalphabet();
                    AfficheCoureurs();
                    break;
                case 3:
                    System.out.println("voici la liste par ordre alphabétique de leur nom décroissant");
                    g.decroissantalphabet();
                    break;
                case 4:
                    System.out.println("voici la liste par ordre alphabétique de leur prénom croissant");
                    g.croissantPrenom();
                    break;
                case 5:
                    System.out.println("voici lla liste par ordre alphabétique de leur prénom decroissant");
                    g.decroissantPrenom();
                    break;
                case 6:
                    System.out.println("voici la liste par ordre de classement croissant");
                    g.croissant();
                    break;
                case 7:
                    System.out.println("voici la liste par ordre de classement decroissant");
                    g.decroissant();
                    break;
            }
        } while (choix != 0);
    }


    public void AfficheCoureurs() throws IOException {

        for( int i = 0; i < g.listeCoureurs.size(); i++)
        {
            System.out.println(g.listeCoureurs.get(i).getInfo());
        }

    }
}