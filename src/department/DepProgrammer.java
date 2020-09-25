package department;


public class DepProgrammer extends Employee implements IDoWork {


    private FacadeProject facadeProject = new FacadeProject();
    public DepProgrammer(String name , Positions positions , int wage){
        super(name, positions,wage);

        //fProject.doProject(positions,name);
    }

    public DepProgrammer() {
    }


    @Override
    public void job() {
        System.out.println(getName()+" "+ getWage());

    }
}
