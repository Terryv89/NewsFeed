package com.example.newsfeedreader.repositories;

import com.example.newsfeedreader.models.FeedItem;
import org.springframework.data.repository.ListCrudRepository;

public interface FeedItemRepositories extends ListCrudRepository<FeedItem, Long> {
}