package com.modis.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brani")
public class SpotiControllerRest {
	private BranoMusicaleService branoService;
	private AscoltoService ascoltoService;
	

	public SpotiControllerRest(BranoMusicaleService branoService, AscoltoService ascoltoService) {
		this.branoService = branoService;
		this.ascoltoService = ascoltoService;
	}

	@GetMapping("/lista")
	public ResponseEntity<List<BranoMusicale>> findBrani(){
		List<BranoMusicale> brani = branoService.findAll();
		return new ResponseEntity<>(brani, HttpStatus.OK);
	}
	
	@PostMapping("/aggiunta")
	public ResponseEntity<BranoMusicale>> saveBrano(@RequestBody BranoMusicale brano){
		BranoMusicale branoX= branoService.save(brano);
		return new ResponseEntity<BranoMusicale>(HttpStatus.CREATED);
	}
	
	@PostMapping("/ascolto/{id}")
	 ResponseEntity<Ascolto>> saveAscolto(@PathVariable ("id") long id){
		ascoltoService.save(new Ascolto(LocalDate().now,branoService.findById(id)));
		return new ResponseEntity<Ascolto>(HttpStatus.CREATED);
	}
	
	

}
