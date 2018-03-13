package com.github.matheus.springjaxmongo;

import com.github.matheus.springjaxmongo.controller.wbs.HobbieWBS;
import com.github.matheus.springjaxmongo.controller.wbs.PessoaWBS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/WBS/PessoaWBS", new PessoaWBS());
        Endpoint.publish("http://localhost:8080/WBS/HobbieWBS", new HobbieWBS());

        SpringApplication.run(Application.class, args);
    }
}
