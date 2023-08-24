package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Colonnello extends Ufficiale {

	public Colonnello() {
		super(4000);
	}

	@Override
	public void controlloImporto(int importo) {
		if (importo <= stipendio) {
			System.out.println("Il Colonnello percepisce lo stipendio considerato");
		} else if (nextUfficiale != null) {
			nextUfficiale.controlloImporto(importo);
		} else {
			System.out.println("Nessun Ufficiale percepisce lo stipendio considerato");
		}
	}

}
