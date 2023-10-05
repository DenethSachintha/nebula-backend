package com.example.SpringMongoCRUD.Repo;

import com.example.SpringMongoCRUD.Entity.StoreList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StoreRepo extends MongoRepository<StoreList,String> {
    List<StoreList> findAllByStoreNumberIn(List<String> numbers);
        List<StoreList> findAllByStoreNameContaining(String storeName);

/*
    List<StoreList> findAllByStoreNumberContaining(String number);
*/

}
