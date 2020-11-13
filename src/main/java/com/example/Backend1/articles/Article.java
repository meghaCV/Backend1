package com.example.Backend1.articles;
import com.example.Backend1.comments.Comment;

import javax.persistence.*;
import java.util.List;

    @Entity
    public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String authorName;
        private String title;
        private String body;

        @OneToMany
        private List<Comment> comments;

        public Article() {
        }

        public Article(Long id, String authorName,String title,String body) {
            this.id = id;
            this.authorName = authorName;
            this.title = title;
            this.body = body;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getauthorName() {
            return authorName;
        }

        public void setauthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }


