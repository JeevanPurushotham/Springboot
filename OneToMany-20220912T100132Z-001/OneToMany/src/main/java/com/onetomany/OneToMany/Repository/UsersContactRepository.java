package com.onetomany.OneToMany.Repository;

import com.onetomany.OneToMany.Entity.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
