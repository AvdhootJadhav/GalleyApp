package com.avdhoot.mongodb_crud.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Image")
public class Image {

    @Id
    private String id;
    private String imgName;
    private String imgUrl;
    private String imgDetails;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImgName() {
        return imgName;
    }
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getImgDetails() {
        return imgDetails;
    }
    public void setImgDetails(String imgDetails) {
        this.imgDetails = imgDetails;
    }

    
}
