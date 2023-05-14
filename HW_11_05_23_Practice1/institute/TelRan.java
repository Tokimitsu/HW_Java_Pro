package institute;

import java.util.Scanner;

public class TelRan {

    private static TelRan instance;
    private TelRan(){

    }
    public static TelRan getInstance(){
        if(instance == null){
            instance = new TelRan();
        }
        return instance;
    }






    private Scanner scanner = new Scanner(System.in);
    private Pupil[] pupils = new Pupil[3];
    private Teacher teacher;
    private Worker worker;

    /**
     * Метод для инициализации членов организации
     */
    public void init(){
        System.out.println("Введите данные для преподавателя: возраст, имя, квалификация");
        teacher = new Teacher(scanner.nextInt(), scanner.next(), scanner.next());
        System.out.println("Введите данные для работника: возраст, имя, должность");
        worker = new Worker(scanner.nextInt(), scanner.next(), scanner.next());
        for (int i = 0; i < pupils.length; i++) {
            System.out.println("Введите данные для ученика: возраст, имя, направление");
            pupils[i] = new Pupil(scanner.nextInt(), scanner.next(), scanner.next());
        }
    }

    public void performLection(){
        System.out.println("Введите название лекции");
        String lection = scanner.next();
        teacher.doWork("ведет лекцию по " + lection);
        for (int i = 0; i < pupils.length; i++) {
            pupils[i].doWork("посещает лекцию по " + lection);
        }
        worker.doWork("оплачивает лекцию по " + lection);
    }




}
