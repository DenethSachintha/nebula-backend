package com.example.SpringMongoCRUD.Controller;

import com.example.SpringMongoCRUD.Entity.Component;
import com.example.SpringMongoCRUD.Service.ComponentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/component")
public class ComponentController {
    @Autowired
    private ComponentServices componentServices;

    @PostMapping(value = "/save")
    private String saveComponent(@RequestBody Component components){

        componentServices.saveorUpdate(components);
        return components.get_id();
    }
    @GetMapping(value = "/getall")
    private Iterable<Component> getComponents(){
        return componentServices.listAll();
    }
    @PutMapping(value = "/edit/{id}")
    private Component update(@RequestBody Component component, @PathVariable(name = "id") String _id) {
        component.set_id(_id);
        componentServices.saveorUpdate(component);
        return component;
    }
    @DeleteMapping("/delete/{id}")
    private void deleteComponent(@PathVariable("id") String _id) {
        componentServices.deleteComponent(_id);
    }
    @RequestMapping("/search/{id}")
    private Component getComponents(@PathVariable(name = "id") String componentid) {
        return componentServices.getComponentByID(componentid);
    }
    @GetMapping("/getByCategoryNumber/{categoryNumber}")
    public List<Component> getComponentsByCategoryNumber(@PathVariable("categoryNumber") String categoryNumber) {
        return componentServices.getComponentsByCategoryNumber(categoryNumber);
    }
    @GetMapping("/searchByName")
    public List<Component> getComponentsByName(@RequestParam String name) {
        return componentServices.getComponentsByName(name);
    }
}
