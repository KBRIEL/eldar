package tarjetasEj1;

import java.time.LocalDate;

public class Visa  implements Itarjeta{

	@Override
	public double tasa() {

		return (LocalDate.now().getYear() %  100)/ LocalDate.now().getMonthValue();
		
	}

}
