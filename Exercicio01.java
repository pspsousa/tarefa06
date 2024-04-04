package tarefa06;
import java.util.Scanner;
public class Exercicio01 {
public static void main(String[] args) {

		//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int Valor1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int Valor2 = scanner.nextInt();

		int Valor3 = Math.abs(Valor1 - Valor2);
		System.out.println("A diferença do maior pelo menor é: " + Valor3);

		scanner.close();   
	
	}
}