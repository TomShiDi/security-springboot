package com.tomshidi.security.springboot.repository;

import com.tomshidi.security.springboot.entity.PermissionEntity;
import com.tomshidi.security.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TomShiDi
 * @description `
 * @date 2020/11/14 13:27
 **/
@Repository
public interface UserMapper {

    /**
     * `
     * @param username `
     * @return `
     */
    UserEntity getUserByUsername(@Param("username") String username);

    /**
     * `
     * @param userId `
     * @return `
     */
    List<PermissionEntity> getUserPermissionByUserId(@Param("user_id") String userId);
}
