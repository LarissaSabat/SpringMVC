package com.numerodasorte.form.jogo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Numerosorte {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private int numeroDaSorte;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroDaSorte() {
		return numeroDaSorte;
	}
	public void setNumeroDaSorte(int numeroDaSorte) {
		this.numeroDaSorte = numeroDaSorte;
	}
	
	@Override
	public String toString() {
		return "Numerosorte [nome=" + nome +",numeroDaSorte=" =numeroDaSorte];
	}

}
