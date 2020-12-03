package com.everis.d4i.tutorial.services;

import java.util.List;

import com.everis.d4i.tutorial.exceptions.NetflixException;
import com.everis.d4i.tutorial.json.ActorRest;
import com.everis.d4i.tutorial.json.TvShowRest;
import com.everis.d4i.tutorial.responses.NetflixResponse;

public interface ActorService {
	
	List<ActorRest> getActors() throws NetflixException;

	ActorRest createActors(ActorRest ActorRest) throws NetflixException;
	
	ActorRest getActorById(Long id) throws NetflixException;

	void deleteActorById(Long id) throws NetflixException;

	//void modifyActorById(ActorRest actor) throws NetflixException;


}
