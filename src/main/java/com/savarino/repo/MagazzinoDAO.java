package com.savarino.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Magazzino;

public interface MagazzinoDAO extends JpaRepository<Magazzino, Integer>{

}
