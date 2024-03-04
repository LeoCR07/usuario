package com.example.usuario.Service;

import com.example.usuario.Service.interfaces.personServiceI;
import com.example.usuario.entity.Person;
import com.example.usuario.Repository.personRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class personServiceImp implements personServiceI {

    @Autowired
    private personRepositoryI repositoryI;

    @Override
    public List<Person> findAllUsers() {
        return repositoryI.findAll();
    }

    @Override
    public Person saveUser(Person person) {

        return repositoryI.save(person);
    }


    @Override
    public Person updateUser(long id, Person person) {
        Person oldPerson = repositoryI.findById(id).get();

        if(Objects.nonNull(person.getFirstName()) && !"".equalsIgnoreCase(person.getFirstName())){
            oldPerson.setFirstName(person.getFirstName());
        }

        if(Objects.nonNull(person.getLastName()) && !"".equalsIgnoreCase(person.getLastName())){
            oldPerson.setLastName(person.getLastName());
        }

        return repositoryI.save(oldPerson);
    }

    @Override
    public long countPersons() {
        return repositoryI.count();
    }


    @Override
    public void deleteUser(long id) {
        repositoryI.deleteById(id);
    }

}
