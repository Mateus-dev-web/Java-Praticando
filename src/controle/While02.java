package controle;
import java.util.Scanner;
public class While02 {
    public static void main(String[] args) {
    	
	Scanner entrada = new Scanner(System.in);
	
	String msg = "";
	
	while(!"sair".equalsIgnoreCase(msg)) {
		System.out.print("Você diz: ");
		msg = entrada.nextLine();
	}
	
	entrada.close();
	}
}
