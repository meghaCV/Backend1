package com.example.Backend1.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepo repo;

    public List<Comment> getAll() {
        return repo.findAll();
    }

    public Optional<Comment> getById(Long id) {
        System.out.println("Hello from Comment service");
        return repo.findById(id);
    }

    public Comment create(Comment Comment) {
        return repo.save(Comment);
    }

    public Comment update(Comment updatedComment) {
        return repo.save(updatedComment);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Comment> getAllByArticleId(Long articleId) {
        return repo.findAllByArticleId(articleId);
    }

    public List<Comment> getAllByTopicId(Long topicId) {
        return repo.findAllBytopics_id(topicId);
    }
}
