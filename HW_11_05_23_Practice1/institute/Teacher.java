package institute;

public class Teacher extends Human{

    private String qualification;

    public Teacher(int age,String name, String qualification) {
        super(age, "teacher", name);
        this.qualification = qualification;
    }

    @Override
    public void doWork(String str) {
        System.out.println(super.getStatus() + " " + super.getName() + " " + str);
    }

    public String getQualification() {
        return qualification;
    }
}
