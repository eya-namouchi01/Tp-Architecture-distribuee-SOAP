package com.tp_archi_distribuee.soap.repository;

import com.tp_archi_distribuee.soap.model.Hotel;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
