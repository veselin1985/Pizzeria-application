package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Comment;

import java.util.List;

public interface CommentRepository {

    void addComment(Comment comment);
    List<Comment> listAll();
}
