package com.tka.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id", unique = true, nullable = false)
    private long productID;

    @Column(name = "product_name", unique = true, nullable = false)
    private String productName;

    @Column(name = "product_qty", nullable = false)
    private int productQuantity;

    @Column(name = "product_price", nullable = false)
    private double productPrice;

    @Column(name = "mfg_date", nullable = false)
    private String mfgDate;

    @Column(name = "exp_date", nullable = false)
    private String expDate;

    public Product() {
        // Default constructor
    }

   

    public Product(long productID, String productName, int productQuantity, double productPrice, String mfgDate, String expDate) {
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
    }
    public Product(String productName, int productQuantity, double productPrice, String mfgDate, String expDate) {
        
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", productName=" + productName + ", productQuantity="
                + productQuantity + ", productPrice=" + productPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate
                + "]";
    }
}
