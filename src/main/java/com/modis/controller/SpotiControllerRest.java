package com.modis.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;
import com.modis.service.AscoltoService;
import com.modis.service.BranoMusicaleService;
import com.modis.service.BranoNumeroAscolti;

@RestController
@CrossOrigin
public class SpotiControllerRest {
	private BranoMusicaleService branoService;
	private AscoltoService ascoltoService;

	public SpotiControllerRest(BranoMusicaleService branoService, AscoltoService ascoltoService) {
		super();
		this.branoService = branoService;
		this.ascoltoService = ascoltoService;
	}

	@GetMapping("/brani/ascolti")
	public ResponseEntity<List<BranoNumeroAscolti>> findBrani() {
		List<BranoMusicale> brani = branoService.findAll();
		List<BranoNumeroAscolti> braniX = new ArrayList<BranoNumeroAscolti>();
		brani.forEach(brano -> braniX.add(new BranoNumeroAscolti(brano)));
		return new ResponseEntity<>(braniX, HttpStatus.OK);
	}

	@PostMapping("/brani/api")
	public ResponseEntity<?> saveBrano(@RequestBody BranoMusicale brano) {
		branoService.save(brano);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/brani/api/ascolto/{id}")
	public ResponseEntity<?> saveAscolto(@PathVariable("id") long id) {
		BranoMusicale brano = new BranoMusicale();
		brano.setId(id);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Ascolto ascolto = new Ascolto();
		ascolto.setData(timestamp);
		ascolto.setBranoMusicale(brano);
		ascoltoService.save(ascolto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
