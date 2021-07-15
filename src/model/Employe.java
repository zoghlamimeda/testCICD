package model;

import exceptions.EmployeeEnChômageException;
import exceptions.EmployeeNotFoundException;

public abstract class Employe {

    private String nom;
    private Entreprise entreprise = null;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setEntreprise(Entreprise entreprise){
        if(entreprise.aPourEmploye(this)){
            if(this.entreprise == null){
                this.entreprise = entreprise;
            }else{
                try{
                    this.demissionne();
                } catch (EmployeeEnChômageException e) {
                    e.printStackTrace();
                }
                this.entreprise = entreprise;
            }
        }
    }

    public void demissionne() throws EmployeeEnChômageException {
        if(this.entreprise == null)
            throw new EmployeeEnChômageException(this);
        else{
            try{
                if(this.entreprise.aPourEmploye(this))
                    this.entreprise.seSeparerDe(this);
                this.entreprise = null;
            } catch (EmployeeNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract double getSalaire();

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
