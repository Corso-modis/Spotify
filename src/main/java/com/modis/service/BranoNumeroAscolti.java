package com.modis.service;

import com.modis.entities.BranoMusicale;

public class BranoNumeroAscolti {
	private BranoMusicale branoMusicale;
	private long numeroAscolti;

	public BranoNumeroAscolti(BranoMusicale branoMusicale) {
		this.branoMusicale = branoMusicale;
		this.numeroAscolti = branoMusicale.getAscolti().size();
	}

	public BranoNumeroAscolti() {
		super();
	}

	public BranoMusicale getBranoMusicale() {
		return branoMusicale;
	}

	public void setBranoMusicale(BranoMusicale branoMusicale) {
		this.branoMusicale = branoMusicale;
	}

	public long getNumeroAscolti() {
		return numeroAscolti;
	}

	public void setNumeroAscolti(long numeroAscolti) {
		this.numeroAscolti = numeroAscolti;
	}

}