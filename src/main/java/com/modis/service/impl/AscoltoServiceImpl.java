package com.modis.service.impl;

import org.springframework.stereotype.Service;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;
import com.modis.repo.AscoltoRepo;
import com.modis.service.AscoltoService;


@Service
public class AscoltoServiceImpl implements AscoltoService{
	private AscoltoRepo ascoltoRepo;
	
	public AscoltoServiceImpl(AscoltoRepo ascoltoRepo) {
		super();
		this.ascoltoRepo = ascoltoRepo;
	}

	@Override
	public long countByBranoMusicale(BranoMusicale branoMusicale) {
		return ascoltoRepo.countByBranoMusicale(branoMusicale);
	}

	@Override
	public void save(Ascolto ascolto) {
		ascoltoRepo.save(ascolto);
	}

}
