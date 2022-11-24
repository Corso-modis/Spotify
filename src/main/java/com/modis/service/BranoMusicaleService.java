package com.modis.service;

import java.util.List;

public interface BranoMusicaleService {
	List<BranoMusicale> findAll();
	
	void save(BranoMusicale branoMusicale);
}
