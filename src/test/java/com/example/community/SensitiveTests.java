package com.example.community;

import com.example.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "可以赌博";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        text = "赌博☆嫖娼";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
