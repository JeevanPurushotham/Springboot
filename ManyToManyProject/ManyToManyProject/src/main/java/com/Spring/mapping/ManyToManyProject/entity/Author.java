package com.Spring.mapping.ManyToManyProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;
//    @ManyToMany
//    private List<Books> books;
}

/*  JSON Format for add -->
[
        {
        "bookId": 37,
        "bookName": "Harry Potter",
        "authors": [
        {
        "authorId": 38,
        "authorName": "Jeevan P"
        },
        {
        "authorId": 39,
        "authorName": "Anirudh"
        }
        ]
        },
        {
        "bookId": 40,
        "bookName": "Ha",
        "authors": [
        {
        "authorId": 41,
        "authorName": "Jeevan"
        },
        {
        "authorId": 42,
        "authorName": "Ani"
        }
        ]
        }
        ]*/
