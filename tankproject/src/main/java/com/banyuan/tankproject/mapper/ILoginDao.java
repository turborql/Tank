package com.banyuan.tankproject.mapper;


import com.banyuan.tankproject.domain.DO.Login_user;

public interface ILoginDao {
    /**
     * 查询用户
     */
    Login_user findAll(Login_user login_user);
  //  List<Login_user> findAll(Login_user login_user);

}
