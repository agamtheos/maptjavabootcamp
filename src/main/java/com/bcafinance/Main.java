package com.bcafinance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String str = "Juara";
//        System.out.println(str.charAt(0));

        String str = "Hello Juara!";
        System.out.println(str.substring(6, 12));
        int id = 19;
        id = 29;
        float i = 2928.43f;
        System.out.println(i);

        String strx = "Agam";
        char a = 'A';
        int x = a;
        System.out.println(x);
        int d = 2131;
        long l = 923123123123123123L;
        int g = (int) l;
        System.out.println(g);

        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 6};
        System.out.println(arr.length);

        Boolean y = true;
        String k = "12";
        System.out.println(y);

        String intX = "Agam";
        Integer intY = 10;
        char[] charArr = intX.toCharArray();
        System.out.println(charArr);
        for (char c : charArr) {
            System.out.println(c);
        }
        System.out.println();

        StringBuilder sb = new StringBuilder();
        String sb1 = sb.toString();
        System.out.println(sb1);
        sb.append("KAJSNDKJSANDKASNDKAJSNDASKJDNSAKJDNSAKJDNSADJNSAKJDNAS");
        System.out.println(sb);
        System.out.println("test");
        String aa = "asdasdasdadas ";
        System.out.println(sb.length());
        sb.setLength(0);
        System.out.println(sb);

        System.out.println(aa.charAt(4));

        // perfomance looping better iterate an array, instead of String (using toCharArray())
        // String is immutable, so it's better to use StringBuilder

        // enrypt process is much longer than hashing



        double hasil = 75 / 8;
        System.out.println(hasil);

    }
}