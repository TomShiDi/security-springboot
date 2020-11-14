package com.tomshidi.security.springboot;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author TomShiDi
 * @description
 * @date 2020/11/8 19:45
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestBCrypt extends TestCase {

    @Test
    public void bCrypt() {
        String byBCrypt = BCrypt.hashpw("123456", BCrypt.gensalt());
        System.out.println(byBCrypt);

        System.out.println(BCrypt.checkpw("123456", "$2a$10$v2LqUHOmqL928xLOOyS4tOOJv3SCHzs.do9RzFwng.J5ZhRc9DPPy"));
        System.out.println(BCrypt.checkpw("123456", "$2a$10$EV/EfvCJ5sLvvhC44Qkr5uLZpAie93ZGtL.r0J/ds6vCCXnlxfGV6"));
    }
}