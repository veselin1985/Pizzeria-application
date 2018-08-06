package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.CommentRepository;
import com.spidermanteam.pizzeriaapp.model.Comment;

import java.util.List;

public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void addComment(Comment comment) {
        commentRepository.addComment(comment);
    }

    @Override
    public List<Comment> listAllComments() {
        return commentRepository.listAll();
    }
}
