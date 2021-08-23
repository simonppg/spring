package com.tutorial.database.databasedemo.springdata;

import com.tutorial.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> { }
