package model;

public class EmployeHoraire extends Employe {

    private double nbHeures;
    private double tarifHoraire;
    private double pourcentageHeuresSup;
    private static final double heuresDues = 39;


    public EmployeHoraire(String nom, double nbHeures, double tarifHoraire, double pourcentageHeuresSup) {
        super(nom);
        this.nbHeures = nbHeures;
        this.tarifHoraire = tarifHoraire;
        this.pourcentageHeuresSup = pourcentageHeuresSup;
    }

    public EmployeHoraire(String nom){
        super(nom);
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(double tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public double getPourcentageHeuresSup() {
        return pourcentageHeuresSup;
    }

    public void setPourcentageHeuresSup(double pourcentageHeuresSup) {
        this.pourcentageHeuresSup = pourcentageHeuresSup;
    }

    public static double getHeuresDues() {
        return heuresDues;
    }

    @Override
    public double getSalaire() {
        if(nbHeures > heuresDues)
            return (heuresDues * tarifHoraire) + ((nbHeures - heuresDues) * nbHeures * (1+ pourcentageHeuresSup /100));
        else
            return nbHeures * tarifHoraire;

    }


}
