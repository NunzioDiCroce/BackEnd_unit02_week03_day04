package com.example.DesignPatterns.ES1Adapter;

import javax.sql.DataSource;

public class UserData {

	private String NomeCompleto;
	private int eta;

	public void getData(DataSource ds) {

		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();

	}

}
