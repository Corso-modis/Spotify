package com.modis.service;

import java.util.List;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;

public interface AscoltoService {

	public long countByBranoMusicale(BranoMusicale branoMusicale);

	public void save(Ascolto ascolto);

	public List<Ascolto> findAll();
}
