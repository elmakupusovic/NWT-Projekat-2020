package com.example.hotel.ena.repository;

import com.example.hotel.ena.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface SalaRepository extends JpaRepository<SalaEntity, Long> {
}
