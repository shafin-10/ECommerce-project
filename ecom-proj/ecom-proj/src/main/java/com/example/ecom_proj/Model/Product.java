package com.example.ecom_proj.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;


    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public void SetImageName(String originalFilename) {
        this.imageName = originalFilename;
    }

    public void SetImageType(String contentType) {
        this.imageType = contentType;
    }

    public void SetImageData(byte[] bytes) {
        this.imageData = bytes;
    }
}
