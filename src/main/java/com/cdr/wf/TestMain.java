package com.cdr.wf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestMain {
    public static void Tain(String[] args123) {
        System.out.printf("Hello and welcome new !");

        String xyaz = "Hello";
        int yaz = 123;

        for (int i = 1; i <= 5; i++) {
            int j = i * 2;
            System.out.println("i = " + i);
        }
    }

    public static void m1() {
        System.out.println("Test method called");
    }

    public static void m2(String[] args123) {
        System.out.printf("Hello and welcome new !");

        String xyaz = "Hello";
        int yaz = 123;

        for (int i = 1; i <= 5; i++)
        {
            if (true) System.out.println("This is a test");
            int j = i * 2;
            System.out.println("i = " + i);
            String message = "This is a message";
            int m = 10;
            for (int k = 0; k < 5; k++) {
                System.out.println("k = " + k+m);
            }
        }
    }
}
