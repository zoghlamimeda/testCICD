package model;

import exceptions.EmployeeAlreadyEngagedException;
import exceptions.EmployeeEnChômageException;
import exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private String nom;
    private List<Employe> employes = new ArrayList<>();

    public Entreprise(String nom){
        this.nom = nom;
    }

    public boolean engager(Employe employe) throws EmployeeAlreadyEngagedException {
        if(this.employes.contains(employe))
            throw new EmployeeAlreadyEngagedException(employe,this);
        else {
            boolean added = employes.add(employe);
            if(added){
                employe.setEntreprise(this);
                System.out.println("Employee added.");
                System.out.print("Ste : "+this.nom+" ; Employees : ");
                System.out.println(this.employes);
            }
            return added;
        }
    }

    public boolean aPourEmploye(Employe employe){
        return this.employes.contains(employe);
    }

    public String getNom(){
        return this.nom;
    }

    public void seSeparerDe(Employe employe) throws EmployeeNotFoundException {
        if( !employes.contains(employe) )
            throw new EmployeeNotFoundException(employe,this);
        else{
            employes.remove(employe);
            try{
                employe.demissionne();
                System.out.println("Employe démissionné.");
                System.out.print("Ste : "+this.nom+" ; Employees : ");
                System.out.println(this.employes);
            } catch (EmployeeEnChômageException e) {
                e.printStackTrace();
            }
        }
    }
}