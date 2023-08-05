package com.example.newsfeedreader.services;

import com.example.newsfeedreader.models.FeedItem;
import com.example.newsfeedreader.repositories.FeedItemRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FeedItemService {

    @Autowired
    FeedItemRepositories feedItemRepositories;

    public List<FeedItem> getAll(){
        return feedItemRepositories.findAll();
    }

    public Optional <FeedItem> getById(Long id){
        return feedItemRepositories.findById(id);
    }

    public FeedItem save(FeedItem feedItem){
        if (feedItem.getId() == null){
            feedItem.setCreatedAt(LocalDateTime.now());
        }
        feedItem.setUpdatedAt(LocalDateTime.now());
        return feedItemRepositories.save(feedItem);
    }








}
