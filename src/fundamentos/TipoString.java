package fundamentos;

public class TipoString {
   public static void main(String[] args) {
	System.out.println("Olá pessoal".charAt(0));
	
	String s = "Boa tarde";
	s = s.toUpperCase();
	System.out.println(s.concat("!!!"));
	System.out.println(s + "!!!");
	System.out.println(s.startsWith("BOA"));
	System.out.println(s.length());
	System.out.println(s.toLowerCase().endsWith("tarde"));
	System.out.println(s.equals("Boa tarde"));
	System.out.println(s.equalsIgnoreCase("Boa tarde"));
	
	var nome = "Pedro";
	var sobreNome = "Santos";
	var idade = 33;
	var salario = 12345.987;
	
    System.out.printf("nome: %s \nsobrenome: %s \nidade: %d\nsalario: %.2f\n",nome,sobreNome,idade,salario);
    String formatada = String.format("\nnome: %s \nsobrenome: %s \nidade: %d\nsalario: %.2f",nome,sobreNome,idade,salario);
    System.out.println(formatada);
	
  }
}
