package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ServiceImpl srv;

    @Test
    void contextLoads() {
    }

    void testFoo() {
        assertEquals(-1, srv.foo());
    }
}
