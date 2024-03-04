package com.example.usuario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Embeddable
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_address;

    private String street;
    private String city;
    private String state;
    private String postalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person")
    private Person person;



    /*
    public Address(long id,String street, String city, String state, String postalCode) {
        this.id_address = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
     */
}
