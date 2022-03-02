package com.api.service;

import java.time.LocalDate;

public class Nara  implements ITarjeta{
	
	private String marca = "Nara";
	

	@Override
	public double tasa(double importe) {
		
		return LocalDate.now().getDayOfMonth() * 0.5;
	}
	
	@Override
	public double importeAPagar(double costo) {
		return ((costo * this.tasa(costo))/100) + costo;
	}
	
	@Override
	public String marca() {	
		return this.marca;
	}

}
