package com.javahack.demo.models;

public class User {
    private String login;
    private String password;
    private String email;
    private Integer age;
    private String sex;

    public User () {

    }

    public User(String login, String password, String email, Integer age, String sex) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
        this.sex = sex;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
