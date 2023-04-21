package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("movimenti")
	public Magazzino addMovimento(@RequestBody Magazzino m) {
		return service.caricaMagazzino(m);
	}
	
	@PostMapping("prodotti")
	public Prodotto addProdotto(@RequestBody Prodotto p) {
		return service.addProdotto(p);
	}
	
	@PostMapping("listaprodotti")
	public void addListaProdotto(@RequestBody List<Prodotto> lista) {
		
		for (Prodotto prodotto : lista) {
			service.addProdotto(prodotto);
		}
		
	}
}
