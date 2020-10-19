package com.wxx.service;

import com.wxx.domain.Person;
import com.wxx.service.impl.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestPersonService {
    private static final Logger log = Logger.getLogger(TestPersonService.class.getName());
    @Autowired
    IPersonService personService;
    @Test
    public void test01(){//

    }
    @Test
    public void test02(){//DI
        System.out.println(personService);
    }
    @Test
    public void test03(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("jack",100.00));
        personList.add(new Person("rose",200.00));
        personList.add(new Person("tom",300.00));
        personService.save(personList);
    }
}
