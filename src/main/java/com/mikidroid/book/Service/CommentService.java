package com.mikidroid.book.Service;


import java.util.List;

import com.mikidroid.book.Entity.Comment;
import com.mikidroid.book.Repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    
    @Autowired
    CommentRepository commentRepository;

    //Get all book comments
    public List<Comment> getAll(Integer id)
    {
        return commentRepository.findByBookId(id);
    }

    //Get single book comment
    public Comment getOne(Integer id)
    {
        return commentRepository.findById(id).orElse(null);
    }

    //Update book comment
    public void update(Integer id,Comment comment)
    {
       Comment oldComment = commentRepository.findById(id).orElse(null);
       oldComment.setName(comment.getName()); 
       oldComment.setBody(comment.getBody());
       oldComment.setBookId(comment.getBookId());
       oldComment.setCreatedAt(comment.getCreatedAt());
       return;
    }

    //Create book comment
    public void create(Integer id,Comment comment)
    {
       commentRepository.save(comment);
       return;
    }

    //Delete book comment
    public void delete(Integer id)
    {
        commentRepository.deleteById(id);
        return;
    }
}
