package com.savarino.services;

import java.time.LocalDate;
import java.util.List;

import com.savarino.entities.Magazzino;
import com.savarino.entities.Prodotto;

public interface MagazzinoService {

	List<Prodotto>getProdotti();
	Prodotto getProdottoById(int id);
	Prodotto addProdotto(Prodotto p);
	Prodotto updateProdotto(Prodotto p);
	void deleteProdotto(Prodotto p);
	
	List<Magazzino>getMagazzino();
	Magazzino getMovimentoById(int id);
	List<Magazzino>getMovimentiByData(LocalDate d);
	List<Magazzino>getMovimentiByProdotto(Prodotto p);
	Magazzino caricaMagazzino(Prodotto p,int quantita);
	Magazzino scaricaMagazzino(Prodotto p,int quantita);
	Magazzino updateMagazzino(Magazzino m);
	Magazzino caricaMagazzino(Magazzino m);
	Magazzino scaricaMagazzino(Magazzino m);
	

	
}
