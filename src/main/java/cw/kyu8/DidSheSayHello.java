package cw.kyu8;

import java.util.function.Predicate;

/**
 * https://www.codewars.com/kata/56a4addbfd4a55694100001f
 */
public class DidSheSayHello {
    public static boolean validateHello(String greetings){
        Predicate<String> contains = s ->  s.contains("hello") ||
                s.contains("ciao") || s.contains("salut") || s.contains("hallo") ||
                s.contains("hola") || s.contains("ahoj") || s.contains("czesc");

        return contains.test(greetings.toLowerCase());

    }
}
