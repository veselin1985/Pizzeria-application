package com.spidermanteam.pizzeriaapp.service.base;

import com.spidermanteam.pizzeriaapp.model.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
    List<Comment> listAllComments();
}
