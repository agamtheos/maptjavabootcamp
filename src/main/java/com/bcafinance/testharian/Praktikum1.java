package com.bcafinance.testharian;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author agam a.k.a. Agam Theos
Java Developer
Created on 15/02/2024 15:10
@Last Modified 15/02/2024 15:10
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String input = scanner.nextLine();

        scanner.close();

        int hasil = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int val = ch;

            if(val < 97 || val > 122) {
                hasil += val;
            }
        }

        System.out.println("Hasil: " + hasil);
    }
}
