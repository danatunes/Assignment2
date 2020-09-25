package department.typeOfEmployees.pmanagers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class JuniorPR extends Employee implements IDoWork {

    public JuniorPR(){

    }

    @Override
    public void job(){
        System.out.println("Junior PR Manager does the job normaly");
    }
}
