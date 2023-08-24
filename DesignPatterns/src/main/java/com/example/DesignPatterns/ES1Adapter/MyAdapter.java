package com.example.DesignPatterns.ES1Adapter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MyAdapter implements DataSource {

	private Info info;

	public MyAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		// TODO Auto-generated method stub
		Date dataDiNascita = info.getDataDiNascita();
		Date today = new Date();
		return (int) TimeUnit.MILLISECONDS.toDays(today.getTime() - dataDiNascita.getTime());
	}

}
