import java.time.LocalTime;

public class Coureur extends Personne {
    private Categorie categorie;
    private LocalTime temps;

    public Coureur(Genre genre,String nom, String prenom,Categorie categorie, LocalTime temps) {
    super(genre,nom,prenom);
       this.categorie = categorie;
       this.temps = temps;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public LocalTime getTemps() {
        return temps;
    }

    public void setTemps(LocalTime temps) {
        this.temps = temps;
    }
}


