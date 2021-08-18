package com.ashim.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashim.entity.UserBaseEntity;


@Repository
public interface UserBaseRepository  extends JpaRepository<UserBaseEntity, Long> {
	
	public List<UserBaseEntity> getByUserId(String userId);
	

}
