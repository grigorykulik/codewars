package cw.kyu6;

import java.util.*;
import java.util.function.BiPredicate;


public class Millipede {
    private static ArrayList<String[]> allCombinations = new ArrayList<>();
    public static void main(String[] args) {
        boolean result = check(new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"});
        System.out.println(result);

        boolean result2 = check(new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"});
        System.out.println(result2);
    }
    public static boolean check(String[] millipede) {
        allCombinations.clear();
        getAllCombinations(millipede.length, Arrays.copyOf(millipede, millipede.length));
        return checkArrays();
    }

    public static void getAllCombinations(int n, String[] elements) {
        if (n == 1) {
            printArray(elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                getAllCombinations(n-1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
        }
    }

    private static void printArray(String[] elements) {
        String[] arrayToAdd = new String[elements.length];

        for (int i = 0; i < elements.length; i++) {
            arrayToAdd[i] = elements[i];
        }
        allCombinations.add(arrayToAdd);
    }

    private static <T> void swap(T[] elements, int a, int b) {
        T tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

    private static boolean checkArrays() {
        BiPredicate<String, String> isMultipede = (a, b) -> b.startsWith(a.substring(a.length() - 1));
        boolean result = false;
        ArrayList<Boolean> results = new ArrayList<>();
        ArrayList<Boolean> intermediateResults = new ArrayList<>();

        for (String[] elements : allCombinations) {
            for (int i = 0; i < elements.length - 1; i++) {
                result = isMultipede.test(elements[i], elements[i + 1]);
                intermediateResults.add(result);
            }

            if (intermediateResults.stream().allMatch(n -> n.equals(Boolean.TRUE))) {
                results.add(true);
            } else {
                results.add(false);
            }
            intermediateResults.clear();
        }

        if (results.stream().anyMatch(e -> e.equals(Boolean.TRUE))) {
            return true;
        } else {
            return false;
        }
    }
}
