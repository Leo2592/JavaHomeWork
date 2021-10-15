package com.pb.leonchenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите первое значение: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе значение: ");
        operand2 = scan.nextInt();
        System.out.print("Выберите знак арифметической операции (+,-,*,/): ");
        sign = scan.next();

        switch (sign){
            case "+":
                System.out.println("Результат:" + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат:" + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат:" + (operand1 * operand2));
            case "/":
                if(operand2 != 0 ){
                    System.out.println("Результат: " + (operand1 / operand2));
                } else {
                    System.out.println("Ошибка, деление на \"0\".\nПопробуйте заново!");
                }
        }
    }
}