package com.ashim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashim.entity.CarOwnerEntity;

@Repository
public interface CarOwnerRepository extends JpaRepository<CarOwnerEntity, Long> {

}
