package com.dilemmawalker.AOPdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Override
    public void addAccount() {
        System.out.println(getClass()  + ":doing my db working");
    }
}
