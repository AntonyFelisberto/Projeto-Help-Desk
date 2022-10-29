package com.antony.helpdesk.repositories;

import com.antony.helpdesk.abstractions.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
