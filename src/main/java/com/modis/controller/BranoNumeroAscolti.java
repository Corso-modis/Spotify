package com.modis.controller;

import org.springframework.stereotype.Service;

import com.modis.entities.BranoMusicale;

@Service
public class BranoNumeroAscolti {
	private String titolo;
	private String autore;
	private long numeroVisualizzazioni;

	public BranoNumeroAscolti(BranoMusicale branoMusicale) {
		this.titolo = branoMusicale.getTitolo();
		this.autore = branoMusicale.getAutore();
		this.numeroVisualizzazioni = branoMusicale.getAscolti().size();
	}

	public BranoNumeroAscolti() {
		super();
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

	public long getNumeroVisualizzazioni() {
		return numeroVisualizzazioni;
	}

	public void setNumeroVisualizzazioni(long numeroVisualizzazioni) {
		this.numeroVisualizzazioni = numeroVisualizzazioni;
	}

}