package com.fepa.servlet;

public class Coleira {
	
	String id;
	int temperatura;
	int umidade;

	public Coleira() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		//TODO Alterar para JSON
//		return "Coleira [id=" + id + ", temperatura=" + temperatura + ", umidade=" + umidade + "]";
		return "{\"Coleira\": { \"id\": \""+id+"\", \"temperature\": "+ temperatura+", \"humidity\": "+umidade+"}}";
	}

	public int getUmidade() {
		return umidade;
	}

	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}

	
	
	
	
	

}
