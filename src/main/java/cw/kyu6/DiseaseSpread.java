package cw.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/566543703c72200f0b0000c9
 */

public class DiseaseSpread {
    public static void main(String[] args) {
        System.out.println(epidemic2(14, 336, 996, 2, 0.00206, 0.41));
    }

    public static int epidemic(int tm, int n, int s0, int i0, double b, double a) {
        double dt = (double) tm/n;

        double[] ss = new double[n];
        double[] is = new double[n];
        double[] rs = new double[n];

        ss[0] = s0;
        is[0] = i0;
        rs[0] = 0;

        for (int i = 1; i < n; i++) {
            rs[i] = rs[i - 1] + (dt * is[0] + a);
            is[i] = is[i - 1] + (dt * (b * ss[i - 1] * is[i - 1] - a * is[i - 1]));
            ss[i] = ss[i - 1] - (dt * b * ss[i - 1] * is[i - 1]);
        }

        return (int) Arrays.stream(is)
                .max().getAsDouble();
    }

    public static int epidemic2(int tm, int n, int s0, int i0, double b, double a) {
        double dt = (double) tm/n;

        ArrayList<Double> ss = new ArrayList<>();
        ArrayList<Double> is = new ArrayList<>();
        ArrayList<Double> rs = new ArrayList<>();

        ss.add((double) s0);
        is.add((double) i0);
        rs.add(0.0);

        IntStream.range(1, n).forEach(index -> {
            rs.add(rs.get(index - 1) + dt * is.get(index - 1) + a);
            is.add(is.get(index - 1) + (dt * (b * ss.get(index - 1) * is.get(index - 1) - a * is.get(index - 1))));
            ss.add(ss.get(index - 1) - dt * b * ss.get(index - 1) * is.get(index - 1));
        });

        return is.stream().max(Double::compareTo).get().intValue();
    }
}
