package com.example.SpringMongoCRUD.Service;

import com.example.SpringMongoCRUD.Entity.Category;
import com.example.SpringMongoCRUD.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepo repo;
    public void saveorUpdate(Category categories) {

        repo.save(categories);
    }
    public Iterable<Category> listAll() {

        return this.repo.findAll();
    }
    public void deleteCategory(String id) {

        repo.deleteById(id);
    }
    public Category getCategoryByID(String categoryid) {

        return repo.findById(categoryid).get();
    }

  /*  public List<Student> getStudentsByIds(List<String> ids) {
        return repo.findAllById(ids);
    }*/
  public List<Category> getCategoryByName(String name) {
      return repo.findAllByCategorynameContaining(name);
  }
}
