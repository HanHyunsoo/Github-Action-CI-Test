package com.example.prtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @DisplayName("실패 케이스")
    @Test
    void failCase() {
        assert 1 == 2;
    }
}
