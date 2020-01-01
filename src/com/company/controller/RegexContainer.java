package com.company.controller;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ']+{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "[A-Za-z]+{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    //mobile phone
    String REGEX_MOBILE_PHONE = "[0-9]{10}+";
    // index part of adres
    String REGEX_INDEX ="[0-9]{5}+";
    // city
    String REGEX_CITY = "[A-Za-z]+{1,20}$";
    // city_ukr
    String REGEX_CITY_UKR = "[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ']+{1,20}$";
    //street
    String REGEX_STREET = "[A-Za-z]+{1,20}$";
    //street_ukr
    String REGEX_STREET_UKR = "[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ']+{1,20}$";
    //house
    String REGEX_HOUSE = "[0-9]{1,7}+";
    //flat
    String REGEX_FLAT = "[0-9]{1,7}+";
}
