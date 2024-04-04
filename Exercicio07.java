package tarefa06;
import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args) {

	//Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.
	

	Scanner scanner = new Scanner(System.in);

	int[] Numeros = {1,2,3,4};


	for (int i = 0; i < Numeros.length; i++) {
	System.out.print("Digite o número " + (i + 1) + ": ");
	Numeros[i] = input.nextInt();
	}

	System.out.println("Números divisíveis por 2 e 3:");
	for (int Numero : Numeros) 
	{
	if (Numero % 2 == 0 && Numero % 3 == 0) {
	System.out.println(Numero);
	}
	}
	scanner.close();
	}
}
