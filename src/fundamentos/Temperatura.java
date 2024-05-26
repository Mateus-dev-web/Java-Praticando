package fundamentos;

public class Temperatura {
  public static void main(String[] args) {
	// (ºF - 32) x 5 / 9 = ºC
	  
	  final double fator = 5 / 9.0;
	  final double x = 32;
	  double farehaint = 86;
	  
	  
	  double tempo = (farehaint - x) * fator;
	  System.out.println("O resultado é " +tempo+ "ºC.");
   }
}
