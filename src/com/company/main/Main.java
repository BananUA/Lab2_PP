package com.company.main;

import com.company.car.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(1, "Toyota", 2020, 25000.0, "ABC123");
        cars[1] = new Car(2, "Honda", 2018, 22000.0, "XYZ456");
        cars[2] = new Car(3, "Ford", 2019, 28000.0, "DEF789");
        cars[3] = new Car(4, "Toyota", 2017, 20000.0, "GHI101");
        cars[4] = new Car(5, "BMW", 2022, 35000.0, "JKL202");

        // a) список автомобілів заданої моделі;
        String desiredModel = "Toyota";
        System.out.println("Список автомобілів моделі " + desiredModel + ":");
        printCarsByModel(cars, desiredModel);

        // b) список автомобілів заданої моделі, які експлуатуються більше n років;
        int years = 3;
        System.out.println("Список автомобілів моделі " + desiredModel + ", які експлуатуються більше " + years + " років:");
        printCarsByModelAndYears(cars, desiredModel, years);

        // c) список автомобілів заданого року випуску, ціна яких більше вказаної;
        int desiredYear = 2019;
        double desiredPrice = 24000.0;
        System.out.println("Список автомобілів року випуску " + desiredYear + ", ціна яких більше " + desiredPrice + ":");
        printCarsByYearAndPrice(cars, desiredYear,desiredPrice);
    }


    private static void printCarsByModel(Car[] cars, String model) {
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                System.out.println(car);
            }
        }
    }

    // Метод для виведення автомобілів заданої моделі, які експлуатуються більше n років
    private static void printCarsByModelAndYears(Car[] cars, String model, int years) {
        int currentYear = 2023; // Поточний рік
        for (Car car : cars) {
            if (car.getModel().equals(model) && (currentYear - car.getYear()) > years) {
                System.out.println(car);
            }
        }
    }

    // Метод для виведення автомобілів заданого року випуску, ціна яких більше вказаної
    private static void printCarsByYearAndPrice(Car[] cars, int year, double desiredPrice) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > desiredPrice) {
                System.out.println(car);
            }
        }
    }

}
