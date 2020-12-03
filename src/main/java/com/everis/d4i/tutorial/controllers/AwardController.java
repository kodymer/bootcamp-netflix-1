package com.everis.d4i.tutorial.controllers;

import java.util.List;

import com.everis.d4i.tutorial.exceptions.NetflixException;
import com.everis.d4i.tutorial.json.AwardRest;
import com.everis.d4i.tutorial.responses.NetflixResponse;


public interface AwardController {
	//NetflixResponse<List<AwardRest>> getAwards() throws NetflixException;

	NetflixResponse<List<AwardRest>> getAwardsByTvShow(int tvShowId) throws NetflixException;

}
