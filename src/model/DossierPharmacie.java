package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DossierPharmacie {
    private String nom;
    private Map<String, Patient> patients;

    public DossierPharmacie(String n) {
        nom = n;
        patients = new HashMap<>();
    }

    // Ajoute un nouveau patient de nom et ordonnance donnés _/
    public void nouveauPatient(String nom, String[] ord) {
        Patient patient = new Patient(nom.toLowerCase());

        for (String m : ord)
            patient.ajoutMedicament(m);

        patients.put(nom.toLowerCase(), patient);
    }

    /* Ajoute un nouveau médicament sur un patient déjà existant.
    Renvoie false si le patient n’existe pas et true si l’ajout a pu être effectue
    */
    public boolean ajoutMedicament(String nom, String m) {
        if (!patients.containsKey(nom.toLowerCase()))
            return false;
        else {
            patients.get(nom.toLowerCase()).ajoutMedicament(m);
            return true;
        }
    }

    // Affiche nom + ordonnance du patient du nom donné _/
    public void affichePatient(String nom) {
        if (!patients.containsKey(nom.toLowerCase()))
            System.out.println("Patient " + nom + " non existant.");
        else
            patients.get(nom.toLowerCase()).affiche();
    }

    // Affiche nom pharmacie + tous les patients du dossier _/
    public void affiche() {
        System.out.println("Dossier pharmacie : nom = " + nom + " ; patients = " + patients);
    }

    public Set<Patient> liste_Patient_Medicament(String m){
        Set<Patient> patients = new TreeSet<>();
        for (Patient patient : this.patients.values()){
            if (patient.contientMedicament(m))
                patients.add(patient);
        }
        return patients;
    }
}
