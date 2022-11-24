package com.modis.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Entity
public class Ascolto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime data;

	@ManyToOne
	@JoinColumn
	private BranoMusicale branoMusicale;

	public Ascolto(LocalDateTime data, BranoMusicale branoMusicale) {
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

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
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
		return "Ascolto [id=" + id + ", data=" + data + "]";
	}

}
