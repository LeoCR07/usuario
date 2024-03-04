package com.example.usuario.Service.interfaces;

import com.example.usuario.entity.Person;

import java.util.List;

public interface personServiceI {
     List<Person> findAllUsers();
     Person saveUser(Person person);
     Person updateUser(long id, Person person);

     void deleteUser(long id);

      long countPersons();

}
