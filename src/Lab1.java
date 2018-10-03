/*
 * Copyright © 2018 Apollo Foundation
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class Lab1 {
    private static final int SIZE = 6;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final int MIN_RANDOM_NUMBER = -5;

    public static void main(String[] args) {
        double[][] a = new double[SIZE][SIZE];
        fillArrayWithRandoms(a);
        System.out.println(Arrays.deepToString(a));
        System.out.println(sumNumbersBetweenTwoNegative(a));
    }

    private static void fillArrayWithRandoms(double[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextDouble() * (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + MIN_RANDOM_NUMBER ;
            }
        }
    }

    private static double sumNumbersBetweenTwoNegative(double[][] a) {
        Pair<Integer, Integer> firstPos = findNegativePos(a, 0);
        Pair<Integer, Integer> secondPos = findNegativePos(a, 1);
        if (firstPos == null || secondPos == null) {
            //matrix is invalid, two negative numbers are required
            throw new IllegalArgumentException("Matrix 'a' should contain at least two negative values");
        }
        return sum(a, firstPos, secondPos);
    }

    private static double sum(double[][] a, Pair<Integer, Integer> firstPos, Pair<Integer, Integer> secondPos) {
        double sum = 0;
        for (int i = firstPos.a; i <= secondPos.a; i++) {
            int end = secondPos.a == i ? secondPos.b : a[i].length;
            int start = firstPos.a == i ? firstPos.b + 1: 0 ;
            for (int j = start; j < end; j++) {
                    sum += a[i][j];
            }
        }
        return sum;
    }

    private static Pair<Integer, Integer> findNegativePos(double[][] a, int skipCount) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0 && skipCount-- == 0) {
                    return new Pair<>(i, j);
                }
            }
        }
        return null;
    }

    @Test
    public void testSum() {
        double[][] doubles = new double[][] {{2, -1}, {-3, 4}};
        Assert.assertEquals(0, sumNumbersBetweenTwoNegative(doubles), 0.0);
        doubles = new double[][] {{2, -1}, {1, -4}};
        Assert.assertEquals(1, sumNumbersBetweenTwoNegative(doubles), 0.0);
        doubles = new double[][] {{-1, -1}, {1, -4}};
        Assert.assertEquals(0, sumNumbersBetweenTwoNegative(doubles), 0.0);
        doubles = new double[][] {{-1, 1}, {1, -4}};
        Assert.assertEquals(2, sumNumbersBetweenTwoNegative(doubles), 0.0);
        doubles = new double[][] {{-1, -1}, {-1, -4}};
        Assert.assertEquals(0, sumNumbersBetweenTwoNegative(doubles), 0.0);
        doubles = new double[][] {{1, 1, -1}, {1, 4, 5}, {4, 3, -1}};
        Assert.assertEquals(17, sumNumbersBetweenTwoNegative(doubles), 0.0);

    }

    private static class Pair<T, V> {
        private T a;
        private V b;

        private Pair(T a, V b) {
            this.a = a;
            this.b = b;
        }
    }
}
