package com.dilemmawalker.AOPdemo;

import com.dilemmawalker.AOPdemo.dao.AccountDAO;
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
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO){
		// no need to do dependency injection for AccountDAO as CommandLineRunner is a Bean hence
		// it automatically injects depend on beans.
		return runner -> {
//			System.out.println("Hello world");
			demoTheBeforeAdvice(accountDAO);
		};
	}

	public void demoTheBeforeAdvice(AccountDAO accountDAO){

		//call business Method
		accountDAO.addAccount();
	}

}
