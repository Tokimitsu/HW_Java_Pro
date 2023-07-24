package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Vault {

    public static void main(String[] args) {
        Map<Client, Integer> map = new HashMap<>();
        Client client1 = new Client("Ivan Ivanov", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client2 = new Client("Petr Petrov", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client3 = new Client("Mike Mikovery", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client4 = new Client("Sobak Sobakov", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client5 = new Client("Rulon Oboev", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client6 = new Client("Igor Voitenko", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client7 = new Client("Jan Bolvan", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client8 = new Client("Gay Rich", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client9 = new Client("Imya Familiya", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client10 = new Client("Taras Prosto", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client11 = new Client("Olena Olena", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client12 = new Client("Max Min", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client13 = new Client("Vika Victory", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client14 = new Client("Olga Matvey", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client15 = new Client("Crista Blessing", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client16 = new Client("Some Name", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client17 = new Client("Semen Active", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client18 = new Client("Inna More", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client19 = new Client("Pavel Petr", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client20 = new Client("Volodya Hoba", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client21 = new Client("Nina Nena", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client22 = new Client("Little Mouse", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));
        Client client23 = new Client("Humpty Dumpty", new BankCard(CardDataGenerator.generateCardData(),
                Currency.EUR, Status.BANNED));
        Client client24 = new Client("Lion King", new BankCard(CardDataGenerator.generateCardData(),
                Currency.GBP, Status.ACTIVE));
        Client client25 = new Client("GT 3000", new BankCard(CardDataGenerator.generateCardData(),
                Currency.USD, Status.ACTIVE));


        map.put(client1, new Random().nextInt(1000));
        map.put(client2, new Random().nextInt(1000));
        map.put(client3, new Random().nextInt(1000));
        map.put(client4, new Random().nextInt(1000));
        map.put(client5, new Random().nextInt(1000));
        map.put(client6, new Random().nextInt(1000));
        map.put(client7, new Random().nextInt(1000));
        map.put(client8, new Random().nextInt(1000));
        map.put(client9, new Random().nextInt(1000));
        map.put(client10, new Random().nextInt(1000));
        map.put(client11, new Random().nextInt(1000));
        map.put(client12, new Random().nextInt(1000));
        map.put(client13, new Random().nextInt(1000));
        map.put(client14, new Random().nextInt(1000));
        map.put(client15, new Random().nextInt(1000));
        map.put(client16, new Random().nextInt(1000));
        map.put(client17, new Random().nextInt(1000));
        map.put(client18, new Random().nextInt(1000));
        map.put(client19, new Random().nextInt(1000));
        map.put(client20, new Random().nextInt(1000));
        map.put(client21, new Random().nextInt(1000));
        map.put(client22, new Random().nextInt(1000));
        map.put(client23, new Random().nextInt(1000));
        map.put(client24, new Random().nextInt(1000));
        map.put(client25, new Random().nextInt(1000));

        System.out.println(showStatus(map, Status.ACTIVE));
        System.out.println();
        System.out.println(filterBalance(map, 435));
        System.out.println();
        System.out.println(cardHolderNames(map));
        System.out.println();
    }


    //Выводять всех клиентов у которых определенный статус карты
    public static List<Client> showStatus(Map<Client, Integer> map, Status status) {
        return map.entrySet().stream()
                .filter(entry -> entry.getKey().getBankCard().getStatus().equals(status))
                .map(Map.Entry::getKey)
                .toList();
    }
    //Группируют по балансу у кого больше или меньше какой-то суммы
    public static Map<Client, Integer> filterBalance(Map<Client, Integer> map, int input){
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() >= input)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    //Средний баланс по клиентам
    public OptionalDouble avgClientBalance (Map<Client, Integer> map){
        return map.entrySet().stream()
                .map(x-> x.getValue())
                .mapToInt(Integer::intValue)
                .average();
    }
    //Выводят только номера карт всех клиентов в формате имя номер
    public static List<String> cardHolderNames(Map<Client, Integer> map){
        return map.keySet().stream()
                .map(integer -> integer.getName() + " " + integer.getBankCard().getCardInfo())
                .toList();
    }

    //Выводят всех клиентов в у кого закончился срок действия карт


    //Сортируют по балансу

    //Группируют у кого закончился срок карт, а у кого нет.
}
