package com.wsa.standard.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

// TestUtil을 테스트 하는 클래스
public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.getScanner()")
    public void t1() {
        Scanner scanner = TestUtil.getScanner("""
                등록
                죽고자 하면 살 것이고, 살고자 하면 죽을 것이다.
                이순신
                """.stripIndent().trim());

        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("죽고자 하면 살 것이고, 살고자 하면 죽을 것이다.");
        assertThat(author).isEqualTo("이순신");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray()")
    public void t2() {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

        System.out.println("2 / 이순신 / 죽고자 하면 살 것이고, 살고자 하면 죽을 것이다.");

        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

        assertThat(out).isEqualTo("2 / 이순신 / 죽고자 하면 살 것이고, 살고자 하면 죽을 것이다.");
        System.out.println("이제는 화면에 출력됩니다.");
    }
}
