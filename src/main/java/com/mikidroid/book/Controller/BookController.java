package com.mikidroid.book.Controller;

import java.util.List;
import com.mikidroid.book.Entity.Book;
import com.mikidroid.book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin

//gives a prefix "api/books" to for easy identification
@RequestMapping("/api/book")

public class BookController {

    //Connects the bookservice to this class to perform main logic in all mappings
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public List<Book> getAll() {

        //returns all books from service
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id) throws Exception {

          //return single book from service
          return bookService.getOne(id);
    }
    
    @PostMapping("/add")
    public String create(@RequestBody Book book) throws Exception {
     
          //Try to create book and throw error if not successful
          try{
            bookService.create(book);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody Book book) throws Exception {
     
          //Try to update book and throw error if not successful
          try{
            bookService.update(id,book);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) throws Exception {

          //Try to delete book and throw error if unsuccesful
          try{
            bookService.delete(id);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }


}
