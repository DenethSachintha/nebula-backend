package com.example.SpringMongoCRUD.Service;

import com.example.SpringMongoCRUD.Entity.StoreList;
import com.example.SpringMongoCRUD.Repo.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServices {
    @Autowired
    private StoreRepo repo;
    public void saveorUpdate(StoreList storesList) {

        repo.save(storesList);
    }
    public Iterable<StoreList> listAll() {

        return this.repo.findAll();
    }
    public List<StoreList> getStoresByNumbers(List<String> numbers) {
        return repo.findAllByStoreNumberIn(numbers);
    }

    /*public List<StoreList> getStoresByNumber(String number) {
        return repo.findAllByStoreNumberContaining(number);
    }*/
    public List<StoreList> getStoresByName(String name) {
        return repo.findAllByStoreNameContaining(name);
    }
}
