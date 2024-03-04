package com.example.usuario.Repository;

import com.example.usuario.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepositotyI extends JpaRepository<Address, Long> {
}
