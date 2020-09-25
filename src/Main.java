import department.*;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new DepPR("Assel", Positions.JUNIOR_PR, 1500);
        Employee employee2 = new DepProgrammer("z1z", Positions.BACKEND, 950000);
        Employee employee5 = new DepTester("Asyl", Positions.MIDDLE_TESTER, 32000);


        employee1.addCoWorker(employee2);
        employee1.addCoWorker(employee5);


        FacadeProject facadeProject = new FacadeProject();
        facadeProject.getCoworkers(employee1);
        facadeProject.doProject(employee1);


    }
}
