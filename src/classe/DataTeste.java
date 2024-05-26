package classe;

public class DataTeste {
	
  public static void main(String[] args) {
	Data d1 = new Data();
	d1.ano = 2021;
	
	var d2 = new Data(17,8,1999);
	
	
	String dataFormatada1 = d1.obterDataFormatada();
	String dataFormatada2 = d2.obterDataFormatada();
	
	d1.imprimirDataFormatada();
	System.out.println(dataFormatada1);
	System.out.println(dataFormatada2);
  }
}
