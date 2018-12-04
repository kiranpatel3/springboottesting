package com.kiran.springboottest.information;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping("/information")
    public List<Information> getAllInformation(){
        return informationService.getAllInformation();
    }
}
