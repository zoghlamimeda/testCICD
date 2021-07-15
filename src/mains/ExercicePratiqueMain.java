package mains;

import exceptions.EmployeeAlreadyEngagedException;
import exceptions.EmployeeEnChômageException;
import model.Commercial;
import model.EmployeHoraire;
import model.Entreprise;

public class ExercicePratiqueMain {

    public static void main(String[] args){
        Entreprise S1 = new Entreprise("Sté 1");
        Entreprise S2 = new Entreprise("Sté 2");

        Commercial c1 = new Commercial("Mohamed",5.0,10.0);
        Commercial c2 = new Commercial("Ahmed",15.0,10.0);
        Commercial c3 = new Commercial("Hamed",10.0,10.0);

        EmployeHoraire e1 = new EmployeHoraire("Meriem",30.0,100.0,20.0);
        EmployeHoraire e2 = new EmployeHoraire("Maram",39.0,250.0,20.0);
        EmployeHoraire e3 = new EmployeHoraire("Marwa",45.0,150.0,5.0);

        //Adding employees to Stés
        try{
            S1.engager(c1);
            S1.engager(c2);
            S1.engager(c3);

        } catch (EmployeeAlreadyEngagedException e) {
            e.printStackTrace();
        }

        try{
            S2.engager(e1);
            S2.engager(e2);
            S2.engager(e3);

        } catch (EmployeeAlreadyEngagedException e) {
            e.printStackTrace();
        }

        //Adding some of them again (even tho they are already there)
        try{
            S1.engager(c1);

        } catch (EmployeeAlreadyEngagedException e) {
            e.printStackTrace();
        }

        try{
            S2.engager(e1);

        } catch (EmployeeAlreadyEngagedException e) {
            e.printStackTrace();
        }

        //Adding some of them to others (they'll have to démission in the process)
        try{
            S2.engager(c3);
            S1.engager(e3);

        } catch (EmployeeAlreadyEngagedException e) {
            e.printStackTrace();
        }

        //démissionnning some of them
        try{
            c2.demissionne();
            e2.demissionne();
        } catch (EmployeeEnChômageException e) {
            e.printStackTrace();
        }

        //calculating Salary
        System.out.println(c1.getNom() + " : "+c1.getSalaire());
        System.out.println(c2.getNom() + " : "+c2.getSalaire());
        System.out.println(c3.getNom() + " : "+c3.getSalaire());

        System.out.println(e1.getNom() + " : "+e1.getSalaire());
        System.out.println(e2.getNom() + " : "+e2.getSalaire());
        System.out.println(e3.getNom() + " : "+e3.getSalaire());

    }
}
