package com.ashim.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashim.entity.SessionEntity;

public interface SessionRepository extends JpaRepository<SessionEntity, UUID> {

}
