package com.github.matheus.springjaxmongo.controller;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.entity.Pessoa;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@Component
@WebService(name = "PessoaWBS", serviceName = "PessoaWBS", targetNamespace = "ma-theus/Spring-Jax-Mongo")
public class PessoaWBS extends UtilWBS {
    @WebMethod(operationName = "Listar")
    public List<Pessoa> listarPessoa() {
        String jsonString = executeCommand("curl " + getCurrentUrl() + "/pessoa");
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        JSONArray jsonArray = new JSONArray(jsonString);
        int count = jsonArray.length();

        for (int i = 0; i < count; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Pessoa pessoa = new Pessoa();
            pessoa.setId(jsonObject.getString("id"));
            pessoa.setNome(jsonObject.getString("nome"));
            pessoa.setEmail(jsonObject.getString("email"));
            pessoa.setDtNascimento(new Date(jsonObject.getInt("dtNascimento")));

            JSONArray hobbiesJson = jsonObject.getJSONArray("hobbie");
            List<Hobbie> hobbies = new ArrayList<Hobbie>();

            for (int i2 = 0; i2 < hobbiesJson.length(); i2++) {
                JSONObject hobbieObject = hobbiesJson.getJSONObject(i2);
                Hobbie hobbie = new Hobbie();
                hobbie.setId(hobbieObject.getString("id"));
                hobbie.setNome(hobbieObject.getString("nome"));
                hobbies.add(hobbie);
            }

            pessoa.setHobbie(hobbies);

            pessoas.add(pessoa);
        }

        return pessoas;
    }
}