package com.example.SpringMongoCRUD.Repo;


import com.example.SpringMongoCRUD.Entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepo extends MongoRepository<Category,String> {
    List<Category> findAllByCategorynameContaining(String categoryName);
    Category findAllByCategorynumberContaining(String categoryNumber);

}
