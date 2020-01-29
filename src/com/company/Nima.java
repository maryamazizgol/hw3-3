package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Nima extends Student{

    final String name = "nima";
    final String password = "nf83nf";
    final String username = "n_e";
    String pass3;
    String user3;
    public Nima(String pass3 , String user3){
        this.pass3=pass3;
        this.user3=user3;
    }
    @Override
    public void pass() throws  PasswordExp {
        if(pass3 != null && pass3.equals(password)){
            System.out.println("password is correct ! ");
        }
        else {
            throw new PasswordExp("password not correct");
        }
    }

    @Override
    public void user() throws  UsernameExp {
        if(user3 != null && user3.equals(username)){
            System.out.println("username is correct ");
        }
        else {
            throw new UsernameExp("username is not correct");
        }

    }










}
