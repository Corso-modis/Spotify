package com.modis.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.modis.entities.BranoMusicale;
import com.modis.repo.BranoMusicaleRepo;
import com.modis.service.BranoMusicaleService;

@Transactional
@Service
public class BranoMusicaleServiceImpl implements BranoMusicaleService {
	private BranoMusicaleRepo branoMusicaleRepo;

	public BranoMusicaleServiceImpl(BranoMusicaleRepo branoMusicaleRepo) {
		super();
		this.branoMusicaleRepo = branoMusicaleRepo;
	}

	@Override
	public List<BranoMusicale> findAll() {
		return branoMusicaleRepo.findAll();
	}

	@Override
	public void save(BranoMusicale branoMusicale) {
		branoMusicaleRepo.save(branoMusicale);
	}

	@Override
	public BranoMusicale findById(long id) {
		return branoMusicaleRepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Non esiste un brano musicale con id " + id));
	}

}
