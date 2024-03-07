package com.example.springbootdemo;

import com.example.springbootdemo.bean.AllpeopleBean;
import com.example.springbootdemo.service.AllpeopleService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests {
    @Resource
    AllpeopleService allpeopleService;

    @Test
    void contextLoads() {
        AllpeopleBean allpeopleBean=allpeopleService.logIn("1","123456");
        System.out.println(allpeopleBean.getUsername());
    }

}
