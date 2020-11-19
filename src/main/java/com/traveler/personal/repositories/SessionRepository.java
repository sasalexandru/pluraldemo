package com.traveler.personal.repositories;

import com.traveler.personal.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}
