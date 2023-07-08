package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        question01();
//        question02();
    }

    private static void question02() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner.nextInt(); // 10\n
        scanner.nextInt();
        String line = scanner2.nextLine(); //\n
        System.out.println("line = " + line);
        System.out.println(Arrays.toString(line.getBytes()));
    }

    static class EvenNumberPredicate implements Predicate<Integer> {

        @Override
        public boolean test(Integer number) {
            return number % 2 == 0;
        }
    }

    private static void question01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
//        list.removeIf(new EvenNumberPredicate());
        list.removeIf(number -> number % 2 == 0);
//        List<Integer> itemToRemove = new ArrayList<>();
//        for (Integer item : list) {
//            if (item % 2 == 0) {
////                list.remove(item);
//                itemToRemove.add(item);
//            }
//        }
//        list.removeAll(itemToRemove);
        System.out.println(list);
    }
}
