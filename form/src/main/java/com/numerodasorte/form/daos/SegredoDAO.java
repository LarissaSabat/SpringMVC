package com.numerodasorte.form.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.numerodasorte.form.jogo.Numerosorte;

@Repository
public class SegredoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Numerosorte Numerosorte) {
		manager.persist(Numerosorte);
	}

}
