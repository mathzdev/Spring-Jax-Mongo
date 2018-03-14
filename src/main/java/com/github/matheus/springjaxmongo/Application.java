package com.github.matheus.springjaxmongo;

import com.github.matheus.springjaxmongo.controller.HobbieWBS;
import com.github.matheus.springjaxmongo.controller.PessoaWBS;
import com.github.matheus.springjaxmongo.controller.UtilWBS;
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

        UtilWBS utilWBS = new UtilWBS();

        Endpoint.publish(utilWBS.getCurrentUrl() + "/WBS/PessoaWBS", new PessoaWBS());
        Endpoint.publish(utilWBS.getCurrentUrl() + "/WBS/HobbieWBS", new HobbieWBS());
    }
}
