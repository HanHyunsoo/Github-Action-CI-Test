package com.example.prtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @DisplayName("테스트")
    @Test
    void test() {
        assert 1 == 2;
    }
}
