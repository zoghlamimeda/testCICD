package model;

public class Commercial extends Employe {

    // chiffre d'affaires du mois
    private double ca ;
    private double fixe;
    // pourcentage du CA pour le calcul du salaire
    private static final double pourcentageCa = 1.0;

    public Commercial(String nom, double ca, double fixe) {
        super(nom);
        this.ca = ca;
        this.fixe = fixe;
    }

    @Override
    public double getSalaire() {
        if(ca <= fixe)
            return ca;
        else
            return (fixe + ((ca - fixe) * 1+pourcentageCa/100)  );
    }
}
