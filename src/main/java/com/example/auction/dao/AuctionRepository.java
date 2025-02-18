package com.example.auction.dao;

import com.example.auction.model.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
    List<Auction> findByTitleContaining(String title);
}