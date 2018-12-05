package com.kiran.springboottest.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationService {

    @Autowired
    private InformationRepository informationRepository;


    public List<Information> getAllInformation(){

        List<Information> info = new ArrayList<>();
        informationRepository.findAll().forEach(info::add);
        return info;
    }
    public Information getInformation(String id){
        Optional<Information> informationOptional =  informationRepository.findById(id);
        return informationOptional.orElse(new Information());
    }

    public void addInformation(Information information) {
        informationRepository.save(information);
        //info.add(information);
    }

    public void addInformation(String id, Information information) {
        informationRepository.save(information);
    }

    public void deleteInformation(String id) {
        informationRepository.deleteById(id);
    }
}
