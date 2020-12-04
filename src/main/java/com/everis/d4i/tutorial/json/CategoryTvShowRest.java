package com.everis.d4i.tutorial.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryTvShowRest implements Serializable {

	private static final long serialVersionUID = -1099876298318607982L;
	
	
	private TvShowRest tvshow;
	//private Long id;
	private CategoryRest category;
	/*
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
*/
	public TvShowRest getTvshow() {
		return tvshow;
	}

	public void setTvshow(TvShowRest tvshow) {
		this.tvshow = tvshow;
	}
	
	public CategoryRest getCategory() {
		return category;
	}

	public void setCategory(CategoryRest category) {
		this.category = category;
	}
	
	
}
