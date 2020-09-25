package department.typeOfEmployees.testers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class SeniorTester extends Employee implements IDoWork {

    public SeniorTester(){

    }

    public SeniorTester(String name, Positions positions , int wage){
        super(name, positions , wage);
    }
    @Override
    public void job() {
        System.out.println("Senior Tester tested!");
    }
}
