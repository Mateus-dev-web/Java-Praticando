package classe;

public class Pessoa {
  String nome;
  double peso;
  
  Pessoa(String nome, double peso){
	  this.nome = nome;
	  this.peso = peso;
  }
   void Comer(Comida comida) {
	if(comida != null) {
		this.peso += comida.peso;
	}else {
		System.out.println("Erro objeto com valor null\nerro runtume");
	}
  }
}
