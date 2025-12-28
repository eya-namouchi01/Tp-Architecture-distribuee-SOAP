package com.tp_archi_distribuee.soap.repository;

import com.tp_archi_distribuee.soap.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
