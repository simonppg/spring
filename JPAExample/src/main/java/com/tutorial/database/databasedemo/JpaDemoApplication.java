package com.tutorial.database.databasedemo;

import java.util.Date;
import com.tutorial.database.databasedemo.entity.Person;
import com.tutorial.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", repository.findAll());
		logger.info("User id 1-> {}", repository.findById(1));
		// logger.info("User name Jhon -> {}", repository.findByName("Jhon"));
		// logger.info("User location USA -> {}", repository.findByLocation("USA"));
		logger.info("All users -> {}", repository.findAll());
		logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Brazil", new Date())));
		logger.info("Inserting -> {}", repository.insert(new Person("Jhon", "Mexico", new Date())));
		logger.info("User id 1 -> {}", repository.findById(1));
		logger.info("Updating Jim -> {}", repository.update(new Person("Jim", "Mexico", new Date())));
		logger.info("User id 2 -> {}", repository.findById(2));
		repository.deleteById(2);
		logger.info("User id 2-> {}", repository.findById(2));
		logger.info("All users -> {}", repository.findAll());
	}
}
