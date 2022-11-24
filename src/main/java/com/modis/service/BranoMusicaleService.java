package com.modis.service;

import java.util.List;

import com.modis.entities.BranoMusicale;

public interface BranoMusicaleService {
	List<BranoMusicale> findAll();
	
	void save(BranoMusicale branoMusicale);
	
	BranoMusicale findById(long id);
	
}
