package com.fleet.apifleetmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fleet.apifleetmanagement.model.Trajectories;

@Repository
public interface TrajectoriesRepository extends JpaRepository<Trajectories, Integer> {
    @Query("SELECT t FROM Trajectories t WHERE t.taxi.id = :taxiId  ORDER BY t.fecha DESC, t.hora DESC")
    List<Trajectories> findLastLocationByTaxiId(@Param("taxiId") int taxiId);

}
