package com.modis.entities;

import java.util.HashSet;
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
	private Set<Ascolto> ascolti = new HashSet<>();

	private long numeroAscolti;

	public BranoMusicale(String titolo, String autore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.numeroAscolti = ascolti.size();
	}

	public BranoMusicale() {
		super();
	}

	public Set<Ascolto> getAscolti() {
		return ascolti;
	}

	public void setAscolti(Set<Ascolto> ascolti) {
		this.ascolti = ascolti;
	}

	public long getNumeroAscolti() {
		return numeroAscolti;
	}

	public void setNumeroAscolti(long numeroAscolti) {
		this.numeroAscolti = numeroAscolti;
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

	@Override
	public String toString() {
		return "BranoMusicale [id=" + id + ", titolo=" + titolo + ", autore=" + autore + "]";
	}

}
