package com.github.matheus.springjaxmongo.controller.wbs;

import com.github.matheus.springjaxmongo.entity.Pessoa;
import com.github.matheus.springjaxmongo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@Component
@WebService(name = "PessoaWBS", serviceName = "PessoaWBS", targetNamespace = "ma-theus/Spring-Jax-Mongo")
public class PessoaWBS extends SpringBeanAutowiringSupport {
    @Autowired
    private PessoaRepository pessoaRepository;

    @WebMethod(operationName = "Listar")
    public List<Pessoa> listarPessoa() {
        return this.pessoaRepository.findAll();
    }
}
