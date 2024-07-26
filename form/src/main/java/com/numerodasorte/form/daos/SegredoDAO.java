package com.numerodasorte.form.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import com.numerodasorte.form.jogo.Numerosorte;

@Repository
@Transactional
public class SegredoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Numerosorte Numerosorte) {
		manager.persist(Numerosorte);
	}

}
