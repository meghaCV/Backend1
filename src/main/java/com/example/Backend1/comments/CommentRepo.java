package com.example.Backend1.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
    List<Comment> findAllByArticleId(Long articleId);
     List<Comment> findAllBytopics_id(Long topicId);
}
