package com.modis.service.impl;

import org.springframework.stereotype.Service;
import com.modis.service.Ascolto;
import com.modis.service.AscoltoService;
import com.modis.service.BranoMusicale;

@Service
public class AscoltoServiceImpl implements AscoltoService{
	private AscoltoRepo ascoltoRepo;
	
	public AscoltoServiceImpl(AscoltoRepo ascoltoRepo) {
		super();
		this.ascoltoRepo = ascoltoRepo;
	}

	@Override
	public long countByBranoMusicale(BranoMusicale branoMusicale) {
		return ascoltoRepo.countByBranoMusicale(BranoMusicale branoMusicale);
	}

	@Override
	public long countByBranoMusicale(BranoMusicale branoMusicale) {
		return ascoltoRepo.countByBranoMusicale();
	}

	@Override
	public void save(Ascolto ascolto) {
		ascoltoRepo.save(ascolto);
	}
	
}
