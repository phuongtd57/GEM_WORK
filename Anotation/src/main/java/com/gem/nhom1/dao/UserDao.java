package com.gem.nhom1.dao;

import com.gem.nhom1.model.User;

import java.util.List;

/**
 * Created by phuong on 1/19/2016.
 */
public interface UserDao {
    public List<User> getListUser();
    public void save(User user);
}
