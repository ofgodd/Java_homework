package Seminar2_DZ;

import java.util.LinkedList;

public class Task10 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);

        for (int i = 0; i < 10; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 50);
        int num = (int) x;
        return num;
    }
}