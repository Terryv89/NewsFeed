package com.example.newsfeedreader.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedItem {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String url;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

}
