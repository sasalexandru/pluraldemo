package com.traveler.personal.repositories;


import com.traveler.personal.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
