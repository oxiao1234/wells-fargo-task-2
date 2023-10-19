package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private int riskFactor;

    @Column(nullable = false)
    private long total;

    @Column(nullable = false)
    private long clientId;

    protected Portfolio(){

    }

    public Portfolio(long portfolioId, String portfolioName, int riskFactor, long total, Client client){
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.riskFactor = riskFactor;
        this.total = total;
        this.clientId = client.getClientId();
    }

    public Long getPortfolioId(){return this.portfolioId;}

    public String getPortfolioName(){return this.portfolioName;}

    public void setPortfolioName(String portfolioName){this.portfolioName = portfolioName;}

    public int getRiskFactor(){return this.getRiskFactor();}

    public void setRiskFactor(int riskFactor){this.riskFactor = riskFactor;}

    public long getTotal(){return this.total;}

    public void setTotal(long total){this.total = total;}

    public long getClientId(){return this.clientId;}

    public void setClientId(long clientId){this.clientId = clientId;}
}
