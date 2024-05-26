package controle;
import java.util.Scanner;

public class DoWhile {
     public static void main(String[] args) {
    	 Scanner entrada = new Scanner(System.in);
	    String msg = "";
    	 do {
    		System.out.println("Você diz: "); 
    		msg = entrada.nextLine();
    	 }while(!"sair".equalsIgnoreCase(msg));
    	 
    	 entrada.close();
	}
}
