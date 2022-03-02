package com.api.service;

import java.time.LocalDate;

public class Amex  implements ITarjeta{
	private String marca = "Amex";
	

	@Override
	public double tasa(double importe) {
		
		return LocalDate.now().getMonthValue() * 0.1;
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
