package com.Spring.mapping.ManyToManyProject.Repository;

import com.Spring.mapping.ManyToManyProject.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
