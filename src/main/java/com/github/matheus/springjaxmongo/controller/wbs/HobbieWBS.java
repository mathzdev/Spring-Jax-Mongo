package com.github.matheus.springjaxmongo.controller.wbs;

import com.github.matheus.springjaxmongo.entity.Hobbie;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
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
    @WebMethod(operationName = "Listar")
    public List<Hobbie> Listar() {
        List<Hobbie> hobbies = new ArrayList<Hobbie>();
        return hobbies;
    }
}
