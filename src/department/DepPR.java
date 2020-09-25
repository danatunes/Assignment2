package department;

public class DepPR extends Employee implements IDoWork {

    private FacadeProject facadeProject = new FacadeProject();

    public DepPR(String name, Positions positions, int wage) {
        super(name, positions, wage);
        //fProject.doProject(positions, name);
    }

    public DepPR() {
    }


    @Override
    public void job() {
        System.out.println(getName() + " " + getWage());

    }
}
