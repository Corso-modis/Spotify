package com.modis.service;

import com.modis.service.impl.BranoMusicale;

public interface AscoltoService {
	long countByBranoMusicale(BranoMusicale branoMusicale);
	
	void save(Ascolto ascolto);
}
