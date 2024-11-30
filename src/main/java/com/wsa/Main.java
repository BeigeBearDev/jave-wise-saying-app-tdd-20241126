package com.wsa;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lab1();
        lab2();
    }

    // 스캐너를 통해서 입력할 수 있는 방법
    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령 > ");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);

    }

    // 명령어를 미리 준비해놓고 로봇이 입력할 수 있도록 실험을 하였다.
    private static void lab2() {
        InputStream in = new ByteArrayInputStream("홍길동\n갑을병".getBytes());
        Scanner scanner = new Scanner(in);

        System.out.println("명령 > ");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);

        System.out.println("명령 > ");
        cmd  = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);

    }
}