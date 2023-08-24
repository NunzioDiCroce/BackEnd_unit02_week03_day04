package com.example.DesignPatterns.ES1Adapter;

public class MyAdapterRunner {

	public static void main(String[] args) {

		Info info = new Info();
		info.setNome("Pippo");
		info.setCognome("Baudo");

		DataSource myAdapter = new MyAdapter(info);
		UserData userData = new UserData();
		userData.getData(myAdapter);

		System.out.println("Nome Completo: " + userData.nomeCompleto);
		System.out.println("Età: " + userData.eta);

	}

}
