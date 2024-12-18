public class Test {

    public static void main(String[] args) {

        Compte compte = new Compte();
        compte.crediter(150);
        compte.debiter(100);
        compte.debiter(150);
        compte.crediter(150);
        System.out.println("le montant est de " + compte.getAgios());
    }

}
class Compte {
    private String numero;
    private double valeur = 0;
    private double agios = 0;

    public void setValeur(double montant) {
        this.valeur = montant;
        if (this.getValeur() < 0) {
            this.agios = this.getValeur() * (0.1);
        }
    }

    public void crediter (double montant) {
        this.setValeur(this.getValeur() + montant);
    }
    public void debiter (double montant) {
        this.setValeur(this.getValeur() - montant);
    }
    public double consulter() {
        return this.getValeur();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValeur() {
        return valeur;
    }

    public double getAgios() {
        return agios;
    }

    public void setAgios(double agios) {
        this.agios = agios;
    }
}