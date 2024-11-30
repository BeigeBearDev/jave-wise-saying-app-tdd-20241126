package com.wsa.standard.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
