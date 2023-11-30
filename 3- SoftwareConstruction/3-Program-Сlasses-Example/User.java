package com.gleb.lab9.model;

import jakarta.persistence.*;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;

    private String password;

    @OneToOne
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    @ManyToOne
    @JoinColumn(name = "request_food_id")
    private RequestFood requestFood;

    public User() {
    }

    public User(String login, String password, UserInfo userInfo, RequestFood requestFood) {
        this.login = login;
        this.password = password;
        this.userInfo = userInfo;
        this.requestFood = requestFood;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public RequestFood getRequestFood() {
        return requestFood;
    }

    public void setRequestFood(RequestFood requestFood) {
        this.requestFood = requestFood;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userInfo=" + userInfo +
                ", requestFood=" + requestFood +
                '}';
    }
}
