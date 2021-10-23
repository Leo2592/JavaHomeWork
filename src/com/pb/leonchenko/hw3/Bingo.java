package com.pb.leonchenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int attempt = 1;
        String statement;
        int answer = 0;


        int x = random.nextInt(101);
        System.out.println("Игра началась! \nЯ загадал целое число, давай ты попробуешь его отгадать?");
        System.out.print("Подтвердите готовность, в виде \"Да\",\"Нет\": ");
        statement = in.next();
        while ("Да".equalsIgnoreCase(statement)) {
            System.out.println("x = " + x);
            System.out.print("Ваш ответ: ");
            answer = in.nextInt();
            if (answer == x) {
                System.out.println("Поздравляю, Вы угадали число с " + attempt + "-й попытки!");
                break;
            } else {
                if (answer > x) {
                    System.out.println("Вы не угадали, Ваше число больше загаданного!");
                } else {
                    System.out.println("Вы не угадали, Ваше число меньше загаданного!");
                }
                System.out.print("Продолжаем? (\"Да\",\"Нет\") :");
                statement = in.next();
                attempt++;
            }
        }

        switch (statement.toLowerCase()) {
            case "нет":
                System.out.println("Попробуй в следующий раз!");
                break;
            case "да":
                System.out.println("\nИгра закончена!");
                break;
            default:
                System.out.println("Я не понимаю других команд, попробуй заново!\nИгра закончена!");
        }
    }
}
