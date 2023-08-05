package com.example.newsfeedreader.controllers;

import com.example.newsfeedreader.models.FeedItem;
import com.example.newsfeedreader.services.FeedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/feeditems")
public class FeedItemController {

    @Autowired
    FeedItemService feedItemService;

    @GetMapping
    public List<FeedItem> getAllFeedItems(){
        return feedItemService.getAll();
    }
    @GetMapping("/{id}")
    public FeedItem getFeedItem(@PathVariable Long id) {
        Optional<FeedItem> theItem = feedItemService.getById(id);
        FeedItem item = null;
        if (theItem.isPresent()) {
            item = theItem.get();
        }
        return item;
    }


}
