/*
 Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
Задача со *: Разработать интерфейс для VendingMachines на JFrame. В интерфейсе отобразить добавленные в main продукты(ListBox). 
Поле ввода наличности и кнопку "купить товар"! Все необходимые дополнительные методы класса VendingMachines и Product добавить самостоятельно.
 */
package HW1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<HotDrink> drinks = new LinkedList<>(List.of(new HotDrink(1, "Coffee", 100, 70),
                new HotDrink(1, "Coffee", 100, 80),
                new HotDrink(1, "Coffee", 100, 90),
                new HotDrink(1, "Coffee", 200, 70),
                new HotDrink(1, "Coffee", 200, 80),
                new HotDrink(1, "Coffee", 200, 90),
                new HotDrink(1, "Coffee", 400, 70),
                new HotDrink(1, "Coffee", 400, 80),
                new HotDrink(1, "Coffee", 400, 90),
                new HotDrink(2, "Cappuccino", 100, 70),
                new HotDrink(2, "Cappuccino", 100, 80),
                new HotDrink(2, "Cappuccino", 100, 90),
                new HotDrink(2, "Cappuccino", 200, 70),
                new HotDrink(2, "Cappuccino", 200, 80),
                new HotDrink(2, "Cappuccino", 200, 90),
                new HotDrink(2, "Cappuccino", 400, 70),
                new HotDrink(2, "Cappuccino", 400, 80),
                new HotDrink(2, "Cappuccino", 400, 90)));
        HotVendingMachine machine = new HotVendingMachine(drinks);

        machine.getDrink(getId(), getVolume(), getTemperature());

    }

    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: ");
        Integer drinkId = scanner.nextInt();

        return drinkId;

    }

    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обьем напитка(100мл, 200мл, 400мл): ");
        Integer drinkVolume = scanner.nextInt();

        return drinkVolume;
    }

    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drintemperature = scanner.nextInt();

        return drintemperature;
    }
}
