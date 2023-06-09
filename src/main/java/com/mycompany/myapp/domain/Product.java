package com.mycompany.myapp.domain;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "Product")
@AllArgsConstructor
public class Product extends AbstractAuditingEntity{

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

    @ManyToOne
    @JoinColumn(name = "category_Product")
    private Product product;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product() {
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
