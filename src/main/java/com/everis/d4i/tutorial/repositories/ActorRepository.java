package com.everis.d4i.tutorial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.d4i.tutorial.entities.Actor;
import com.everis.d4i.tutorial.entities.Award;
import com.everis.d4i.tutorial.entities.Season;
import com.everis.d4i.tutorial.entities.TvShow;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

	Actor findByid(long id);

	
}
