package com.kerkapp.newsservice.api;

import com.kerkapp.newsservice.data.NewsRepository;
import com.kerkapp.newsservice.domain.NewsItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController
{
    private final NewsRepository newsRepository;

    public NewsController(NewsRepository newsRepository)
    {
        this.newsRepository = newsRepository;
    }

    @GetMapping("/")
    List<NewsItem>  getAll() {
        return newsRepository.findAll();
    }

    @PostMapping("/")
    NewsItem newsItem( @RequestBody NewsItem newsItem ) {
        return newsRepository.save(newsItem);
    }
}
