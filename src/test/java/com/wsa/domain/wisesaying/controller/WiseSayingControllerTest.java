package com.wsa.domain.wisesaying.controller;

import com.wsa.App.App;
import com.wsa.standard.util.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {
    @Test
    @DisplayName("=== 명언 앱 ===")
    public void t1() {
        // 종료를 선입력
        Scanner scanner = TestUtil.getScanner("종료");
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        // 앱을 실행
        App app = new App(scanner);
        app.run();

        String output = outputStream.toString();

        // 선입력 해제 출력
        TestUtil.clearSetOutToByteArray(outputStream);

        // 문자열 비교
        assertThat(output)
                .contains("=== 명언 앱 ===");

    }

    @Test
    @DisplayName("명령 > ")
    public void t2() {
        Scanner scanner = TestUtil.getScanner("""
                목록
                종료
                """);
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        App app = new App(scanner);
        app.run();

        String output = outputStream.toString();

        // 선입력 해제 출력
        TestUtil.clearSetOutToByteArray(outputStream);

        // 문자열 비교
        assertThat(output)
                .contains("명령 > ");

    }
}
