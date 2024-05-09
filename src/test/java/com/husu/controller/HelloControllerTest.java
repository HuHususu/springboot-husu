package com.husu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huyong(husu)
 * @date 5/9/2024 5:25 PM
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void testDemo() {
        String demo = helloController.demo();
        System.out.println(demo);
    }

}