package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Maryam extends Student{
    final String name = "maryam";
    final String password = "12345";
    final String username = "m_r";
    String pass1;
    String user1;
    public Maryam(String pass1 , String user1){
        this.pass1=pass1;
        this.user1=user1;
    }
    @Override
    public void pass() throws  PasswordExp {
        if(pass1 != null && pass1.equals(password)){
            System.out.println("password is correct ");
        }
        else {
            throw new PasswordExp("password not correct!!");
        }
    }

    @Override
    public void user() throws  UsernameExp {
        if(user1 != null && user1.equals(username)){
            System.out.println("username is correct ");
        }
        else {
            throw new UsernameExp("username not correct!!");
        }

    }
}