package com.example.newsfeedreader.controllers;

import com.example.newsfeedreader.models.FeedItem;
import com.example.newsfeedreader.services.FeedItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FeedItemService feedItemService;

    @GetMapping("/")
    public String defaultPage(Model model){
        List<FeedItem> feeds = feedItemService.getAll();
        model.addAttribute("feeds", feeds);
        return "index";
    }

    @GetMapping("/feeds")
    public String feedsPage(Model model) {
        List<FeedItem> feeds = feedItemService.getAll();
        model.addAttribute("feeds", feeds);

        FeedItem feedItem = new FeedItem();
        model.addAttribute("newFeed", feedItem);
        return "feeds";
    }
}
