package com.Spring.mapping.ManyToManyProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "books_authors", joinColumns = @JoinColumn(name = "book_id",referencedColumnName ="bookid"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName ="authorid" ))
    private List<Author> authors;

}
