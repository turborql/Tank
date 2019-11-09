package com.tank.domain.DO;

import java.io.Serializable;
import java.util.Date;

public class Login_user implements Serializable { private int id;
private Date gmt_create;
private Date gmt_modified;
private String login_name;
private String password;

    public Login_user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login_user(int id, Date gmt_create, Date gmt_modified, String login_name, String password) {
        this.id = id;
        this.gmt_create = gmt_create;
        this.gmt_modified = gmt_modified;
        this.login_name = login_name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login_user{" +
                "id=" + id +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", login_name='" + login_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
