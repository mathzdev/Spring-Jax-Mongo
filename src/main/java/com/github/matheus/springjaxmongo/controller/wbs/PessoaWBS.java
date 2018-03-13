package com.github.matheus.springjaxmongo.controller.wbs;

import com.github.matheus.springjaxmongo.entity.Pessoa;
import com.github.matheus.springjaxmongo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@WebService(
        name = "PessoaWBS",
        serviceName = "PessoaWBS",
        targetNamespace = "ma-theus/Spring-Jax-Mongo"
)
public class PessoaWBS {
    @Autowired
    private PessoaService pessoaService;

    @WebMethod(operationName = "Listar")
    public List<Pessoa> Listar() {
        return pessoaService.listarPessoa();
    }
}
