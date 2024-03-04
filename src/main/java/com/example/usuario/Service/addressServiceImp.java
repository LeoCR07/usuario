package com.example.usuario.Service;

import com.example.usuario.Repository.addressRepositotyI;
import com.example.usuario.Service.interfaces.addressServiceI;
import com.example.usuario.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class addressServiceImp implements addressServiceI {

    @Autowired
    private addressRepositotyI addressRepositotyI;

    @Override
    public List<Address> findAllAddress() {
        return addressRepositotyI.findAll();
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepositotyI.save(address);
    }

    @Override
    public Address updateAddress(long id, Address address) {
        Address oldAddress = addressRepositotyI.findById(id).get();

        if(Objects.nonNull(address.getCity()) && !"".equalsIgnoreCase(address.getCity())){
            oldAddress.setCity(address.getCity());
        }

        if(Objects.nonNull(address.getState()) && !"".equalsIgnoreCase(address.getState())){
            oldAddress.setState(address.getState());
        }

        if(Objects.nonNull(address.getPostalCode()) && !"".equalsIgnoreCase(address.getPostalCode())){
            oldAddress.setPostalCode(address.getPostalCode());
        }

        if(Objects.nonNull(address.getStreet()) && !"".equalsIgnoreCase(address.getStreet())){
            oldAddress.setStreet(address.getStreet());
        }

        return addressRepositotyI.save(oldAddress);
    }

    @Override
    public void deleteAddress(long id) {
        addressRepositotyI.deleteById(id);
    }


}
