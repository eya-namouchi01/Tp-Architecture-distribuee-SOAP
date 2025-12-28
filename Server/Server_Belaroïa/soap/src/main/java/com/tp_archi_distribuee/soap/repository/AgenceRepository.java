package com.tp_archi_distribuee.soap.repository;

import com.tp_archi_distribuee.soap.model.Agence;
import com.tp_archi_distribuee.soap.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenceRepository extends JpaRepository<Agence, Integer> {
}
