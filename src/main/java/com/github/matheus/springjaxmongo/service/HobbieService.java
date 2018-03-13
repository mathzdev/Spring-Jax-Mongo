package com.github.matheus.springjaxmongo.service;

import com.github.matheus.springjaxmongo.entity.Hobbie;
import com.github.matheus.springjaxmongo.repository.HobbieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HobbieService {
    @Autowired
    private HobbieRepository hobbieRepository;

    public List<Hobbie> listarHobbie() {
        return hobbieRepository.findAll();
    }
}
