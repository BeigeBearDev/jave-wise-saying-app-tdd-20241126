package com.wsa;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lab1();
        // lab2();
        // lab3();
        lab4();
    }

    // 스캐너를 통해서 입력할 수 있는 방법
    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령 > ");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);
    }

    // 명령어를 미리 입력시켜놓고 입력할 수 있도록 실험을 하였다.
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

    // out을 통해서 입력된 사항을 print 하는 방법
    private static void lab3() {
        System.out.println("== lab3 시작 ==");

        System.out.println("안녕하세요.");
        System.out.println("안녕히가세요.");

        System.out.println("== lab3 종료 ==");
    }

    // out을 전환시켜 출력을 제어할 수 있는 방법
    private static void lab4() {
        System.out.println("== lab4 시작 ==");

        // 출력이 모니터로 안되도록 설정
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        System.out.println("안녕하세요.");
        System.out.println("안녕히가세요.");

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println("== lab4 종료 ==");

        System.out.println("출력 : " + output.toString());

        // output을 close(해제)하는 것은 위험성이 있어 감싸준다
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}