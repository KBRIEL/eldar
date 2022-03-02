package com.api.service;

import java.time.LocalDate;

public class Visa implements ITarjeta {
	
	private String marca="Visa";
	

	@Override
	public double tasa(double importe) {
		
		return (LocalDate.now().getYear() %  100)/ LocalDate.now().getMonthValue();
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
