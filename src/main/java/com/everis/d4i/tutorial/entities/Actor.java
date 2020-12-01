package com.everis.d4i.tutorial.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACTORS")
public class Actor implements Serializable {

	private static final long serialVersionUID = 2868454931207752905L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME", unique = true)
	private String name;
	
	@Column(name = "FIRST NAME")
	private String firstName;

	@Column(name = "SECOND NAME")
	private String secondName;

	@Column(name = "DATE OF BIRTH")
	private Date dateOfBirth;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actor")
	private List<TvShow> tvShows;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<TvShow> getTvShows() {
		return tvShows;
	}

	public void setTvShows(List<TvShow> tvShows) {
		this.tvShows = tvShows;
	}

	
	
}
