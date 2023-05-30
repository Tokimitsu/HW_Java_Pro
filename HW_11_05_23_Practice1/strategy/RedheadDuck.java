package strategy;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Qunack();
    }

    @Override
    public void display() {
       System.out.println("German duck");
    }

    /*
     Дз лекции
    1) Создать абстрактный класс(контракт) для автосалона. Придумать общие свойства для автомобилей
    2) Реализовать несколько конкретных классов автомобилей
    3) Создать работников автосалона: менеджер, продавец, охранник и т.д.
    4) Сделать класс для управления автосалоном
    5) Подумать о подключении интерфейсов в разрабатываемую систему
    6) Попробовать запретить наследование и переопределение классов и методов
    7) Сделать метод, который примет произвольное количество параметров

    Хорстман:
     4-5 глава Объекты, ООП, наследование
     6 глава Интерфейсы

     */

    /*
    Дз практика
    1) Из первой лекции преобразовать класс Tel-Ran в синглтон(синглетный класс)
    2) К программе для управления утками добавить полеты с пропеллером и утку издающую звук squeek
    3*) Подумать о наследовании
    Банда четырех(книга): 1 Глава - Стратегия
    5 Глава - Синглтон
     */
}