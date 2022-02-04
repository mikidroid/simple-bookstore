package com.mikidroid.book.Controller;
import java.util.List;
import com.mikidroid.book.Entity.Comment;
import com.mikidroid.book.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

//gives a prefix "api/books" to for easy identification
@RequestMapping("/api/comment")
public class CommentController {
    
    //Connects the bookservice to this class to perform main logic in all mappings
    @Autowired
    CommentService commentService;

    @GetMapping("/{book_id}")
    public List<Comment> getAll(@PathVariable Integer book_id) {

        //Get all comments using book_id
        return commentService.getAll(book_id);
    }
    
    //Add new comment
    @PostMapping("/add/{book_id}")
    public String create(@PathVariable Integer id,@RequestBody Comment comment) throws Exception {
     
          //Try to create book and throw error if not successful
          try{
            commentService.create(id,comment);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }

    //update comment
    @PostMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody Comment comment) throws Exception {
     
          //Try to create book and throw error if not successful
          try{
            commentService.update(id,comment);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }
    
    //Delete comment
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) throws Exception {

          //Try to delete book and throw error if unsuccesful
          try{
            commentService.delete(id);
            return "success";
          } 
          catch(Throwable e) {
            return "error";
          }
    }

}
