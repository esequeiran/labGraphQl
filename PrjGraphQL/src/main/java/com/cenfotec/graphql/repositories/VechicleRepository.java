package com.cenfotec.graphql.repositories;

import org.springframework.stereotype.Repository;
import com.cenfotec.graphql.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VechicleRepository extends JpaRepository<Vehicle, Integer> {

}
