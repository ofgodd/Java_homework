package Seminar2_DZ;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task7 {

    public static void Bubble() throws IOException {
        Logger logger = Logger.getLogger(Task7.class.getName());
        FileHandler fh = new FileHandler("logTask7.xml");
        logger.addHandler(fh);
        Formatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = {5, 7, -1, -7, 3, 54, 0};
        int[] newArr = BubbleSort(array);
        System.out.println("\n Отсортированный массив: \n");
    }

    public static int[] BubbleSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}