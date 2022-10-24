package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * @description: TODO
     * @author lipeng
     * @date
     * @version 1.0
     *
     *mybatis面向接口编程的两个一致
     * 1：映射文件的namespace需要和mapper接口的全类名保持一致
     * 2:映射文件sql语句的id 要和mapper接口的方法名保持一致

     */
    /**
     * @description: 添加用于
     * @author lipeng
     * @date
     * @version 1.0
     */
    int insertUser();
    /**
     * @description: 修改用户信息
     * @author lipeng
     * @date
     * @version 1.0
     */
    int updateUser();

    /**
     * @description: 删除用户信息
     * @author lipeng
     * @date
     * @version 1.0
     */

    void deleteUser();
    /**
     * @description: 根据id查询用户信息
     * @author lipeng
     * @date
     * @version 1.0
     */
    User getUserById();
    /**
     * @description: 查询所有的用户信息
     * @author lipeng
     * @date
     * @version 1.0
     */
    List<User>getAllUsers();
}
