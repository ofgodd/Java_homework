//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package Domashka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



    public class Task13 {


        // Метод, который добавляет номера в книгу
        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }

        }

        // Метод, который печатает список контактов
        public static void printBook(Map<String, ArrayList<Integer>> map) {
            for (var item : map.entrySet()) {
                String phones = "";
                for (int el : item.getValue()) {
                    phones = phones + el + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }


        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            addNumber("Umar", 123, bookPhone);
            addNumber("Bogdan", 1234, bookPhone);
            addNumber("Umar", 546585, bookPhone);
            addNumber("Berger", 8956477, bookPhone);
            addNumber("Ivanov", 12356233, bookPhone);
            addNumber("Berger", 787897, bookPhone);
            printBook(bookPhone);
        }
    }

