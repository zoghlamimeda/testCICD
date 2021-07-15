package exceptions;

import model.Employe;
import model.Entreprise;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(Employe employe, Entreprise entreprise){
        super("Cannot remove '"+employe.getNom()+"' from "+entreprise.getNom()+". No such employee found.");
    }
}
