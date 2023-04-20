//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Seminar2_DZ;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(("Введение длину списка : "));
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < N; i++){
            int ran = random.nextInt(N);
            array.add(ran);
        }
        System.out.println("Случайный список целых чисел: \n " + array);
        for (int i = array.size()-1; i>= 0; i--){
            int evenNum = array.get(i)%2;
            if (evenNum == 0){
                array.remove(i);
            }
        }
        System.out.println("Список без четных чисел \n " + array);

    }
}
