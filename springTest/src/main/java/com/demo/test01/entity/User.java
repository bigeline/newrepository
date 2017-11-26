package com.demo.test01.entity;

public class User {
    private Integer userId;
    private String userName;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "id:" + userId + " userName:" + userName;
    }
}
