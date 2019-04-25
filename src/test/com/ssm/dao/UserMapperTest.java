package com.ssm.dao;

import com.ssm.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by 王璐 on 2019/4/22.
 */
public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("王璐");
        user.setAge(25);
        user.setSex("男");
        user.setEmail("2011323426@qq.com");
        int result = mapper.insert(user);
        System.out.println(result);
        assert (result == 1);
    }

}