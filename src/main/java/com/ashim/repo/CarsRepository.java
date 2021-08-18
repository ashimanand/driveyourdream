package com.ashim.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.ashim.entity.CarEntity;

@Repository
public interface CarsRepository extends JpaRepository<CarEntity, Long> {
	
	List<CarEntity> getByCarOwnerId(String ownerID);

}
