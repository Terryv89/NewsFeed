package com.example.newsfeedreader.controllers;

import com.example.newsfeedreader.models.FeedItem;
import com.example.newsfeedreader.services.FeedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private FeedItemService feedItemService;

    @PostMapping("/feeds/new")
    public String createFeedItem(@ModelAttribute FeedItem feedItem){
        feedItemService.save(feedItem);
        return "redirect:/feeds";
    }

}
