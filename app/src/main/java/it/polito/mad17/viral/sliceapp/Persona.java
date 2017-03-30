package it.polito.mad17.viral.sliceapp;

import java.math.BigInteger;

/**
 * Created by Kalos on 24/03/2017.
 */

public class Persona {



    private String username;
    private String dob;
    private String name;
    private String surname;
    private String password;
    private long telephone;
    private Soldi debts;
    private Soldi credit;


public Persona(String username, String dob, String name, String surname, String password, long telephone)
    {
        this.username=username;
        this.dob=dob;
        this.name=name;
        this.surname=surname;
        this.password=password;
        this.telephone=telephone;
    }

    public String getUsername() {
        return username;
    }
    public String getDob() {
        return dob;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPassword() {
        return password;
    }
    public long getTelephone() {
        return telephone;
    }





























}
