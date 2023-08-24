package com.example.DesignPatterns.ES1Adapter;

import java.time.LocalDate;

public class MyAdapterRunner {

	public static void main(String[] args) {

		Info info = new Info();
		info.setNome("Pippo");
		info.setCognome("Baudo");

		LocalDate dataDiNascita = LocalDate.of(2000, 4, 26);
		info.setDataDiNascita(java.sql.Date.valueOf(dataDiNascita));

		DataSource myAdapter = new MyAdapter(info);
		UserData userData = new UserData();
		userData.getData(myAdapter);

		System.out.println("Nome Completo: " + userData.nomeCompleto);
		System.out.println("Età: " + userData.eta);

	}

}
