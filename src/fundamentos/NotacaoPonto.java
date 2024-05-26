package fundamentos;

public class NotacaoPonto {
 public static void main(String[] args) {
	
	 double a = 2.3;
	 System.out.println(a);
	 
	 String s = "Bom dia x";
	 System.out.println(s);
	 
	 s = s.replace("x", " Senhora");
	 s = s.concat("!!!");
	 System.out.println(s.toUpperCase());
	 
	 System.out.println("Mateus ".toLowerCase());
	 System.out.println("Mateus x".replace("x", "Araújo"));
	 
	 String y = "Bom dia x".replace("x","Gui");
	 System.out.println(y);
	 
   // Tipos primitivos não tem a notação ponto;
    }
}
