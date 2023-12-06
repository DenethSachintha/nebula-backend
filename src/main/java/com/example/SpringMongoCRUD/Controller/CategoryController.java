package com.example.SpringMongoCRUD.Controller;

import com.example.SpringMongoCRUD.Entity.Category;
import com.example.SpringMongoCRUD.Service.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryServices categoryServices;
    @PostMapping(value = "/save")
    private String saveCategory(@RequestBody Category categories) {
        categoryServices.saveorUpdate(categories);
        return categories.get_id();
    }
    @GetMapping(value = "/getall")
    public Iterable<Category> getCategories() {
        return categoryServices.listAll();
    }
    @PutMapping(value = "/edit/{id}")
    private Category update(@RequestBody Category category, @PathVariable(name = "id") String _id) {
        category.set_id(_id);
        categoryServices.saveorUpdate(category);
        return category;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteCategory(@PathVariable("id") String _id) {
        categoryServices.deleteCategory(_id);
    }

    @RequestMapping("/search/{id}")
    private Category getCategory(@PathVariable(name = "id") String categoryid) {
        return categoryServices.getCategoryByID(categoryid);
    }

   /* @GetMapping("/searchByIds")
    public List<Student> getStudentsByIds(@RequestParam List<String> ids) {
        return studentServices.getStudentsByIds(ids);
    }*/
   @GetMapping("/searchByName")
   public List<Category> getCategoriesByName(@RequestParam String name) {
       return categoryServices.getCategoryByName(name);
   }
   @GetMapping("/searchByNumber")
   public Category getCategoryByNumber(@RequestParam String number) {
       return categoryServices.getCategoryByNumber(number);
   }
}
