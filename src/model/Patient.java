package model;

import java.util.HashSet;
import java.util.Set;

public class Patient implements Comparable{

    private String nom;
    private Set<String> ordonnance; //Liste de medicaments sans doublons

    public Patient(String n) {
        this.nom = n;
        ordonnance = new HashSet<>();
    }

    //_ _ Affiche donnes patient + ordonnance _/
    public void affiche() {
        System.out.print("Patient : nom = " + nom + " ; ordonnance = ");
        afficheOrdonnance();
    }

    //_ _ Ajoute un médicament de nom m dans ordonnance _/
    public void ajoutMedicament(String m) {
        if (!contientMedicament(m))
            ordonnance.add(m);
        else
            System.out.println(m + " already existing !");
    }

    //_ _ Affiche l’ordonnance du patient _/
    public void afficheOrdonnance() {
        System.out.println(ordonnance);
    }

    //_ _ Teste si ordonnance contient un médicament m _/
    public boolean contientMedicament(String m) {
        return ordonnance.contains(m);
    }

    //_ _ Teste si l’ordonnance de ce patient est vide _/
    public boolean ordonnanceVide() {
        return ordonnance.isEmpty();
    }

    public String toString() {
        return "Patient{" +
                "nom='" + nom + '\'' +
                ", ordonnance=" + ordonnance +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.nom.compareTo( ((Patient)o).nom);
    }
}
