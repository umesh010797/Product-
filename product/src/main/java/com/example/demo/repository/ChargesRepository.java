package com.example.demo.repository;

import com.example.demo.entity.Charges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargesRepository extends JpaRepository<Charges,Integer> {
}
