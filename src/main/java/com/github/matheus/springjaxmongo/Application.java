package com.github.matheus.springjaxmongo;

import com.github.matheus.springjaxmongo.controller.wbs.HobbieWBS;
import com.github.matheus.springjaxmongo.controller.wbs.PessoaWBS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.xml.ws.Endpoint;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@EnableMongoRepositories("com.github.matheus.springjaxmongo.repository")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Endpoint.publish("http://localhost:8080/WBS/PessoaWBS", new PessoaWBS());
        Endpoint.publish("http://localhost:8080/WBS/HobbieWBS", new HobbieWBS());
    }
}
