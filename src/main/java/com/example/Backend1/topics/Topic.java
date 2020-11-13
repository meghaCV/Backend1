package com.example.Backend1.topics;

import com.example.Backend1.comments.Comment;
import javax.persistence.*;
import java.util.List;

    @Entity
    public class Topic {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String topicName;

        @ManyToMany(mappedBy = "topics")
        private List<Comment> comments;


        public Topic() {
        }

        public Topic(Long id, String topicName) {
            this.id = id;
            this.topicName = topicName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String gettopicName() {
            return topicName;
        }

        public void settopicName(String topicName) {
            this.topicName = topicName;
        }
    }


