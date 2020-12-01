package com.everis.d4i.tutorial.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.d4i.tutorial.entities.Actor;
import com.everis.d4i.tutorial.exceptions.InternalServerErrorException;
import com.everis.d4i.tutorial.exceptions.NetflixException;
import com.everis.d4i.tutorial.json.ActorRest;
import com.everis.d4i.tutorial.repositories.ActorRepository;
import com.everis.d4i.tutorial.services.ActorService;
import com.everis.d4i.tutorial.utils.constants.ExceptionConstants;

@Service
public class ActorServiceImpl implements ActorService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ActorServiceImpl.class);

	@Autowired
	private ActorRepository ActorRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public List<ActorRest> getActors() throws NetflixException {

		return ActorRepository.findAll().stream().map(Actor -> modelMapper.map(Actor, ActorRest.class))
				.collect(Collectors.toList());

	}

	public ActorRest createActors(final ActorRest ActorRest) throws NetflixException {
		Actor Actor = new Actor();
		Actor.setName(ActorRest.getName());
		try {
			Actor = ActorRepository.save(Actor);
		} catch (final Exception e) {
			LOGGER.error(ExceptionConstants.INTERNAL_SERVER_ERROR, e);
			throw new InternalServerErrorException(ExceptionConstants.INTERNAL_SERVER_ERROR);
		}
		return modelMapper.map(Actor, ActorRest.class);
	}
}
