package com.mycompany.chatappart1;

import java.util.regex.Pattern;

public class Login {

    //private String storedUsername;
   // private String storedPassword;

    private String username;
    private String password;
    private String cellNumber;

    //Checks if username consists of five characters in order to be successfully captured
    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            this.username = username;
            System.out.println("Username successfully captured.");
            return true;
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            return false;
        }
    }
//Verifies whether the password is correectly formatted or not to allow access
    public boolean checkPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";

        if (Pattern.matches(regex, password)) {
            this.password = password;
            System.out.println("Password successfully captured.");
            return true;
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            return false;
        }
    }
//Checks if the number entered is a south african number or not which should begin with(+27}
    public boolean checkCellNumber(String cellNumber) {
        String regex = "^\\+27\\d{9}$";

        if (Pattern.matches(regex, cellNumber)) {
            this.cellNumber = cellNumber;
            System.out.println("Cell phone number successfully added.");
            return true;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            return false;
        }
    }
// This is the login section which requires the user to enter thier username,password and phone number
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public boolean loginUser(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

    public void returnLoginStatus(boolean status, String firstName, String lastName) {
        if (status) {
            System.out.println("Welcome " + firstName +  " it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }
}