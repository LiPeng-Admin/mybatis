package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
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
 * @date 2022/10/23 11:58
 */
public class MybatisTest {
    /**
     * @description: TODO
     * @author lipeng
     * @date
     * @version 1.0
     * sql session默认不自动提交事务，若需要自动提交事务，可以使用sqlSessionFactory.openSession(true)
     */
    @Test
    public void testMybatis() throws Exception {
        //加载核心配置文件
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resource);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int result = mapper.insertUser();
        //提交事务
//        sqlSession.commit();
        //打印
        System.out.println("result:" + result);

    }

    @Test
    public void testCRUD() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactory = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlsessionFactory = sqlSessionFactory.build(resourceAsStream);
        SqlSession sqlSession = sqlsessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //修改用户信息
//        int result = mapper.updateUser();
//        System.out.println("result:"+result);
        //删除用户信息
//        mapper.deleteUser();
        //根据id查询用户信息
//        User user = mapper.getUserById();
//        System.out.println("user:" + user);
        //查询所有的用户信息
        List<User> userList = mapper.getAllUsers();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));

        }
    }

}
