package com.modis.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modis.entities.Ascolto;
import com.modis.entities.BranoMusicale;
import com.modis.service.AscoltoService;
import com.modis.service.BranoMusicaleService;

@RestController
public class SpotiControllerRest {
	private BranoMusicaleService branoService;
	private AscoltoService ascoltoService;

	public SpotiControllerRest(BranoMusicaleService branoService, AscoltoService ascoltoService) {
		this.branoService = branoService;
		this.ascoltoService = ascoltoService;
	}

	@GetMapping("/brani/api")
	public ResponseEntity<List<BranoMusicale>> findBrani() {
		List<BranoMusicale> brani = branoService.findAll();
		System.err.println(brani);
		return new ResponseEntity<>(brani, HttpStatus.OK);
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
		ascoltoService.save(new Ascolto(LocalDateTime.now(), brano));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}