package com.github.matheus.springjaxmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilWBS {
    @Autowired
    private HttpServletRequest request;

    /**
     * Mudar a url quando subir para o heroku
     * @return String
     */
    public String getCurrentUrl() {
        //return = "http://localhost:8080";
        return "https://spring-jax-mongo.herokuapp.com/";
    }

    public String executeCommand(String command) {

        StringBuffer output = new StringBuffer();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();
    }
}
