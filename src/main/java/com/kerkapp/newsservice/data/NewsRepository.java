package com.kerkapp.newsservice.data;

import com.kerkapp.newsservice.domain.NewsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsItem, Long> {
    
}