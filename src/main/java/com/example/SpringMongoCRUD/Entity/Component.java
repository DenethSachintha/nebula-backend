package com.example.SpringMongoCRUD.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="components")
public class Component {
    @Id
    private String _id;

    private String categoryNumber;
    private String componentName;
    private String componentDescription;
    private String componentImage;
    private String componentConnect;
    private String componentTheory;
    private String componentFeatures;
    private String componentStatistics;

    private List<String> componentStores;

    public Component() {
    }

    public Component(String _id, String categoryNumber, String componentName, String componentDescription, String componentImage, String componentConnect, String componentTheory, String componentFeatures, String componentStatistics, List<String> componentStores) {
        this._id = _id;
        this.categoryNumber = categoryNumber;
        this.componentName = componentName;
        this.componentDescription = componentDescription;
        this.componentImage = componentImage;
        this.componentConnect = componentConnect;
        this.componentTheory = componentTheory;
        this.componentFeatures = componentFeatures;
        this.componentStatistics = componentStatistics;
        this.componentStores = componentStores;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentDescription() {
        return componentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    public String getComponentImage() {
        return componentImage;
    }

    public void setComponentImage(String componentImage) {
        this.componentImage = componentImage;
    }

    public String getComponentConnect() {
        return componentConnect;
    }

    public void setComponentConnect(String componentConnect) {
        this.componentConnect = componentConnect;
    }

    public String getComponentTheory() {
        return componentTheory;
    }

    public void setComponentTheory(String componentTheory) {
        this.componentTheory = componentTheory;
    }

    public String getComponentFeatures() {
        return componentFeatures;
    }

    public void setComponentFeatures(String componentFeatures) {
        this.componentFeatures = componentFeatures;
    }

    public String getComponentStatistics() {
        return componentStatistics;
    }

    public void setComponentStatistics(String componentStatistics) {
        this.componentStatistics = componentStatistics;
    }

    public List<String> getComponentStores() {
        return componentStores;
    }

    public void setComponentStores(List<String> componentStores) {
        this.componentStores = componentStores;
    }

    @Override
    public String toString() {
        return "Component{" +
                "_id='" + _id + '\'' +
                ", categoryNumber='" + categoryNumber + '\'' +
                ", componentName='" + componentName + '\'' +
                ", componentDescription='" + componentDescription + '\'' +
                ", componentImage='" + componentImage + '\'' +
                ", componentConnect='" + componentConnect + '\'' +
                ", componentTheory='" + componentTheory + '\'' +
                ", componentFeatures='" + componentFeatures + '\'' +
                ", componentStatistics='" + componentStatistics + '\'' +
                ", componentStores=" + componentStores +
                '}';
    }
}
