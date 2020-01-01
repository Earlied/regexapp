package com.company.model;

import java.util.ArrayList;

public class Model {
    private String firstName;
    private String login;
    private String mobilePhone1;
    private String index;
    private String city;
    private String street;
    private String house;
    private String flat ;

    private ArrayList<String> adress = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public boolean loginCheck(String login) {
        for (Users user : Users.values()) {
            if (user.getLogin().equals(login)) {
                return false;
            }
        }
        return true;
    }

    public void setLogin(String login) throws nonUniqueLogin {
        if(loginCheck(login) == false){
            throw new nonUniqueLogin();
        }
        this.login = login;
    }

    public String getMobilePhone1() {
        return mobilePhone1;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
        adress.add(index);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        adress.add(city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
        adress.add(street);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
        adress.add(house);
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
        adress.add(flat);

    }

}
