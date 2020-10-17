package com.wxx.service;

import com.wxx.domain.Person;

import java.util.List;

public interface IPersonService {
    //显示所有的person数据
    List<Person> findAll();
    //保存一个person数据
    void save(Person person);
    //保存全部数据
    void save(List<Person> persons);
}
