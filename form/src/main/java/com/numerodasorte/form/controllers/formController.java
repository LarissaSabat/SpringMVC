package com.numerodasorte.form.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.numerodasorte.form.daos.SegredoDAO;
import com.numerodasorte.form.jogo.Numerosorte;

@Controller
public class formController {
	
	@Autowired
	private SegredoDAO segredoDao;

	@RequestMapping("/segredo/form")
	public String form() {
		return "segredo/form";
	}
	
	@RequestMapping ("/segredo")
	public String grava(Numerosorte Numerosorte ) {
		
		System.out.println (Numerosorte);
		segredoDao.gravar(Numerosorte);
		return "segredo/adivinhei";
	}
}
