package com.gem.nhom1.service.impl;

import com.gem.nhom1.dao.UserDao;
import com.gem.nhom1.model.User;
import com.gem.nhom1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by phuong on 1/19/2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    public List<User> getListUser() {
        return dao.getListUser();
    }

    public void save(User user) {
        dao.save(user);
    }
}
