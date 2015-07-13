package src;

import java.io.IOException;

/**
 * Created by User on 09.07.2015.
 */
public class Task2 {

    public static void main(String[] args) throws IOException {

        //двумерный массив и вывести сумму каждой строки, поменять местами максимум и минимум


        double[][] arr = {
                {1, 2, 4},
                {5, 3, 2},
                {6, 4, 3},
                {0, 0, 0}
        };


        double[] sum = new double[arr.length];


        double max = 0, min = Double.MIN_VALUE;
        int indMax = 0, indMin = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] = sum[i] + arr[i][j];
            }

            if (sum[i] > max) {
                max = sum[i];
                indMax = i;
            }

            if (sum[i] < min) {
                min = sum[i];
                indMin = i;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum[i]);
        }

        double t;
        t = sum[indMax];
        sum[indMax] = sum[indMin];
        sum[indMin] =t ;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum[i]);
        }

    }

}
