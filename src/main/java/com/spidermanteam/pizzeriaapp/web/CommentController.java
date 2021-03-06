package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.model.Comment;
import com.spidermanteam.pizzeriaapp.service.base.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/add")
    void addComment(@RequestBody Comment comment){
        commentService.addComment(comment);
    }

    @GetMapping
    List<Comment> listAllComments(){
        return commentService.listAllComments();
    }

}
