package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Maggiore extends Ufficiale {

	public Maggiore() {
		super(2000);
	}

	@Override
	public void controlloImporto(int importo) {
		if (importo <= stipendio) {
			System.out.println("Il Maggiore percepisce lo stipendio considerato");
		} else if (nextUfficiale != null) {
			nextUfficiale.controlloImporto(importo);
		} else {
			System.out.println("Nessun Ufficiale percepisce lo stipendio considerato");
		}
	}

}
