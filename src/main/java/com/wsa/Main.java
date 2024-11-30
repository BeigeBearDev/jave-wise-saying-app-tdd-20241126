package com.wsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab1();
    }

    private static void lab1() {
        Scanner cmd = new Scanner(System.in);

        System.out.print("명령 > ");
        cmd.nextLine().trim();

        System.out.println("입력한 명령 > " + cmd);

    }
}