package com.fleet.apifleetmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajectoriesRepository extends JpaRepository<TrajectoriesRepository, Integer> {
    @Query("SELECT t FROM Trajectories t WHERE t.taxi.id = :taxiId  ORDER BY t.fecha DESC, t.hora DESC")
    TrajectoriesRepository findLastLocationByTaxiId(@Param("taxiId") int taxiId);

}