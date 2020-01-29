package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input1 = new Scanner(System.in);
        System.out.print(" name:");
        String name2 = Input1.nextLine();
        Scanner Input2 = new Scanner(System.in);
        System.out.print("username:");
        String user2 = Input2.nextLine();
        Scanner Input3 = new Scanner(System.in);
        System.out.print("password:");
        String pass2 = Input3.nextLine();


        Maryam m = new Maryam(pass2, user2);
        Ali a = new Ali(pass2, user2);
        Nima n = new Nima(pass2, user2);

        if (name2 != null && name2.equals(m.name)) {
            try {
                m.pass();

            } catch (PasswordExp e) {
                System.err.println(e.getMessage());
            }

            try {
                m.user();
            } catch (UsernameExp e) {
                System.err.println(e.getMessage());
            }

        }

        if (name2 != null && name2.equals(a.name)) {
            try {
                a.pass();

            } catch (PasswordExp e) {
                System.err.println(e.getMessage());
            }

            try {
                a.user();
            } catch (UsernameExp e) {
                System.err.println(e.getMessage());
            }
        }



        if (name2 != null && name2.equals(n.name)) {
            try {
                n.pass();

            } catch (PasswordExp e) {
                System.err.println(e.getMessage());
            }

            try {
                n.user();
            } catch (UsernameExp e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
