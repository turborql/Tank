package com.tank.mapper;

import com.tank.domain.DO.Login_user;

import java.util.List;

/**
 * @author edz
 */
public interface IUserDao {
    /**
     * 查询用户
     */
    List<Login_user> findAll();

    /**
     * 增加并保存用户
     */
    void saveUser(Login_user user);

    /**
     * 更新用户
     */
    void updateUser(Login_user user);
    /**
     * 根据姓名删除用户
     */
    void deleteUser(String name);


}
