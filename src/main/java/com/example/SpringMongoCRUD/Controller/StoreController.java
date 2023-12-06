package com.example.SpringMongoCRUD.Controller;


import com.example.SpringMongoCRUD.Entity.StoreList;
import com.example.SpringMongoCRUD.Service.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/store")
public class StoreController {
    @Autowired
    private StoreServices storeServices;
     @PostMapping(value = "/save")
     private String saveStoreList(@RequestBody StoreList storeList){
         storeServices.saveorUpdate(storeList);
         return storeList.get_id();
     }
     @GetMapping(value = "/getall")
    public  Iterable<StoreList> getStoreList() {return storeServices.listAll();}

    @GetMapping("/searchByNumbers")
    public List<StoreList> getStoresByNames(@RequestParam List<String> numbers) {
        return storeServices.getStoresByNumbers(numbers);
    }
    /*@GetMapping("/searchByNumber")
    public List<StoreList> getStoresByNumber(@RequestParam String number) {
        return storeServices.getStoresByNumber(number);
    }*/
    @GetMapping("/searchByName")
   public List<StoreList> getStoresByName(@RequestParam String name) {
       return storeServices.getStoresByName(name);
   }
   @GetMapping("/searchByNumber")
   public  StoreList getStoreByNumber(@RequestParam String number) {
       return storeServices.getStoreByNumber(number);
   }
}
