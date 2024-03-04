package com.example.usuario.Service.interfaces;

import com.example.usuario.entity.Address;

import java.util.List;

public interface addressServiceI {
    List<Address> findAllAddress();
    Address saveAddress(Address address);

    Address updateAddress(long id,Address address);

    void deleteAddress(long id);


}
