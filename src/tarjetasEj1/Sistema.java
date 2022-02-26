package tarjetasEj1;

import java.time.LocalDate;

public class Sistema {
	
	
	public String informacion(Tarjeta tarjeta) {
		return tarjeta.informacion();
	}
	
	private boolean validar(Tarjeta tarjeta,double costo) {
		
		return tarjeta.importeAPagar(costo)>1000;
	}
	
	public String operacionValida(Tarjeta tarjeta,double costo) {
		 String validacion="";
		if ( this.validar( tarjeta, costo)) {
			validacion ="operacion valida";
		}else {
			validacion ="operacion invalida";
		}
		
		return validacion;
	}
	
	public String tarjetaOperante(Tarjeta tarjeta) {
		String esOperante="";
		if ( tarjeta.vencimiento().isAfter( LocalDate.now()) ){
			esOperante ="la tarjeta es operante";
		}else {
			esOperante ="la tarjeta esta deshabilitada";
		}
		
		return esOperante;
		
	}
	
	public String compararTarjetas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
		String sonIguales="";
		
		if( tarjeta1.getMarca() ==tarjeta2.getMarca()) {
			sonIguales= "son la misma marca de tarjeta";
		}else {
			sonIguales= "son diferentes marcas de tarjetas";
		}
		return sonIguales;
	}
	
	public String informeDetasaEImporte(Tarjeta tarjeta) {
//		
		return "tasa: "+tarjeta.tasaDeOperacion()+ " " +"importe:"+ tarjeta.importeAPagar(1000)+ " "+"tipo de tarjeta: "+ tarjeta.getMarca();
	}
	
	

	public static void main(String[] args) {
		
		Itarjeta tipoVisa =new Visa();
		Itarjeta tipoAmex = new Amex();
		
		Tarjeta visa= new Tarjeta(1, "Visa", "Raul Padovani", tipoVisa, LocalDate.of(2023,01,01));
		Tarjeta amex= new Tarjeta(1, "Amex", "Juan Simon", tipoAmex, LocalDate.of(2021,01,01));
		Sistema sistema= new Sistema();
		
		System.out.println(sistema.informacion(visa));
		System.out.println(sistema.operacionValida(visa, 1100));
		System.out.println(sistema.operacionValida(amex, 100));
		System.out.println(sistema.tarjetaOperante(visa));
		System.out.println(sistema.tarjetaOperante(amex));
		System.out.println(sistema.compararTarjetas(visa, visa));
		System.out.println(sistema.compararTarjetas(visa, amex));
		System.out.println(sistema.informeDetasaEImporte(visa));

	}

}
