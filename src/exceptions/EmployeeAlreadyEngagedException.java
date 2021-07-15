package exceptions;

import model.Employe;
import model.Entreprise;

public class EmployeeAlreadyEngagedException extends Exception{
    public EmployeeAlreadyEngagedException(Employe employe, Entreprise entreprise){
        super("Entreprise +'"+entreprise.getNom()+"' already has employee '"+employe.getNom()+"'");
    }
}
