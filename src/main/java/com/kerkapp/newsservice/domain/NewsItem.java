package com.kerkapp.newsservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data @NoArgsConstructor
public class NewsItem {
    @Id
    @GeneratedValue
    private long Id;

    private String Title;

    private String Message;

    public NewsItem(String title, String message) {
        this.Title = title;
        this.Message = message;
    }
}