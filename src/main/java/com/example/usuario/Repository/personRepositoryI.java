package com.example.usuario.Repository;

import com.example.usuario.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepositoryI extends JpaRepository<Person, Long> {
    long count();
}
