package com.github.matheus.springjaxmongo.service;

import com.github.matheus.springjaxmongo.entity.Pessoa;
import com.github.matheus.springjaxmongo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoa() {
        return pessoaRepository.findAll();
    }
}
