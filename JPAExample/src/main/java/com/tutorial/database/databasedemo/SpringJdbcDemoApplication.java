package com.tutorial.database.databasedemo;

import java.util.Date;
import com.tutorial.database.databasedemo.entity.Person;
import com.tutorial.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

// @SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("User name Jhon -> {}", dao.findByName("Jhon"));
		logger.info("User location USA -> {}", dao.findByLocation("USA"));
		logger.info("Deleting user 10001 -> Number of rows deleted - {}", dao.deleteById(10001));
		logger.info("All users -> {}", dao.findAll());
		logger.info("Inserting 10009 -> {}", dao.insert(new Person(10009, "Tara", "Brazil", new Date())));
		logger.info("User id 10009 -> {}", dao.findById(10009));
		logger.info("Updating 10002 -> {}", dao.update(new Person(10002, "Jim", "Mexico", new Date())));
		logger.info("User id 10002 -> {}", dao.findById(10002));
	}
}
