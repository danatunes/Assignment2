package department.typeOfEmployees.testers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class MiddleTester extends Employee implements IDoWork {

    public MiddleTester(){

    }

    public MiddleTester(String name , Positions positions , int wage){
        super(name,positions,wage);
    }
    @Override
    public void job() {
        System.out.println("Middle Tester tested!");
    }
}
