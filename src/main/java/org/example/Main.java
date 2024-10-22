package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String[] colors = {"Зеленой", "Красной","Желтой","Белой","Черной"};
            String[] animals = {"Крысы", "Коровы", "Тигра", "Зайца","Дракона", "Змеи",
            "Лошади","Овцы","Обезьяны","Курицы","Собаки","Свиньи"};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите год: ");
            int god = scanner.nextInt();
            int god1 = god - 1984;

            int animal = (god1 % 12 + 12) % 12;
            int color = (god1 % 10 + 10) % 5;

            System.out.println("Это год " + colors[color] + " " + animals[animal] + ".");
        }
    }
