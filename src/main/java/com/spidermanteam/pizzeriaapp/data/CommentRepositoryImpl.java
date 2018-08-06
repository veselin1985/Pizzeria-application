package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Comment> listAll() {
        List<Comment> comments = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            comments = session.createQuery("from Comment").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return comments;

    }

}
