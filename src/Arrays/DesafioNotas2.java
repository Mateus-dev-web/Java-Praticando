package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class DesafioNotas2 {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantantos Alunos?");
	int quantAluno = entrada.nextInt();
	
	System.out.println("Quantas Notas por aluno?");
	int quantNotas = entrada.nextInt();
	
	double[][] quantTotal = new double[quantAluno][quantNotas];
	
	double total = 0;
	for(int a = 0; a < quantTotal.length; a++) {
		for(int n = 0; n < quantTotal[a].length; n++) {
			System.out.printf("informe a nota %d do Aluno %d:", (n+1) , (a+1));
		   quantTotal[a][n] = entrada.nextDouble();
		   total += quantTotal[a][n];
		}
	}
	double media = total  / (quantAluno * quantNotas);
	System.out.println("Media turma: " + media);
	
    for(double[] notasAluno: quantTotal) {
    	System.out.println(Arrays.toString(notasAluno));
    }
	entrada.close();
  }
}
