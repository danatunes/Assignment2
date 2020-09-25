package department.typeOfEmployees.programmers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class Backend extends Employee implements IDoWork {

    public Backend(){

    }

    public Backend(String name , Positions positions , int wage){
        super(name,positions,wage);
    }
    @Override
    public void job(){
        System.out.println(" BackEnd coding...");
    }
}
