package com.tomshidi.security.springboot.service.impl;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author TomShiDi
 * @description
 * @date 2020/11/14 14:04
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class SpringDataUserDetailServiceImplTest extends TestCase {

    @Autowired
    private SpringDataUserDetailServiceImpl userDetailService;

    @Test
    public void testLoadUserByUsername() {
        UserDetails userDetails = userDetailService.loadUserByUsername("tomshidi");
        assertNotNull(userDetails);
    }
}