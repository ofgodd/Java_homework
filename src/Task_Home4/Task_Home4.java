package Task_Home4;

import java.util.Scanner;

public class Task_Home4 {
    public static void calculator () {
        String operation = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int firstNum = scan.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число число : ");
        int secondNum = scanner.nextInt();
        Scanner sing = new Scanner(System.in);
        System.out.println("Введите знак : ");
        int singNum = scan.nextInt();
        if (operation.equals("+")) {
            int sum = firstNum + secondNum;
            System.out.println("Ответ: " + sum);}
        else if (operation.equals("-")) {
                int difference = firstNum - secondNum;
                System.out.println("Ответ: " + difference);
            } else if (operation.equals("*")) {
                int multiply = firstNum * secondNum;
                System.out.println("Ответ: " + multiply);
            } else if (operation.equals("/")) {
                int division = firstNum / secondNum;
                System.out.println("Ответ: " + division);
            }
        }
    }