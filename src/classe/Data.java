package classe;

public class Data {
  
	 int dia;
	 int mes;
	 int ano;
	 
  Data(int dia, int mes, int ano) {
	 
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	  
  }
	 
  Data(){
	  this(1,1,1970);
  }
	   	
  public String obterDataFormatada(){
	  final String formato = "%d/%d/%d";
	  return String.format(formato, this.dia, this.mes,this.ano);
  }

  public void imprimirDataFormatada() {
	  System.out.println(this.obterDataFormatada());
  }
}
