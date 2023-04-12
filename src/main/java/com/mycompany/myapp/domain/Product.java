package com.mycompany.myapp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "Product")
public class Product {

    public static int count;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    @NotNull
    private String product_name;
    @Column(name = "date_added")
    @NotNull
    private Date date_added;
    @Column(name = "Description")
    @NotNull
    private TextArea Description;
    @Column(name = "quantity")
    @NotNull
    private int quantity;
    @Column(name = "price")
    @NotNull
    private double price;
    @Column(name = "status")
    @NotNull
    private boolean status;
    @Column(name = "image")
    @NotNull
    private List image;


    public Product() {
    }

    public Product(Long id, String product_name, Date date_added, TextArea description, int quantity, double price, boolean status, List image) {
        this.id = id;
        this.product_name = product_name;
        this.date_added = date_added;
        Description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.image = image;
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


    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", product_name='" + product_name + '\'' +
            ", date_added=" + date_added +
            ", Description=" + Description +
            ", quantity=" + quantity +
            ", price=" + price +
            ", status=" + status +
            ", image=" + image +
            '}';
    }
}
