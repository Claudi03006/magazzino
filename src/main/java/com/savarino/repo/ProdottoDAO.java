package com.savarino.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Prodotto;

public interface ProdottoDAO extends JpaRepository<Prodotto, Integer>{
	

}
