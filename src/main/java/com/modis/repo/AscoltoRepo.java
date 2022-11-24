package com.modis.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;

public interface AscoltoRepo extends JpaRepository<Ascolto, Long>{
	long countByBranoMusicale(BranoMusicale branoMusicale);
}
