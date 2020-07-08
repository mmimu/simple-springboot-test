package com.mimu.springboot.springbootzkreference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ZKCenterConfig.class)
public class ZKCenterModelTest {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(ZKCenterModelTest.class);
        ZKPropertyModel bean = run.getBean(ZKPropertyModel.class);
        while (true){
            System.out.println(bean.getAge());
            Thread.sleep(1000);
        }
    }
}
