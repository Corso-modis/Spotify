package com.modis.service;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;


public interface AscoltoService {
	long countByBranoMusicale(BranoMusicale branoMusicale);
	
	void save(Ascolto ascolto);
}
