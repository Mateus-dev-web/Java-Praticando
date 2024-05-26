package fundamentos;

public class AreaCircunFerencia {
   public static void main(String[] args){
	//Calculo da area da circunferencia
	double raio =  3.4;
	final double PI = 3.14159;
	double area = PI * raio * raio;
    System.out.println(area);
    
    raio = 10;
    area = PI * raio * raio;
    System.out.println("Área = " + area);
    
	
   }
}
