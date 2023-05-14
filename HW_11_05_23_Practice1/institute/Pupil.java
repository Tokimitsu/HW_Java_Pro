package institute;

public class Pupil extends Human {

    private String department;

    public Pupil(int age, String name, String department) {      // Ccылаемся на конструктор родителя
        super(age, "pupil", name);
        this.department = department;                        // Присваиваю направление студенту
    }

    @Override
    public void doWork(String str) {                                   // Выполняем контракт
         System.out.println(super.getStatus() + " " + super.getName() + " " + str); // super - вызываю свойства класса родителя
    }

    public String getDepartment() {
        return department;
    }
}
