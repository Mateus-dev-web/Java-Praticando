package classe;

public class Jantar {
  public static void main(String[] args) {
	 Comida c1 = new Comida("Feijão",0.200);
	 Pessoa p1 = new Pessoa("Lucas", 75.0);
	 p1.Comer(c1);
	 System.out.println("Nome: " + p1.nome + "\n"  + p1.peso + " KG");
	 
	 Comida c2 = new Comida("Arroz",0.100);
	 Pessoa p2 = new Pessoa("João", 80.0);
	 p2.Comer(c2);
	 System.out.println("Nome: " + p2.nome + "\n"  + p2.peso + " KG");
 }
}