package controle;

import java.util.Scanner;

public class If {
  public static void main(String[] args) {
	
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println("Informe a média: ");
	  String m = entrada.nextLine().replace(",", ".");
	  double media = Double.parseDouble(m);
	  
	  if(media <= 10 && media >= 7.0) {
		  System.out.println("Aprovado");
		  System.out.println("Parabéns");
	  }else if(media <= 5.9){
		  System.out.println("Reprovado");
	  }else if(media >= 6.5 && media <=6.0) {
		  System.out.println("Recuperação");
	  }else {
		  System.out.println("Digite um número entre 0.0 e 10.0");
	  }
	  entrada.close();
   }
}
