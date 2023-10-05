package com.example.SpringMongoCRUD.Repo;

import com.example.SpringMongoCRUD.Entity.Component;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ComponentRepo extends MongoRepository<Component,String> {

    List<Component> findByCategoryNumber(String categoryNumber);

    List<Component> findAllByComponentNameContaining(String componentName);

}
