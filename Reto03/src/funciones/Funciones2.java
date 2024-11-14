package funciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funciones2 {

	public static void mediaDias(LocalDate fecha1, LocalDate fecha2) {
		LocalDate ld = fecha1;
		double media = 0;
		int i = 0;
		if (fecha1.isBefore(fecha2)) {
			for (i = 0; i < ChronoUnit.MONTHS.between(fecha1, fecha2); i++) {
				ld = fecha1;
				ld = ld.plusMonths(i);
				media += ld.lengthOfMonth();
				if (i == 0) {
					System.out.print(ld.lengthOfMonth());
				} else {
					System.out.print(" + " + ld.lengthOfMonth());
				}
			}
			System.out.print(" = " + media);
			System.out.println();
			System.out.println("Media = " + media + " / " + i + " = " + (media / i));
			String mes = ld.getMonth().toString().toLowerCase();
			String texto="";
			for (int j = 0; j < mes.length(); j++) {
				if (mes.substring(j, j + 1).compareTo("a")==0 || mes.substring(j, j + 1).compareTo("e")==0
						|| mes.substring(j, j + 1).compareTo("i")==0
						||mes.substring(j, j + 1).compareTo("o")==0 || mes.substring(j, j + 1).compareTo("u")==0) {
					texto=texto+"";
				}else {
					texto=texto+mes.substring(j, j+1);
				}
			}
			System.out.println(texto);
			
		}

	}
}
