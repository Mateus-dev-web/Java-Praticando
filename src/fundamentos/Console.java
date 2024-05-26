package fundamentos;

import java.util.Scanner;

public class Console {
  public static void main(String[] args) {
	System.out.print("Bom");
	System.out.print(" dia!!!\n");
	
	System.out.println("Bom");
	System.out.println("Dia!!!");
	
	System.out.printf("Megasena: %d %d %d %d %d %d %d\n",1,2,3,4,5,6,7);
	System.out.printf("Nome: %s\n", "João Paulo");
	System.out.printf("Salario: %.1f\n", 1154.2345);
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o seu nome: ");
    String nome =	entrada.nextLine();
    
    System.out.print("Digite o seu sobrenome: ");
    String sobrenome =	entrada.nextLine();
    
    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();
    
    System.out.println("\nNome : " + nome + " " + sobrenome + "\nIdade : " + idade);
	
	entrada.close();
  }
}
