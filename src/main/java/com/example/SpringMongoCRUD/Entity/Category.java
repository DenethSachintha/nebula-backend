package com.example.SpringMongoCRUD.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="categories")
public class Category {
    @Id
    private String _id;
    private String categoryname;
    private String categorydescription;
    private String categorynumber;

    public Category() {
    }

    public Category(String _id, String categoryname, String categorydescription, String categorynumber) {
        this._id = _id;
        this.categoryname = categoryname;
        this.categorydescription = categorydescription;
        this.categorynumber = categorynumber;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getCategorydescription() {
        return categorydescription;
    }

    public void setCategorydescription(String categorydescription) {
        this.categorydescription = categorydescription;
    }

    public String getCategorynumber() {
        return categorynumber;
    }

    public void setCategorynumber(String categorynumber) {
        this.categorynumber = categorynumber;
    }

    @Override
    public String toString() {
        return "Category{" +
                "_id='" + _id + '\'' +
                ", categoryname='" + categoryname + '\'' +
                ", categorydescription='" + categorydescription + '\'' +
                ", categorynumber='" + categorynumber + '\'' +
                '}';
    }
}
