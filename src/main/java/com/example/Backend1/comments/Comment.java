package com.example.Backend1.comments;

import com.example.Backend1.articles.Article;
import com.example.Backend1.topics.Topic;

import javax.persistence.*;
import java.util.List;

    @Entity
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String authorName;



        @Column(columnDefinition = "TEXT")
        private String body;

        @ManyToOne
        private Article article;

        @ManyToMany
        private List<Topic> topics;


        public Comment() {}

        public Comment(Long id, String authorName, String body) {
            this.id = id;
            this.authorName = authorName;
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

        public String getbody() {
            return body;
        }

        public void setbody(String body) {
            this.body = body;
        }

        public Article getArticle() {
            return article;
        }

        public void setArticle(Article Article) {
            this.article = Article;
        }

        public List<Topic> gettopics() {
            return topics;
        }

        public void settopics(List<Topic> topics) {
            this.topics = topics;
        }
    }


