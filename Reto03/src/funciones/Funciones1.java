package funciones;

public class Funciones1 {
	public static void nomPequeño(String nombre, int dmeses) {
		int lennombre;
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
			for (int i = 0; i < dmeses+1 ; i++) {
				lennombre = nombre.length()*i;
			if(lennombre<min) {
			min=lennombre;
			}
				
			}
			System.out.println(min);
			}
	
		}
	public static void nomAlfabetico(String nombre, int dmeses) {
		
	}
	
