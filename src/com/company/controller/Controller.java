package com.company.controller;

import com.company.model.Model;
import com.company.view.TextConstants;
import com.company.view.View;

import java.util.Scanner;

public class Controller implements TextConstants, RegexContainer{
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex, Scanner scanner) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    public void inputData(Scanner scanner) {
        model.setFirstName(inputStringValueWithScanner(FIRST_NAME, checkLocale(REGEX_NAME_UKR, REGEX_NAME_LAT), scanner));

        setLogin(scanner);

        model.setMobilePhone1(inputStringValueWithScanner(MOBILE_PHONE1_DATA, REGEX_MOBILE_PHONE, scanner));

        model.setIndex(inputStringValueWithScanner(INDEX_DATA, REGEX_INDEX, scanner));
        model.setCity(inputStringValueWithScanner(CITY_DATA, checkLocale(REGEX_CITY_UKR, REGEX_CITY), scanner));
        model.setStreet(inputStringValueWithScanner(STREET_DATA, checkLocale(REGEX_STREET_UKR, REGEX_STREET),scanner));
        model.setHouse(inputStringValueWithScanner(HOUSE_DATA, REGEX_HOUSE, scanner));
        model.setFlat(inputStringValueWithScanner(FLAT_DATA, REGEX_FLAT, scanner));
    }

    public void setLogin(Scanner scanner){
        try {
            model.setLogin(inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN, scanner));
        } catch (Exception e) {
            System.out.println(TextConstants.SLASH);
            setLogin(scanner);
        }
    }

    private String checkLocale(String regex_ukr, String regex_lat){
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? regex_ukr : regex_lat;
        return str;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        inputData(sc);
    }
}
