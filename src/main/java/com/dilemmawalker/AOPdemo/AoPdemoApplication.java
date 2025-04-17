package com.dilemmawalker.AOPdemo;

import com.dilemmawalker.AOPdemo.dao.AccountDAO;
import com.dilemmawalker.AOPdemo.dao.AccountDAOImpl;
import com.dilemmawalker.AOPdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AoPdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoPdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
		// no need to do dependency injection for AccountDAO as CommandLineRunner is a Bean hence
		// it automatically injects depend on beans.
		return runner -> {
//			System.out.println("Hello world");
			demoTheBeforeAdvice(accountDAO, membershipDAO);
		};
	}

	public void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO){

//		AccountDAO account = new AccountDAOImpl();
//		account.addName("Yash Handa");
		accountDAO.getName("Yash Handa");

		//call business Method
		accountDAO.addAccount();
		System.out.println("executing 2nd business method");
		membershipDAO.addAccount();
		System.out.println("executing 3rd business method");
		membershipDAO.checkAccount();
	}

}
