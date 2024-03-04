package com.example.usuario.Controller;

import com.example.usuario.Service.personServiceImp;
import com.example.usuario.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class personController {

    @Autowired
    private personServiceImp userService;


    @GetMapping(value = "/findAllUsers")
    public List<Person> findAllUser(){
        return userService.findAllUsers();
    }


    @PostMapping("/saveUser")
    public Person saveUser(@RequestBody Person person){
        return userService.saveUser(person);
    }


    @PutMapping("/updateUser/{id}")
    public Person updateUser(@PathVariable Long id, @RequestBody Person person){
        return userService.updateUser(id, person);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "Succefully Deleted";
    }

    @GetMapping(value = "/count")
    public long getCount(){
        return userService.countPersons();
    }


}
