package com.tomshidi.security.springboot.repository;

import com.tomshidi.security.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author TomShiDi
 * @description `
 * @date 2020/11/14 13:27
 **/
@Mapper
public interface UserMapper {

    /**
     *
     * @param username `
     * @return
     */
    UserEntity getUserByUsername(@Param("username") String username);
}
