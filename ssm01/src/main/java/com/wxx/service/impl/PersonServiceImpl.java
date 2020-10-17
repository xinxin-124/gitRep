package com.wxx.service.impl;

import com.wxx.dao.IPersonDao;
import com.wxx.domain.Person;
import com.wxx.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements IPersonService {
    @Qualifier("IPersonDao")
    @Autowired
    IPersonDao ipersonDao;
    @Override
    public List<Person> findAll() {
        //IPersonDao personDao = new PersonImpl;
        List<Person> list = ipersonDao.findAll();
        return list;
    }

    @Override
    public void save(Person person) {
        ipersonDao.save(person);
    }

    @Override
    public void save(List<Person> persons) {
        for(int i = 0;i <persons.size();i++){
            if(i==2){
                //System.out.println(1/0);
            }
            ipersonDao.save(persons.get(i));
        }
    }
}
