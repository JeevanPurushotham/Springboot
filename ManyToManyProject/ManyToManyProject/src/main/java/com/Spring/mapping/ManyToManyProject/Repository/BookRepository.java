package com.Spring.mapping.ManyToManyProject.Repository;

import com.Spring.mapping.ManyToManyProject.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
}
