package com.example.usuario;

import com.example.usuario.Repository.personRepositoryI;
import com.example.usuario.entity.Address;
import com.example.usuario.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class PersonTest {

    @Autowired
    private personRepositoryI repositoryI;

    @Test
    public void saveUser(){

        //Does not work : ( IDK
        Person person = Person.builder()
                .lastName("Salazar")
                .firstName("Leonel")
                .build();

        List<Address> lst = new ArrayList<>();


        Address address_1 = Address.builder()
                .postalCode("Alajuela")
                .city("Poas")
                .street("1")
                .state("4")
                .build();


        Address address_2 = Address.builder()
                .postalCode("Heredia")
                .city("cr")
                .street("100")
                .state("400")
                .build();

        lst.add(address_1);
        lst.add(address_2);

        person.setAddresses(lst);
        repositoryI.save(person);

    }



}
