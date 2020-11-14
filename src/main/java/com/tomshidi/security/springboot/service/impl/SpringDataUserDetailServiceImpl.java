package com.tomshidi.security.springboot.service.impl;

import com.tomshidi.security.springboot.entity.PermissionEntity;
import com.tomshidi.security.springboot.entity.UserEntity;
import com.tomshidi.security.springboot.repository.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author TomShiDi
 * @description
 * @date 2020/11/8 16:58
 **/
@Service
public class SpringDataUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    private final Logger logger = LoggerFactory.getLogger(SpringDataUserDetailServiceImpl.class);
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("username= {}", username);
        UserEntity userEntity = userMapper.getUserByUsername(username);
        List<PermissionEntity> permissionEntityList = userMapper.getUserPermissionByUserId(userEntity.getId());
        List<String> permissionCode = permissionEntityList.stream().map(PermissionEntity::getCode).collect(Collectors.toList());
        if (userEntity == null) {
            return null;
        }
        return User.withUsername(userEntity.getUsername()).password(userEntity.getPassword()).authorities(permissionCode.toArray(new String[]{})).build();
    }

}
