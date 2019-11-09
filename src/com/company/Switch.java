package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Switch {
    public int number;



    public void Choice() throws FileNotFoundException {

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.println("Choice a number ");

            System.out.println("1:Choice your favorite book");
            System.out.println("2:Look another users ");
            System.out.println("3: End of Program ");

            str = sc.nextLine();
            try {
                number = Integer.parseInt(str);
                System.out.println("Your Choice " + number);
                Login login = new Login();
                login.run();
                switch (number) {

                    case 1: {
                        Books books = new Books();
                        books.nextElement();
                        break;
                    }
                    case 2: {
                        Users users = new Users();
                        users.nextElement();
                        break;
                    }
                    case 3: {
                        exit(0);
                    }

                    default: {
                        System.out.println("default");
                    }
                    System.in.read();System.in.read();
                    Runtime.getRuntime().exec("cls");
                }
            } catch (Exception e) {
                System.out.println("Bad Choice ... Please give me a number 1 to 3 ");
            }


        }
    }
}
