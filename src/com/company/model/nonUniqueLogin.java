package com.company.model;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.view.View.bundle;

import com.company.view.TextConstants;

public class nonUniqueLogin extends Exception{
    public nonUniqueLogin() {
        System.err.print(bundle.getString(TextConstants.NON_UNIQUE_LOGIN));
    }
}
