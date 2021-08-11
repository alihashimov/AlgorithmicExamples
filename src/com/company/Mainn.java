package com.company;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        System.out.print("yatırım məbləğini daxil edin: ");
        double yatirim = new Scanner(System.in).nextDouble();
        System.out.print("Faiz dərəcəsini daxil edin:");
        double faizDerecsi = new Scanner(System.in).nextDouble();
        System.out.print("İllərin sayını daxil edin:");
        int il = new Scanner(System.in).nextInt();

           faizDerecsi *= 0.01;


        System.out.println("İllərin Gələcək Dəyəri");
        for (int i = 1; i <= il; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
          System.out.printf(i + "%" + formatter + ".2f\n", gelecekYatirimDeyeri(yatirim, faizDerecsi / 12, i));
        }
    }

    public static double gelecekYatirimDeyeri(double yatirimMeblegi, double ayliqFaizDerecesi, int iller) {
        return yatirimMeblegi * Math.pow(1 + ayliqFaizDerecesi, iller * 12);
    }
}

