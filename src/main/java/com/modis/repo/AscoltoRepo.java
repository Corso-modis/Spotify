package com.modis.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AscoltoRepo extends JpaRepository<Ascolto, Long>{
	long countByBranoMusicale(BranoMusicale branoMusicale);
}
