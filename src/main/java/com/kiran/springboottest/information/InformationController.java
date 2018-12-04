package com.kiran.springboottest.information;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping("/information")
    public List<Information> getAllInformation(){
        return informationService.getAllInformation();
    }
    @RequestMapping("/information/{id}")
    public Information getInformation(@PathVariable String id){
        return informationService.getInformation(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/information")
    public void addInformation(@RequestBody Information information){
        informationService.addInformation(information);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/information/{id}")
    public void updateInformation(@RequestBody Information information, @PathVariable String id){
        informationService.addInformation(id, information);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/information/{id}")
    public void deleteInformation(@PathVariable String id){
        informationService.deleteInformation(id);
    }
}
