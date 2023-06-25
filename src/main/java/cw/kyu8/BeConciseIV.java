package cw.kyu8;

import java.util.ArrayList;
import java.util.Arrays;

public class BeConciseIV {
    public BeConciseIV() {

    }
    public static void main(String[] args) {
        String[] array = {"2", "3", "5", "7", "11"};
        System.out.println((kata(array, "5")));
        System.out.println((kata(array, "11")));

        BeConciseIV beConciseIV = new BeConciseIV();
    }

    public static String kata(String[] a, String s) {
        return Arrays.asList(a).contains(s) ? String.valueOf(Arrays.asList(a).indexOf(s)) : "Not found";
    }
}

