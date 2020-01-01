package com.company.model;

public enum Users {
    USER12432("Fred","vahr1995"),
    USER3241("Josh","grafix9"),
    USER3421("Boris","netsky3");

    private String name;
    private  String login;

    Users(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
