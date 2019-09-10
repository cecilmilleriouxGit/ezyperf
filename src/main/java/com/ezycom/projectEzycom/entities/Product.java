package com.ezycom.projectEzycom.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product{
    public Product(){
    }

    public Product(Long purchase, int purchaseDate, int advDate, String commercial, 
    String productCode, int quantity, int preTaxeRealPrice, int preTaxeSalePrice, int marge){

        this.purchase = purchase;// numéro de commande
        this.purchaseDate = purchaseDate;// date de la commande
        this.advDate = advDate;
        this.commercial = commercial;//nom du commercial
        this.productCode = productCode;//code du Product
        this.quantity = quantity;//quantity de produits
        this.preTaxeRealPrice = preTaxeRealPrice;//prix réel hors taxe
        this.preTaxeSalePrice = preTaxeSalePrice;//prix de vente hors taxe
        this.marge = marge;//marge du Product
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
    private Long purchase;   
    private int purchaseDate;   
    private int advDate;    
    private String commercial;    
    private String productCode;   
    private int quantity;    
    private int preTaxeRealPrice;    
    private int preTaxeSalePrice;    
    private int marge;

    public Long getPurchase() {
        return purchase;
    }

    public void setPurchase(Long purchase) {
        this.purchase = purchase;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getAdvDate() {
        return advDate;
    }

    public void setAdvDate(int advDate) {
        this.advDate = advDate;
    }

    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPreTaxeRealPrice() {
        return preTaxeRealPrice;
    }

    public void setPreTaxeRealPrice(int preTaxeRealPrice) {
        this.preTaxeRealPrice = preTaxeRealPrice;
    }

    public int getPreTaxeSalePrice() {
        return preTaxeSalePrice;
    }

    public void setPreTaxeSalePrice(int preTaxeSalePrice) {
        this.preTaxeSalePrice = preTaxeSalePrice;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}