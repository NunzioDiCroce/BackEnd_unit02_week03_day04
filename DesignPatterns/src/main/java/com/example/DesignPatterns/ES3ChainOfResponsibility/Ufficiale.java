package com.example.DesignPatterns.ES3ChainOfResponsibility;

public abstract class Ufficiale {

	protected Ufficiale nextUfficiale;
	protected int stipendio;

	public Ufficiale(int stipendio) {
		this.stipendio = stipendio;
	}

	public void setNextUfficiale(Ufficiale nextUfficiale) {
		this.nextUfficiale = nextUfficiale;
	}

	public abstract void controlloImporto(int importo);
}
