package exceptions;

import model.Employe;

public class EmployeeEnChômageException extends Exception {
    public EmployeeEnChômageException(Employe employe){
        super("employee '"+employe.getNom()+"' is already jobless.");
    }
}
