package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.FileNotFoundException;



public class Users {

    public void nextElement() throws FileNotFoundException {
        File file = new File("src/com/company/users.txt");
        Scanner users = new Scanner((file));
        StringTokenizer token;
        Object tk;
        while (users.hasNextLine()) {
            token = new StringTokenizer(users.nextLine(), ",");

            while (token.hasMoreElements()) {
                //System.out.println("Token = " + token.nextToken());
                tk = token.nextElement();
                System.out.println("Token = " + tk);

            }

        }
    }
}