package com.fleet.apifleetmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<com.fleet.apifleetmanagement.model.Taxi, Integer> {

    @Query("SELECT t FROM Taxi t WHERE t.id = :id")
    com.fleet.apifleetmanagement.model.Taxi findById(@Param("id") int id);

    @Query("SELECT t FROM Taxi t WHERE t.license = :license")
    com.fleet.apifleetmanagement.model.Taxi findByLicense(@Param("license") String license);
}