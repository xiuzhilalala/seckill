package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
        ImmutablePair<String, String> p1 = ImmutablePair.of("s", "sd");
        ImmutablePair<String, String> p2 = ImmutablePair.of("s", "sd");
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.left);
        System.out.println(p1.right);
        p1.setValue("a");
        System.out.println(p1);
    }


}
