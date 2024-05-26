package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
		//Trabalho na terça (v ou f)
    	//Trabalho na quinta(v ou f)
    	
    	boolean trabalho1 = true;
    	boolean trabalho2 = true;
    	boolean tv50 = trabalho1 && trabalho2;
    	boolean tv30 = trabalho1 || trabalho2;
    	boolean tomarSorvete = trabalho1 ^ trabalho2;
    	boolean saudavel = !tomarSorvete;
    	
    	System.out.println("Compra tv 50 ?" + tv50);
    	System.out.println("Compra tv 30 ?" + tv30);
    	System.out.println("Tomar sorvete?" + tomarSorvete);
    	System.out.println("Mais saudavel"+ saudavel);
	}
}
