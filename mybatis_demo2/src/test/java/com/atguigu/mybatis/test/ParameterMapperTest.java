package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/23 18:11
 */
public class ParameterMapperTest {
    /**
     * @description: mybatis 获取参数值得两种方式：${},#{}
     * ${}:本质为字符串拼接
     * #{}:本质为占位符赋值
     * @author lipeng
     * @date
     * @version 1.0
     */
    // MyBatis 获取参数值的各种情况
     /*
     1：mapper接口方法的参数为单个的字面量类型
     * 可以通过#{}和${}以任意的名称获取参数值，但是需要注意${}的单引号问题
      */


    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User username = mapper.getUserByUsername("admin");
        System.out.println(username);
    }
    /*2：mapper接口方法的参数为多个
     * */
    @Test
    public void testGetUserByUsernameAndPassword(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("admin", "123456");
        System.out.println(user);
    }



    @Test
    public void test() throws Exception {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> userList = mapper.getAllUsers();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));

        }
    }
}
