package cw.kyu6;

import java.util.*;
import java.util.function.BiPredicate;


public class Millipede2 {
    public static void main(String[] args) {
        String[] words = new String[]
                {"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
//        String[] wordsFalse = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
        String[] words3 = new String[]{"screen", "desire", "theater", "excess", "night"};
        System.out.println(check(words3));
    }

    public static boolean check(String[] words) {
        Map<String, List<String>> edges = buildGraph(words);
        return findPath(edges, words);
    }

    private static boolean findPath(Map<String, List<String>> edges, String[] words) {
        for (Map.Entry<String, List<String>> entry : edges.entrySet()) {
            System.out.println("Checking word: " + entry.getKey());

            Deque<String> deque = new LinkedList<>();
            deque.add(entry.getKey());

            ArrayList<String> searched = new ArrayList<>();

            while (deque.size() > 0) {
                String word = deque.pop();
                searched.add(word);
                for (String s : entry.getValue()) {
                    if (!searched.contains(s)) {
                        deque.add(s);
                    }
                }
            }

//            for (String s : searched) {
//                System.out.print(s + " ");
//            }
//            System.out.println("\n");

            if (searched.size() == words.length) {
                return true;
            }
        }

        return false;
    }

    private static Map<String, List<String>> buildGraph(String[] words) {
        List<String> vertices = new ArrayList<>(Arrays.asList(words));
        return getEdges(vertices);
    }

    private static Map<String, List<String>> getEdges(List<String> vertices) {
        Map<String, List<String>> result = new HashMap<>();
        BiPredicate<String, String> endsStarts = (a, b) -> b.startsWith(a.substring(a.length() - 1));

        for (String word : vertices) {
            List<String> neighbors = new ArrayList<>();
            for (String anotherWord : vertices) {
                if ((anotherWord != word) && endsStarts.test(word, anotherWord)) {
                    neighbors.add(anotherWord);
                }
            }
            result.put(word, neighbors);
        }
        return result;
    }
}
