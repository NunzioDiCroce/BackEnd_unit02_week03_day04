package com.example.DesignPatterns.ES1Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

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
//		Date dataDiNascita = info.getDataDiNascita();
//		Date today = new Date();
//		return (int) TimeUnit.MILLISECONDS.toDays(today.getTime() - dataDiNascita.getTime());

		Date dataDiNascita = info.getDataDiNascita();
		java.util.Date utilDate = new java.util.Date(dataDiNascita.getTime());
		LocalDate dataDiNascitaLocal = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate oggi = LocalDate.now();
		Period periodo = Period.between(dataDiNascitaLocal, oggi);
		return periodo.getYears();

	}

}
