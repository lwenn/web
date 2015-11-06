package com.lwenn.web.dao;

import com.lwenn.web.model.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by lwenn on 15/11/5.
 */
public class UserDao extends SqlMapClientDaoSupport {

    public void addUser(User user) {
        getSqlMapClientTemplate().insert("addUser", user);
    }

    public void updateUser(User user) {
        getSqlMapClientTemplate().update("modifyUser", user);
    }

    public void deleteUser(int id) {
        getSqlMapClientTemplate().delete("deleteUser", id);
    }

    public User getUserById(int id) {
        return (User) getSqlMapClientTemplate().queryForObject("getUserById", id);
    }

    public List<User> getUsersByName(String name) {
        return (List<User>) getSqlMapClientTemplate().queryForList("getUserByName", name);
    }
}
