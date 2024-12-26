import clavier.In;

import java.io.IOException;

public class Ihm {
    GestionDesCoureurs g = new GestionDesCoureurs();

    public void Start() throws IOException {
        int choix = 0;
        do {

            System.out.println("1 Lire la liste des coureurs dans le fichier\n" +
                    "2 Afficher par ordre alphabétique de leur nom croissant\n" +
                    "3 Afficher par ordre alphabétique de leur nom décroissant\n" +
                    "4 Afficher par ordre alphabétique de leur prénom croissant\n" +
                    "5 Afficher par ordre alphabétique de leur prénom décroissant\n" +
                    "6 Afficher par ordre de classement croissant\n" +
                    "7 Afficher par ordre de classement décroissant\n" +
                    "8 Ajouter un coureur\n" +
                    "9 Supprimer un coureur\n" +
                    "10 Modifier un coureur");
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
                    AfficheCoureurs();

                    break;
                case 4:
                    System.out.println("voici la liste par ordre alphabétique de leur prénom croissant");
                    g.croissantPrenom();
                    AfficheCoureurs();

                    break;
                case 5:
                    System.out.println("voici lla liste par ordre alphabétique de leur prénom decroissant");
                    g.decroissantPrenom();
                    AfficheCoureurs();

                    break;
                case 6:
                    System.out.println("voici la liste par ordre de classement croissant");
                    g.croissant();
                    AfficheCoureurs();

                    break;
                case 7:
                    System.out.println("voici la liste par ordre de classement decroissant");
                    g.decroissant();
                    AfficheCoureurs();

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