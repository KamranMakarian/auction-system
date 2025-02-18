package com.example.auction.service;

import com.example.auction.dao.AuctionRepository;
import com.example.auction.model.Auction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public List<Auction> getAllAuctions() {
        return auctionRepository.findAll();
    }

    public Auction getAuctionById(Long id) {
        return auctionRepository.findById(id).orElse(null);
    }

    public List<Auction> searchAuctionsByTitle(String title) {
        return auctionRepository.findByTitleContaining(title);
    }

    public Auction createAuction(Auction auction) {
        return auctionRepository.save(auction);
    }

    public void deleteAuction(Long id) {
        auctionRepository.deleteById(id);
    }
}