package com.example.Backend1.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

    @RestController
    public class ArticleController {
        private ArticleService ArticleService;

        public ArticleController(@Autowired ArticleService ArticleService) {
            this.ArticleService = ArticleService;
        }

        @GetMapping("/articles")
        public List<Article> getAll() {
            return ArticleService.getAll();
        }

        @GetMapping("articles/{id}")
        public Article getById(@PathVariable Long id) {
            return ArticleService.getById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        }


        @PostMapping("/articles")
        public Article create(@RequestBody Article article) {
            return ArticleService.create(article);
        }

        @PutMapping("/articles/{id}")
        public Article update(@RequestBody Article article) {
            return ArticleService.update(article);
        }

        @DeleteMapping("articles/{id}")
        public void delete(@PathVariable Long id) {
            ArticleService.delete(id);
        }
    }


