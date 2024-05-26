package fundamentos.operadores;

public class Principal {
   public static void main(String[] args) {
	Carro obj = new Carro();
	obj.modelo = "Celta";
	obj.cor = "Preto";
	obj.ano = 1968;
	obj.setValor(2.777);
	obj.status();
   }
}
