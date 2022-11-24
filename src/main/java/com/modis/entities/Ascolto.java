package com.modis.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Ascolto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Timestamp date;

	@ManyToOne
	@JoinColumn
	private BranoMusicale branoMusicale;

	public Ascolto(Timestamp date, BranoMusicale branoMusicale) {
		super();
		this.date = date;
		this.branoMusicale = branoMusicale;
	}

	public Ascolto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getData() {
		return date;
	}

	public void setData(Timestamp date) {
		this.date = date;
	}

	public BranoMusicale getBranoMusicale() {
		return branoMusicale;
	}

	public void setBranoMusicale(BranoMusicale branoMusicale) {
		this.branoMusicale = branoMusicale;
	}

	@Override
	public String toString() {
		return "Ascolto [id=" + id + ", date=" + date + "]";
	}

}
