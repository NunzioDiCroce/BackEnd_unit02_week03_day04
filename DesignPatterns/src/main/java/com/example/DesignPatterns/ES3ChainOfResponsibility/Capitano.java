package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Capitano extends Ufficiale {

	public Capitano() {
		super(1000);
	}

	@Override
	public void controlloImporto(int importo) {
		if (importo <= stipendio) {
			System.out.println("Il Capitano percepisce lo stipendio considerato");
		} else if (nextUfficiale != null) {
			nextUfficiale.controlloImporto(importo);
		} else {
			System.out.println("Nessun Ufficiale percepisce lo stipendio considerato");
		}
	}

}
