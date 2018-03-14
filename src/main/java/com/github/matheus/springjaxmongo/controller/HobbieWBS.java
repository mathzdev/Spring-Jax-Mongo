package com.github.matheus.springjaxmongo.controller;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@Component
@WebService(name = "HobbieWBS", serviceName = "HobbieWBS", targetNamespace = "ma-theus/Spring-Jax-Mongo")
public class HobbieWBS extends UtilWBS {
    @WebMethod(operationName = "Listar")
    public List<Hobbie> listarHobbie() {
        String jsonString = executeCommand("curl " + getCurrentUrl() + "/pessoa");
        List<Hobbie> hobbies = new ArrayList<Hobbie>();

        JSONArray jsonArray = new JSONArray(jsonString);
        int count = jsonArray.length();

        for (int i = 0; i < count; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Hobbie hobbie = new Hobbie();
            hobbie.setId(jsonObject.getString("id"));
            hobbie.setNome(jsonObject.getString("nome"));
            hobbies.add(hobbie);
        }

        return hobbies;
    }
}