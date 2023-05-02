package com.nadilson.bookstore_app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nadilson.bookstore_app.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;

    @Bean
    void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}
}
