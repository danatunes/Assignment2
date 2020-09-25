package department.typeOfEmployees.pmanagers;

import department.Employee;
import department.IDoWork;
import department.Positions;

public class SeniorPR extends Employee implements IDoWork {

    public  SeniorPR(){

    }


    public SeniorPR(String name , Positions positions , int wage){
        super(name,positions,wage);
    }
    @Override
    public void job(){
        System.out.println("Senior PR Manager does the job perfectly");
    }
}
