package com.github.matheus.springjaxmongo.controller.wbs;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.service.HobbieService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@WebService(
        name = "HobbieWBS",
        serviceName = "HobbieWBS",
        targetNamespace = "ma-theus/Spring-Jax-Mongo"
)
public class HobbieWBS {
    @Autowired
    private HobbieService hobbieService;

    @WebMethod(operationName = "Listar")
    public List<Hobbie> Listar() {
        return hobbieService.listarHobbie();
    }
}
