package mains;

import model.DossierPharmacie;
import model.Patient;

import java.util.TreeSet;

public class Tp5Main {
    public static void main(String[] args){
        DossierPharmacie DS1 = new DossierPharmacie("Dossier1");

        String Ord1[] = {"Doliprane 500", "Vitamine C","Augmentin 500"};

        String Ord2[] = {"Algesic extra", "Panadol"};

        String Ord3[] = {"Doliprane 500", "Panadol","Fervex"};

        DS1.nouveauPatient("Ali", Ord1);

        DS1.nouveauPatient("Sami", Ord2);

        DS1.nouveauPatient("Lotfi", Ord3);

        DS1.affiche();

        System.out.println(DS1.ajoutMedicament("Ali", "Panadol"));

        DS1.affichePatient("Ali");

        TreeSet<Patient> Liste1 = new TreeSet<Patient>();

        Liste1 = (TreeSet<Patient>)DS1.liste_Patient_Medicament("Panadol");

        System.out.println(Liste1);
    }

}
