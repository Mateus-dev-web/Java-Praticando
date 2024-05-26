package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
		
    	String s = new String("Texto");
    	s = s.toUpperCase();
// wrappers são a versão objeto dos tipos
// primitivos
    	System.out.println(s);
	}
}
