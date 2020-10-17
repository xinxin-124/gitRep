package com.wxx.dao.impl;

import com.wxx.dao.IPersonDao;
import com.wxx.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
@Deprecated
@Repository
public class PersonDaoImpl implements IPersonDao {
    @Override
    public List<Person> findAll() {
        System.out.println("find All");
        return null;
    }

    @Override
    public void save(Person person) {
        System.out.println("save");
    }
}
