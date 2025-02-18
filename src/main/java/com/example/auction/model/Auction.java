package com.example.auction.model;

import jakarta.persistence.*;

@Entity
@Table(name = "auctions")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String username;
    private double currentBid;

    public Auction() {}

    public Auction(String title, String description, String username, double currentBid) {
        this.title = title;
        this.description = description;
        this.username = username;
        this.currentBid = currentBid;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUsername() {
        return username;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }
}