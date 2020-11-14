package com.tomshidi.security.springboot.entity;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.Serializable;

/**
 * @author TomShiDi
 * @description
 * @date 2020/11/14 15:37
 **/
public class PermissionEntity implements Serializable {

    private String id;

    private String code;

    private String description;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
