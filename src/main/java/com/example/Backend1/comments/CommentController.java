package com.example.Backend1.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CommentController {
    private CommentService commentService;

    public CommentController(@Autowired CommentService CommentService) {
        this.commentService = commentService;
    }

    @GetMapping("/Comments")
    public List<Comment> getAll(@RequestParam(required = false) Long ArticleId, @RequestParam(required = false) Long topicId) {
        if (topicId != null) {
            return commentService.getAllByArticleId(topicId);
        }
        else if (ArticleId != null) {
            return commentService.getAllByArticleId(ArticleId);
        } else {
            return commentService.getAll();
        }
    }

    @GetMapping("Comments/{id}")
    public Comment getById(@PathVariable Long id) {
        return commentService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/Comments")
    public Comment create(@RequestBody Comment comment) {
        return commentService.create(comment);
    }

    @PutMapping("/Comments/{id}")
    public Comment update(@RequestBody Comment comment) {
        return commentService.update(comment);
    }

    @DeleteMapping("Comments/{id}")
    public void delete(@PathVariable Long id) {
        commentService.delete(id);
    }
}
