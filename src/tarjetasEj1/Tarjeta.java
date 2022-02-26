package tarjetasEj1;

import java.time.LocalDate;

public class Tarjeta {
	
	private String marca;
	private String cardholder;
	private int numeroDeTarjeta;
	private Itarjeta tipoDeTarjeta;
	private LocalDate fechaDeVencimiento;
	
	public Tarjeta(int _numero_de_tarjeta, String _marca, String _cardHolder, Itarjeta _tipoDeTarjeta, LocalDate _fecha_de_vencimiento) {
		this.marca =_marca;
		this.cardholder=_cardHolder;
		this.numeroDeTarjeta=_numero_de_tarjeta;
		this.tipoDeTarjeta=_tipoDeTarjeta;
		this.fechaDeVencimiento=_fecha_de_vencimiento;
	}

	
	public double tasaDeOperacion() {
		return tipoDeTarjeta.tasa();
		
	}
	
	public String informacion() {
		
		return "tarjeta tipo: " + this.marca + ", " +" nombre: "+ this.cardholder+ ", " +"tarjeta numero: "+ this.numeroDeTarjeta+ ", " + " vencimiento: "+ this.fechaDeVencimiento; 
	}
	

	
	public LocalDate vencimiento() {
		return this.fechaDeVencimiento;
	}


	public String getMarca() {
		
		return this.marca;
	}
	
	public double importeAPagar(double costo) {
		return ((costo * this.tasaDeOperacion())/100) + costo;
	}
	
	

}
