package com.github.matheus.springjaxmongo.controller;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.entity.Pessoa;
import com.github.matheus.springjaxmongo.service.HobbieService;
import com.github.matheus.springjaxmongo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@RestController
public class IndexController {
    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private HobbieService hobbieService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "https://github.com/ma-theus/Spring-Jax-Mongo";
    }

    @RequestMapping(value = "/pessoa", method = RequestMethod.GET)
    public List<Pessoa> listarPessoa() {
        return pessoaService.listarPessoa();
    }

    @RequestMapping(value = "/hobbie", method = RequestMethod.GET)
    public List<Hobbie> listarHobbie() {
        return hobbieService.listarHobbie();
    }
}