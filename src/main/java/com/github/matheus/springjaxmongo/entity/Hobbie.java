package com.github.matheus.springjaxmongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Matheus Lucio <matheusluciox@gmail.com>
 * https://github.com/ma-theus/Spring-Jax-Mongo
 */
@Document(collection="hobbie")
public class Hobbie {
    @Id
    private String id;

    private String nome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
