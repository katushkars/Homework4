public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1.1
        System.out.println("Задние 1.1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю, вы совершеннолетний!!");
        }
        if (age < 18) {
            System.out.println("Увы, вы не совершеннолетний, вам нужно немного подождать");
        }
        //задание 1.2
        System.out.println("Задние 1.2");
        int age2 = 24;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //задание 1.3
        System.out.println("Задние 1.3");
        int passenger = 150;
        if (passenger > 102) {
            System.out.println("Мест нет");
        }
        if (passenger > 60 && passenger <= 102) {
            System.out.println("Есть стоячие места");
        }
        if (passenger <= 60) {
            System.out.println("Есть сидячие места");
        }
        //Задание 2.1
        System.out.println("Задние 2.1");
        int age3 = 21;
        if (age3 >= 18) {
            System.out.println("Поздравляю, вы совершеннолетний!!");
        } else {
            System.out.println("Увы, вы не совершеннолетний, вам нужно немного подождать");
        }
        //задание 2.2
        System.out.println("Задние 2.2");
        int age4 = 22;
        if (age4 >= 7 && age4 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (age4 >= 18 && age4 < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }
        }
        //задание 2.3
        System.out.println("Задние 2.3");
        int passenger1 = 51;
        if (passenger1 > 102) {
            System.out.println("Мест нет");
        } else {
            if (passenger1 > 60 && passenger1 <= 102) {
                System.out.println("Есть стоячие места");
            } else {
                System.out.println("Есть сидячие места");
            }
        }
    }
    }
