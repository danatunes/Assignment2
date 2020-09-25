package department;

public class DepTester extends Employee implements IDoWork {

    private FacadeProject facadeProject = new FacadeProject();

    public DepTester(String name, Positions positions, int wage) {
        super(name, positions, wage);
       // fProject.doProject(positions,name);
    }

    public DepTester() {

    }


    @Override
    public void job() {

        System.out.println(getName() + " " + getWage());

    }
}
