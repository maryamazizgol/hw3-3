package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Ali extends Student {
    final String name = "ali";
    final String password = "64353";
    final String username = "a_o";
    String pass2;
    String user2;
    public Ali(String pass2 , String user2){
        this.pass2=pass2;
        this.user2=user2;
    }
    @Override
    public void pass() throws  PasswordExp {
        if(pass2 != null && pass2.equals(password)){
            System.out.println("password is CORRECT");
        }
        else {
            throw new PasswordExp("password not correct");
        }
    }

    @Override
    public void user() throws  UsernameExp {
        if(user2 != null && user2.equals(username)){
            System.out.println("username is correct ");
        }
        else {
            throw new UsernameExp("username is not correct");
        }

    }
}
