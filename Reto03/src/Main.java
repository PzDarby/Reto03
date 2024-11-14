import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

import util.Funciones;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1;
		LocalDate fecha2;
		do{
			fecha1= Funciones.dimeFecha("Introduce una fecha (dia/mes/año):", sc);
		    fecha2= Funciones.dimeFecha("Introduce una fecha (dia/mes/año):", sc);
		}while(!(fecha2.isBefore(fecha1)));
			
				
		if (fecha1.isEqual(fecha2) && ( || )) {
			
		}
		

	}

}
