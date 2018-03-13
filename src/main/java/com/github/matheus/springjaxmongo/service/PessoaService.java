package com.github.matheus.springjaxmongo.service;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.entity.Pessoa;
import com.github.matheus.springjaxmongo.repository.HobbieRepository;
import com.github.matheus.springjaxmongo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private HobbieRepository hobbieRepository;

    public List<Pessoa> listarPessoa() {
        Hobbie hobbie = new Hobbie();
        hobbie.setNome("Jogar Bola");
        hobbieRepository.save(hobbie);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano");
        ArrayList arrayHobbie = new ArrayList<Hobbie>();
        arrayHobbie.set(0, hobbie);
        pessoa.setHobbie(arrayHobbie);
        pessoa.setEmail("fulano@detal.com");
        pessoa.setDtNascimento(new Date("01/02/2003"));
        pessoaRepository.save(pessoa);
        return pessoaRepository.findAll();
    }
}
