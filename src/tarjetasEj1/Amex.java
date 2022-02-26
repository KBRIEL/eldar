package tarjetasEj1;

import java.time.LocalDate;

public class Amex implements Itarjeta{

	@Override
	public double tasa() {
		return LocalDate.now().getMonthValue() * 0.1;
		
	}

}
