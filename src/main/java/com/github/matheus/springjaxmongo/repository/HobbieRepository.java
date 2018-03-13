package com.github.matheus.springjaxmongo.repository;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HobbieRepository extends MongoRepository<Hobbie, String> {
}
