package com.mikidroid.book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Comment {
        //Auto generated ID for the database
        @GeneratedValue
        @Id
        private Integer id;
    
        //Comment database columns
        private String name;
        private String body;
        private Integer bookId;   
        private String createdAt;
        
}
