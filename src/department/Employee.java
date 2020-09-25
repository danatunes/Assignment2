package department;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements IDoWork
{
    private String name;
    private Positions position;
    private int wage;
    private List<Employee> coworkers;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setCoworkers(List<Employee> coworkers) {
        this.coworkers = coworkers;
    }

    public Employee(String name, Positions position , int wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        coworkers = new ArrayList<Employee>();
    }

    public void addCoWorker(Employee employee) {
        coworkers.add(employee);
    }

    public void removeCoworker(Employee employee) {
        coworkers.remove(employee);
    }

    public List<Employee> getCoworkers() {
        return coworkers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                ", coworkers=" + coworkers +
                '}';
    }
}
