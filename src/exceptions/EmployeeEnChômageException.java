package exceptions;

import model.Employe;

public class EmployeeEnChÃ´mageException extends Exception {
    public EmployeeEnChÃ´mageException(Employe employe){
        super("employee '"+employe.getNom()+"' is already jobless.");
    }
}
