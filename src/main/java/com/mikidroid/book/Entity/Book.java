package com.mikidroid.book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
public class Book {
    //Auto generated ID for the database
    @GeneratedValue
    @Id
    private Integer id;

    //Book database columns
    private String title;
    private String author;
    private Integer publishedYear;
    private String description;
    
    
}
