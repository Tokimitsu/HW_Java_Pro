package institute;

public abstract class Human {                // Создаем контракт на реализацию наследования от этого класса. Делаем его абстрактнцм
    private int age;
    private String status;
    private String name;
    private static int count = 0;
    private int id;

    public Human(int age, String status, String name) {
        this.age = age;
        this.status = status;
        this.name = name;
        id = count;                 // Присваиваю значение статической переменной
        count++;                    // Учитываю создание объекта в классе, таким образом у следующего объекта будет уникальный идентификатор
    }

    public abstract void  doWork(String str);

    public void write(){
        System.out.println(status+ " " + name + " is writing");
    }

    // Методы акссесоры. Используем только getter-ы, чтобы доступ был только по чтению
    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
