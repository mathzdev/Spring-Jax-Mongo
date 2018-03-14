package com.github.matheus.springjaxmongo.controller.wbs;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.repository.HobbieRepository;
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
@WebService(name = "HobbieWBS", serviceName = "HobbieWBS", targetNamespace = "ma-theus/Spring-Jax-Mongo")
public class HobbieWBS extends SpringBeanAutowiringSupport {
    @Autowired
    private HobbieRepository hobbieRepository;

    @WebMethod(operationName = "Listar")
    public List<Hobbie> listarHobbie() {
        return this.hobbieRepository.findAll();
    }
}