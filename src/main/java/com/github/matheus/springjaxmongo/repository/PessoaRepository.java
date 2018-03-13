package com.github.matheus.springjaxmongo.repository;

import com.github.matheus.springjaxmongo.entity.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
}
