package com.wxx.service;

import com.wxx.dao.IPersonDao;
import com.wxx.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class TestDateSource {
    private static final Logger log = Logger.getLogger(TestDateSource.class.getName());
    @Qualifier("IPersonDao")
    @Autowired
    IPersonDao dao;
    @Test
    public void test01() throws SQLException {
        List<Person> date = dao.findAll();
        System.out.println(date);
    }
    @Test
    public void test02() throws SQLException{
        Person p =new Person("Cindy",200.00);
        dao.save(p);
    }
}
