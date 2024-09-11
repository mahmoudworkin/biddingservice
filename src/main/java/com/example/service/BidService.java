package com.example.service;

import com.example.domain.Bid;
import com.example.repository.BidRepository;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class BidService {

    private final BidRepository bidRepository;

    public BidService(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    public Optional<Bid> findByItemId(Long itemId) {
        return bidRepository.findById(itemId);
    }

    public Bid saveBid(Bid bid) {
        return bidRepository.save(bid);
    }
}
