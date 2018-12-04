package com.kiran.springboottest.information;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationService {


    List<Information> info = new ArrayList<>(Arrays.asList(
                new Information("a0021", "Mark", "Sloan"),
                new Information("a0022", "Addison", "Montgomry"),
                new Information("a0023", "Derek", "Shepherd"),
                new Information("a0024", "Meredith", "Grey")
                ));

    public List<Information> getAllInformation(){
        return info;
    }
    public Information getInformation(String id){
        for (Information information : info) {
            if(information.getId().equals(id)){
                return information;
            }
        }
        return null;
//        return info.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addInformation(Information information) {
        info.add(information);
    }

    public void addInformation(String id, Information information) {
        for(int i = 0; i< info.size(); i++){
            Information in = info.get(i);
            if(in.getId().equals(id)){
                info.set(i, information);
                return;
            }
        }
    }

    public void deleteInformation(String id) {
        info.removeIf(t -> t.getId().equals(id));
    }
}
