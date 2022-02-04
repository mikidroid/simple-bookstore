package com.mikidroid.book.Service;

import java.util.List;

import com.mikidroid.book.Entity.Book;
import com.mikidroid.book.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This controls the main logic of the backend
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    //Get all books
    public List<Book> getAll()
    {
        return bookRepository.findAll();
    }

    //Get single book
    public Book getOne(Integer id)
    {
        return bookRepository.findById(id).orElse(null);
    }

    //Update book
    public void update(Integer id,Book book)
    {
       Book oldBook = bookRepository.findById(id).orElse(null);
       oldBook.setAuthor(book.getAuthor()); 
       oldBook.setDescription(book.getDescription());
       oldBook.setPublishedYear(book.getPublishedYear());
       oldBook.setTitle(book.getTitle());
       return;
    }

    //Create book
    public void create(Book book)
    {
       bookRepository.save(book);
       return;
    }

    //Delete book
    public void delete(Integer id)
    {
        bookRepository.deleteById(id);
        return;
    }

}
