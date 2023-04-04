package Task_Home1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n).

import java.util.Scanner;

public class Task_Home1 {
    public static void Task_Home1() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = i * (i + 1) / 2;
            System.out.println(sum);
        }
    }
}
