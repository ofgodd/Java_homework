package Seminar2_DZ;

import java.util.LinkedList;

    public class Task11 {
        public static void main(String[] args) {
            LinkedList<Integer> linked = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                enqueue(linked, getRandomNumber());
            }
            System.out.println(linked);

            System.out.println(dequeue(linked));
            System.out.println(linked);

            System.out.println(first(linked));
            System.out.println(linked);
        }

        public static void enqueue(LinkedList<Integer> linked, int num) {
            linked.addLast(num);
        }

        public static int dequeue(LinkedList<Integer> linked) {
            int num = linked.get(0);
            linked.remove(0);
            return num;
        }

        public static int first(LinkedList<Integer> linked) {
            int num = linked.get(0);
            return num;
        }

        public static int getRandomNumber() {
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;
        }
    }
}
