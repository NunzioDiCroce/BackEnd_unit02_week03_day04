package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Tenente extends Ufficiale {

	public Tenente() {
		super(3000);
	}

	@Override
	public void controlloImporto(int importo) {
		if (importo <= stipendio) {
			System.out.println("Il Tenente percepisce lo stipendio considerato");
		} else if (nextUfficiale != null) {
			nextUfficiale.controlloImporto(importo);
		} else {
			System.out.println("Nessun Ufficiale percepisce lo stipendio considerato");
		}
	}

}
