package com.mikidroid.book.Repository;

import com.mikidroid.book.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//The repository for Book entity, extending Jpa for database mapping
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    
}
