package com.mycompany.myapp.domain;


import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "Bills")

public class Bills extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_bill")
    private boolean status_bill;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "customer_address")
    private String customer_address;

    @Column(name = "customer_phone")
    private String customer_phone;

    @Column(name = "customer_email")
    private String customer_email;

    @Column(name = "customer_sex")
    private String customer_sex;

    @Column(name = "description")
    private TextArea description;

    public Bills() {
    }

    public Bills(Long id, boolean status_bill, String customer_name, String customer_address, String customer_phone, String customer_email, String customer_sex, TextArea description) {
        this.id = id;
        this.status_bill = status_bill;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_sex = customer_sex;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus_bill() {
        return status_bill;
    }

    public void setStatus_bill(boolean status_bill) {
        this.status_bill = status_bill;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_sex() {
        return customer_sex;
    }

    public void setCustomer_sex(String customer_sex) {
        this.customer_sex = customer_sex;
    }

    public TextArea getDescription() {
        return description;
    }

    public void setDescription(TextArea description) {
        this.description = description;
    }
}
