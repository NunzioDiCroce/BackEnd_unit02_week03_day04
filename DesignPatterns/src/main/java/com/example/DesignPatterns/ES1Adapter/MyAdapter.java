package com.example.DesignPatterns.ES1Adapter;

public class MyAdapter implements DataSource {

	private Info info;

	public MyAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
