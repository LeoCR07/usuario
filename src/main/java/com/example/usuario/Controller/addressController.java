package com.example.usuario.Controller;

import com.example.usuario.Service.addressServiceImp;
import com.example.usuario.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class addressController {

    @Autowired
    private addressServiceImp addressService;

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping(value = "/findAllAddresses")
    public List<Address> findAllAddresses(){
        return addressService.findAllAddress();
    }

    @DeleteMapping("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
        return "address succefully deleted ";
    }

    @PutMapping("/updateAddress/{id}")
    public Address updateUser(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

}
