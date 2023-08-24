package com.example.DesignPatterns.ES1Adapter;

import java.util.Date;

public class Info {

	private String nome;
	private String cognome;
	private Date data;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getData(Date data) {
		return this.data = data;
	}

	public void Data(Date data) {
		this.data = data;
	}

}
