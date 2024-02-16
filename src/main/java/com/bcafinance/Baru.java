package com.bcafinance;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author agam a.k.a. Agam Theos
Java Developer
Created on 15/02/2024 15:10
@Last Modified 15/02/2024 15:10]
Version 1.0
*/

public class Baru {
    public static void main(String[] args) throws CustomException {
        try {
            // initialize start timer
            long start = System.nanoTime();
            System.out.println(coba());
            System.out.println(coba("Agam"));
            System.out.println(coba("Agam", "Theos"));
            // initialize end timer
            long end = System.nanoTime();
            // print the time difference
            System.out.println("Time difference: " + (end - start) + "ns");
        } catch (Exception e) {
            throw new CustomException("An error occurred during execution.", e);
        }
    }

    public static String coba() {
        return "coba";
    }

    public static String coba(String x) {
        return x + "coba";
    }

    public static String coba(String x, String y) {
        return x + y + "coba";
    }
}

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
