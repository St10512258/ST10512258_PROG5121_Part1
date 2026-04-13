package com.mycompany.chatappart1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainApp {

   // Allows the user to enter their informationz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        String username;
        String password;
        String cell;

        // Username loop
        do {
            System.out.print("Enter username: ");
            username = input.nextLine();
        } while (!login.checkUsername(username));

        // Password loop
        do {
            System.out.print("Enter password: ");
            password = input.nextLine();
        } while (!login.checkPassword(password));

        // Cell number loop
        do {
            System.out.print("Enter SA cell number (+27...): ");
            cell = input.nextLine();
        } while (!login.checkCellNumber(cell));

        System.out.println("\nRegistration complete!\n");

        // Create login object
        //Login login = new Login(app.getUsername(), app.getPassword());

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        boolean success;

        // Login loop
        do {
            System.out.print("\nLogin username: ");
            String user = input.nextLine();

            System.out.print("Login password: ");
            String pass = input.nextLine();

            success = login.loginUser(user, pass);
            login.returnLoginStatus(success, firstName, lastName);

        } while (!success);

        input.close();
    }
}