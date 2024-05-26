package fundamentos;

public class ConversaoTiposPrimitivos {
   public static void main(String[] args) {
	
	   double a = 1; //implícita
	   System.out.println(a);
	   
	   
	   float b = (float) 1.0;//explícita (CAST)
	   System.out.println(b);
	   
	   int c = 4; //explícita (CAST)
	   byte d = (byte) c;
	   System.out.println(d);
	   
	 
	   double e = 1;
	   int j = (int) e;
	   System.out.println(j);
   }
}
