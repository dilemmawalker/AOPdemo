package com.dilemmawalker.AOPdemo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;
    public void getName(String name) {
        System.out.println("name is: "+ name);
    }
    public void setName(){

    }

    @Getter
    @Setter
    private String serviceCode;


    @Override
    public void addAccount() {
        System.out.println(getClass()  + ":doing my db working");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": do work()");
        return false;
    }
}
