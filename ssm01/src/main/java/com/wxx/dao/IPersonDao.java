package com.wxx.dao;

import com.wxx.domain.Person;

import java.util.List;

public interface IPersonDao {
    List<Person> findAll();

    void save(Person person);
}
