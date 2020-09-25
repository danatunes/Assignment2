package department.typeOfEmployees.programmers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class Frontend extends Employee implements IDoWork {

    public Frontend(){

    }

    public Frontend(String name , Positions positions , int wage){
        super(name,positions,wage);
    }
    @Override
    public void job() {
        System.out.println("FrontEnd coding....");
    }
}
