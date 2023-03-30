package com.mirea.kt.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.printf("Practical task 6. Variant 2. Student Kalakutin S.R. Group RIBO-04-21 \n \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь к файлу для десериализации: ");
        String path = scanner.nextLine();
        LoaderRunnable lr = new LoaderRunnable(path);
        Thread th = new Thread(lr);
        th.start();

    }
}