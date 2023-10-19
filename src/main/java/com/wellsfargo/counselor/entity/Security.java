package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private long portfolioId;

    protected Security(){

    }

    public Security(String symbol, String type, int quantity, int price, int total, int purchaseDate, Portfolio portfolio){
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolio.getPortfolioId();
    }

    public String getSymbol(){return this.symbol;}

    public void setSymbol(String symbol){this.symbol = symbol;}

    public String getType(){return this.type;}

    public void setType(String type){this.type = type;}

    public int getPrice(){return this.price;}

    public void setPrice(int price){this.price = price;}

    public int getTotal(){return this.total;}

    public void setTotal(int total){this.total = total;}

    public int getPurchaseDate(){return this.purchaseDate;}

    public void setPurchaseDate(int purchaseDate){this.purchaseDate = purchaseDate;}

    public long getPortfolioId(){return this.portfolioId;}

    public void setPortfolioId(long portfolioId){this.portfolioId = portfolioId;}
}

