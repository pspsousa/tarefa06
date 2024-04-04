package tarefa06;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {

	//Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
	

  	Scanner scanner = new Scanner(System.in);
    	System.out.print("Digite um número inteiro: ");
    	int Numero = scanner.nextInt();

    	if (numero % 2 == 0) {
        System.out.println("O número " + Numero + " é par.");
    	} else {
        System.out.println("O número " + Numero + " é ímpar.");
    	}

    	scanner.close();
}
}