package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Magazzino;
import com.savarino.entities.Prodotto;
import com.savarino.services.MagazzinoService;

@RestController
@RequestMapping("api")
public class MagazzinoRest {
	@Autowired
	MagazzinoService service;
	
	@GetMapping("prodotti")
	public List<Prodotto>getProdotti(){
		return service.getProdotti();
	}
	@GetMapping("movimenti")
	public List<Magazzino>getMovimenti(){
		return service.getMagazzino();
	}


	
}
