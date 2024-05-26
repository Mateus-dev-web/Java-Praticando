package fundamentos.operadores;

public class Carro {
   public  String modelo;
   public  String cor;
   protected int ano;
   private   double valor;
   
   
   public void status() {
	   System.out.println("Modelo: " + modelo);
	   System.out.println("Cor: " + cor);
	   System.out.println("Ano: " + ano);
	   System.out.println("Preço: "  + valor);
   }
   
   public double getValor() {
	 return this.valor;
   }
   
   public void setValor(double v) {
	   this.valor = v;
   }
}
