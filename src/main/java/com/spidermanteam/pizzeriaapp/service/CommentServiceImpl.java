package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.CommentRepository;
import com.spidermanteam.pizzeriaapp.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;

    @Autowired
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
