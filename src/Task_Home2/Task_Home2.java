package Task_Home2;

import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class Task_Home2 {
    public static void factor(){
        Scanner scan = new Scanner(System.in);
        int factorial = scan.nextInt();
        int raise = 1;
        int sum = 1;
        for (int i = 0; i<=factorial;i++){
            int fac = raise * i;
            sum = sum * fac;
            System.out.println(sum);
        }
    }
}
