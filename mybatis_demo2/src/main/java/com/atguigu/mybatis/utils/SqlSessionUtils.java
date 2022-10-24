package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/23 22:35
 */
public class SqlSessionUtils {
    public static SqlSession getSqlSession() {
        //加载核心配置文件
        SqlSession sqlSession = null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
            //获取sqlSession
            sqlSession = sqlSessionFactory.openSession(true);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;

    }
}
