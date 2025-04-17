package com.dilemmawalker.AOPdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": adding membership account");
    }

    @Override
    public void checkAccount() {
        System.out.println(getClass() + ": checking membership account");
    }


}
