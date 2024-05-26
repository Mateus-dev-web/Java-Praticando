package fundamentos;

import java.util.Scanner;

public class Wrapper {
   public static void main(String[] args) {
//byte
	   Scanner entrada = new Scanner(System.in);
	   Byte b = 100;
	   Short s = 1000;
	   System.out.println("Digite um número");
       Integer i = Integer.parseInt(entrada.next());
	   Long l = 100000L;
	   Boolean bo = Boolean.parseBoolean("true");
	   System.out.println(bo.toString().toUpperCase());
	   System.out.println(l / 3);
	   System.out.println(b.byteValue());
	   System.out.println(s.toString());
	   System.out.println(i);
	   entrada.close();
    }
}
