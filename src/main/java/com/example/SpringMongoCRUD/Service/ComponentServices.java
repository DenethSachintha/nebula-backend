package com.example.SpringMongoCRUD.Service;

import com.example.SpringMongoCRUD.Entity.Component;
import com.example.SpringMongoCRUD.Repo.ComponentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentServices {
    @Autowired
    private ComponentRepo repo;

    public void saveorUpdate(Component components){
        repo.save(components);
    }
    public Iterable<Component> listAll(){
        return  this.repo.findAll();
    }
    public void deleteComponent(String id){
        repo.deleteById(id);
    }
    public Component getComponentByID(String componentid) {

        return repo.findById(componentid).get();
    }
    public List<Component> getComponentsByCategoryNumber(String categoryNumber) {
        return repo.findByCategoryNumber(categoryNumber);
    }
     public List<Component> getComponentsByName(String name) {
        return repo.findAllByComponentNameContaining(name);
    }

}
