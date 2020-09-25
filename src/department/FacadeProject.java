package department;

import java.util.List;

public class FacadeProject {

    private Employee employee;


    public FacadeProject() {
    }

    public void doProject(Employee employee3) {
        for (Employee emp : employee3.getCoworkers()) {
            ProxyForEmployees proxyForEmployees = new ProxyForEmployees(emp.getPosition());
            System.out.println(emp.getName() + " do :");
            proxyForEmployees.job();

        }
        ProxyForEmployees proxyForEmployees1 = new ProxyForEmployees(employee3.getPosition());
        System.out.println(employee3.getName() + " do :");
        proxyForEmployees1.job();
    }


    public void getCoworkers(Employee employee) {
        System.out.println("\n" + employee.getName() + "'s cowerkers" + " " + employee.getCoworkers());
    }
}
