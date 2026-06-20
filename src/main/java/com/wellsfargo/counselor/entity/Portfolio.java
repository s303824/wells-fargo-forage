package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity

public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date date;

    public Portfolio() {}

    public Portfolio(Client client, Date date){
        this.client = client;
        this.date = date;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
