package com.example.SpringMongoCRUD.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="stores")
public class StoreList {
    @Id
    private String _id;

    private String storeNumber;
    private String storeName;
    private String storeDescription;
    private String storeLocation;
    private String storeImage;
    private String storePhone;
    private String storeURL;

    public StoreList() {
    }

    public StoreList(String _id, String storeNumber, String storeName, String storeDescription, String storeLocation, String storeImage, String storePhone, String storeURL) {
        this._id = _id;
        this.storeNumber = storeNumber;
        this.storeName = storeName;
        this.storeDescription = storeDescription;
        this.storeLocation = storeLocation;
        this.storeImage = storeImage;
        this.storePhone = storePhone;
        this.storeURL = storeURL;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(String storeImage) {
        this.storeImage = storeImage;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreURL() {
        return storeURL;
    }

    public void setStoreURL(String storeURL) {
        this.storeURL = storeURL;
    }

    @Override
    public String toString() {
        return "StoreList{" +
                "_id='" + _id + '\'' +
                ", storeNumber='" + storeNumber + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeDescription='" + storeDescription + '\'' +
                ", storeLocation='" + storeLocation + '\'' +
                ", storeImage='" + storeImage + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeURL='" + storeURL + '\'' +
                '}';
    }
}
