package com.mycompany.myapp.service.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Date;

public class ProductDTO {

    public static int count;

    private Long id;

    @NotNull
    private String product_name;
    @NotNull
    private Date date_added;
    @NotNull
    private TextArea Description;
    @NotNull
    private int quantity;
    @NotNull
    private double price;
    @NotNull
    private boolean status;
    @NotNull
    private List image;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ProductDTO.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public TextArea getDescription() {
        return Description;
    }

    public void setDescription(TextArea description) {
        Description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List getImage() {
        return image;
    }

    public void setImage(List image) {
        this.image = image;
    }
}
