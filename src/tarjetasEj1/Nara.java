package tarjetasEj1;

import java.time.LocalDate;

public class Nara implements Itarjeta{
	

	@Override
	public double tasa() {
		return LocalDate.now().getDayOfMonth() * 0.5;
		
	}

}
