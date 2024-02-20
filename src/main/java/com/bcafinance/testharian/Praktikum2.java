package com.bcafinance.testharian;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author agam a.k.a. Agam Theos
Java Developer
Created on 20/02/2024 8:52
@Last Modified 20/02/2024 8:52
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        double doubleX = 0;
        int intY = 0;
        boolean boolA = true;
        System.out.println("Masukkan beberapa angka : ");
        Scanner sc = new Scanner(System.in);
        try {
            while (boolA) {
                doubleX += sc.nextDouble();
                intY += 1;
            }
        } catch (Exception e) {
            System.out.println("Calculating...");
        } finally {
            System.out.println("Rata-rata: " + doubleX / intY);
        }
    }
}
