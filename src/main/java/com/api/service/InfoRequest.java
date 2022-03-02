package com.api.service;

public class InfoRequest {
	
	public String marca;
	public double importe;
	public InfoRequest(String marca, double importe) {
	
		this.marca = marca;
		this.importe = importe;
	}
	
	
	public String marca() {	
		return this.marca;
	}
	public boolean a() {
		return this.marca == "visa";
	}

}
