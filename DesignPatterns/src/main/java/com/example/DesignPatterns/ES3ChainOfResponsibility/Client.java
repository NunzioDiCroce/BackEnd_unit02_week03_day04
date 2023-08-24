package com.example.DesignPatterns.ES3ChainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		Capitano capitano = new Capitano();
		Maggiore maggiore = new Maggiore();
		Tenente tenente = new Tenente();
		Colonnello colonnello = new Colonnello();
		Generale generale = new Generale();

		capitano.setNextUfficiale(maggiore);
		maggiore.setNextUfficiale(tenente);
		tenente.setNextUfficiale(colonnello);
		colonnello.setNextUfficiale(generale);

		int importoVerifica = 2000;

		capitano.controlloImporto(importoVerifica);
	}

}
