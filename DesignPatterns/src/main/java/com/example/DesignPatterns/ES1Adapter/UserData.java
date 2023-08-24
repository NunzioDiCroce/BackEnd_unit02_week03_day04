package com.example.DesignPatterns.ES1Adapter;

public class UserData {

	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {

		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();

	}

}
