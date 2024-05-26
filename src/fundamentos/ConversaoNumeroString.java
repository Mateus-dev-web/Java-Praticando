package fundamentos;

public class ConversaoNumeroString {
   public static void main(String[] args) {
	Integer num1 = 10000;
	System.out.println(num1.toString().replace("0","5"));
	
	int num = 1;
	System.out.println(Integer.toString(num).length());
	

   }
}
