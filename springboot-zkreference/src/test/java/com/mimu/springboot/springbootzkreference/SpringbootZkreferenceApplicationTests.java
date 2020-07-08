package com.mimu.springboot.springbootzkreference;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootZkreferenceApplicationTests {
    @Autowired
    protected ZKPropertyModel model;

    @Test
    void contextLoads() throws InterruptedException {
        while (true) {
            System.out.println(model.getAge());
            Thread.sleep(1000);
        }
    }

}
