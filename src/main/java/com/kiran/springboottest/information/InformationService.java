package com.kiran.springboottest.information;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationService {


    List<Information> info = Arrays.asList(
                new Information("a0021", "Mark", "Sloan"),
                new Information("a0022", "Addison", "Montgomry"),
                new Information("a0023", "Derek", "Shepherd"),
                new Information("a0024", "Meredith", "Grey")
                );

    public List<Information> getAllInformation(){
        return info;
    }
}
