package com.modis.service;

import java.util.List;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;


public interface AscoltoService {
	long countByBranoMusicale(BranoMusicale branoMusicale);
	
	void save(Ascolto ascolto);
	
	List<Ascolto> findAll();
}
