package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface ParameterMapper {
    /**
     * @description: 查询员工的所有信息
     * @author lipeng
     * @date
     * @version 1.0
     */
    List<User> getAllUsers();
    /**
     * @description: 根据用户名查询用户信息
     * @author lipeng
     * @date
     * @version 1.0
     */
    User getUserByUsername(String username);
    /**
     * @description: 验证登录
     * @author lipeng
     * @date
     * @version 1.0
     */
    User checkLogin(String username, String password);
}
