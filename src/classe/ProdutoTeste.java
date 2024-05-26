package classe;

public class ProdutoTeste {
	
  public static void main(String[] args) {
	  
	Produto p1 = new Produto("Notebook",4356.89);
	Produto.desconto = 0.29;
	
	var p2 = new Produto("Caneta preta", 12.56);
	
	
  
	double prod1 = p1.precoDesconto(0);
	double prod2 = p2.precoDesconto(0.1);
	double mediaCarinho = (prod1 + prod2) / 2;
	
	System.out.println(p1.nome + " Preço = R$" + p1.preco);
	System.out.println(p2.nome + " preço = R$" + p2.preco);
	System.out.printf("Media carinho = R$%.2f.",mediaCarinho);
   }
}
