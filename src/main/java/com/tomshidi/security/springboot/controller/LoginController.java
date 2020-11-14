package com.tomshidi.security.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author TomShiDi
 * @date 2020/10/25 15:00
 **/
@RestController
public class LoginController {

    /**
     * @return **
     */
    @RequestMapping(value = "/login-success", produces = "text/plain;charset=utf-8")
    public String loginSuccess() {

        return getUsername() + "\t登录成功";
    }

    @PreAuthorize("hasAuthority('p1')")
    @GetMapping(value = "/r/r1", produces = "text/plain;charset=utf-8")
    public String r1() {
        return "访问资源1";
    }

    @GetMapping(value = "/r/r2", produces = "text/plain;charset=utf-8")
    public String r2() {
        return "访问资源2";
    }

    private String getUsername() {
        String username = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal == null) {
            username = "匿名";
            return username;
        }
        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            username = userDetails.getUsername();
        } else {
            username = principal.toString();
        }

        return username;
    }
}
