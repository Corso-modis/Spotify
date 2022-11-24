package com.modis.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BranoMusicale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titolo;
	private String autore;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "branoMusicale")
	private Set<Ascolto> ascolto;

	public BranoMusicale(Long id, String titolo, String autore, BranoMusicale branoMusicale) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}

	public BranoMusicale() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public Set<Ascolto> getAscolto() {
		return ascolto;
	}

	public void setAscolto(Set<Ascolto> ascolto) {
		this.ascolto = ascolto;
	}

	@Override
	public String toString() {
		return "BranoMusicale [id=" + id + ", titolo=" + titolo + ", autore=" + autore + "]";
	}

	
}
