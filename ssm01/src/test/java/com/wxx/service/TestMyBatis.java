package com.wxx.service;

import com.wxx.dao.IPersonDao;
import com.wxx.domain.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    private SqlSession session;
    @Before
    public void init(){
        // 加载配置文件
        InputStream in = TestMyBatis.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        session = factory.openSession();
    }
    @After
    public void destroy(){
        session.commit();
        session.close();
    }
    @Test
    public void test01(){
        //核心对象是session
        //Mybatis的特点是代码与sql分开的，需要映射文件
        IPersonDao dao = session.getMapper(IPersonDao.class);
        List<Person> list =dao.findAll();
        System.out.println(list);
    }
    @Test
    public void test02(){
        IPersonDao dao =session.getMapper(IPersonDao.class);
        Person p = new Person("Tom",2000.00);
        dao.save(p);
    }
}
