package com.modis.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ascolto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate data;

	@ManyToOne(fetch = FetchType.EAGER)
	private BranoMusicale branoMusicale;


	public Ascolto(LocalDate data, BranoMusicale branoMusicale) {
		super();
		this.data = data;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BranoMusicale getBranoMusicale() {
		return branoMusicale;
	}

	public void setBranoMusicale(BranoMusicale branoMusicale) {
		this.branoMusicale = branoMusicale;
	}

	@Override
	public String toString() {
		return "Ascolto [id=" + id + ", data=" + data + ", branoMusicale=" + branoMusicale + "]";
	}

	
}
