package department;

import department.typeOfEmployees.pmanagers.JuniorPR;
import department.typeOfEmployees.pmanagers.SeniorPR;
import department.typeOfEmployees.programmers.Backend;
import department.typeOfEmployees.programmers.Frontend;
import department.typeOfEmployees.testers.MiddleTester;
import department.typeOfEmployees.testers.SeniorTester;

public class ProxyForEmployees implements IDoWork {

    private Employee employee;

    public ProxyForEmployees() {

    }

    public ProxyForEmployees( Positions position) {
        employee = choice(position);
    }

    @Override
    public void job() {
        if (employee != null) {
            employee.job();
        }
    }

    public Employee choice(Positions position) {
        return switch (position) {
            case BACKEND -> new Backend();
            case FRONTEND -> new Frontend();
            case MIDDLE_TESTER -> new MiddleTester();
            case SENIOR_TESTER -> new SeniorTester();
            case JUNIOR_PR -> new JuniorPR();
            case SENIOR_PR -> new SeniorPR();
        };

    }
}
