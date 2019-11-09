package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // I use scanner because it's command line.

public class Login {
    public void run() throws FileNotFoundException {
        //Scanner scan = new Scanner (new File("C:\\Users\\marci\\Desktop\\zadanie 1\\src\\com\\company\\login.txt"));

        Scanner scan = new Scanner (new File("src/com/company/login.txt"));
        Scanner keyboard = new Scanner (System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine(); // looks at selected file in scan
        System.out.println("Write a login");
        String inpUser = keyboard.nextLine();
        System.out.println("Write a Password");
        String inpPass = keyboard.nextLine(); // gets input from user

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.println("you are login correctly");

        } else {
            System.out.println("incorrect password - error ");
        }
    }
}
