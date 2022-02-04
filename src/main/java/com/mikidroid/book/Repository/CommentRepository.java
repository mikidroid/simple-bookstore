package com.mikidroid.book.Repository;

import java.util.List;

import com.mikidroid.book.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//The repository for Comment entity, extending Jpa for database mapping
@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    
    //Finds the list of comments for a particular book using book_id colomn in the database
    List<Comment> findByBookId(Integer id);
    
}
