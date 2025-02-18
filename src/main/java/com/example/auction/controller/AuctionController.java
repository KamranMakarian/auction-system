package com.example.auction.controller;

import com.example.auction.model.Auction;
import com.example.auction.service.AuctionService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
@PreAuthorize("isAuthenticated()")
public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @PreAuthorize("permitAll()")
    @GetMapping
    public List<Auction> getAllAuctions() {
        return auctionService.getAllAuctions();
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/{id}")
    public Auction getAuctionById(@PathVariable Long id) {
        return auctionService.getAuctionById(id);
    }

    @PreAuthorize("permitAll()")
    @GetMapping("/search")
    public List<Auction> searchAuctions(@RequestParam(required = false) String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("To search, use: /auctions/search?title=YourSearchTerm");
        }
        return auctionService.searchAuctionsByTitle(title);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Auction createAuction(@RequestBody Auction auction) {
        return auctionService.createAuction(auction);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuction(@PathVariable Long id) {
        auctionService.deleteAuction(id);
    }
}
