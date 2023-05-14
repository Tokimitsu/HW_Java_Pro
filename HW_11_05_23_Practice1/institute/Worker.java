package institute;

public class Worker extends Human{

    private String position;
    public Worker(int age, String name, String position) {
        super(age, "worker", name);
        this.position = position;
    }

    @Override
    public void doWork(String str) {
        System.out.println((super.getStatus() + " " + super.getName() +  " " + str));
    }

    public void visitOffice(){
        System.out.println(super.getStatus() + " " + super.getName() + " is visiting office");
    }

    public String getPosition() {
        return position;
    }
}
