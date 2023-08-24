package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Generale extends Ufficiale {

	public Generale() {
		super(5000);
	}

	@Override
	public void controlloImporto(int importo) {
		if (importo <= stipendio) {
			System.out.println("Il Generale percepisce lo stipendio considerato");
		} else if (nextUfficiale != null) {
			nextUfficiale.controlloImporto(importo);
		} else {
			System.out.println("Nessun Ufficiale percepisce lo stipendio considerato");
		}
	}

}
