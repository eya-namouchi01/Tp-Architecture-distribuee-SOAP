package com.tp_archi_distribuee.soap.repository;

import com.tp_archi_distribuee.soap.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findByEmail(String email);
}
