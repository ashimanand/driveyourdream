/**
 * 
 */
package com.ashim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashim.entity.CarRentalPlanEntity;

/**
 * @author FWIN01759
 *
 */
@Repository
public interface CarRentalPlanRepository extends JpaRepository<CarRentalPlanEntity, Long> {

}
