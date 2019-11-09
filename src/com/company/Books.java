package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Books {

    public void nextElement() throws FileNotFoundException {
        File file = new File("./src/books.txt");
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

