package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

    private SessionFactory factory;

    @Override
    public void addComment(Comment comment) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(comment);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
