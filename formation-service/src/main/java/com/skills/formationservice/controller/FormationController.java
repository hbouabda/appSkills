package com.skills.formationservice.controller;

import com.skills.formationservice.service.FormationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FormationController {

    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping
    public List<String> getAccounts(){
        return Arrays.asList("dada","dadagaag");
    }

}
