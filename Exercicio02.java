package tarefa06;
import java.util.Scanner;
public class Exercicio02 {
public static void main(String[] args) {

	//Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.
	

	Scanner scanner = new Scanner(System.in);
    
	System.out.print("Digite um valor (positivo ou negativo): ");

	int Valor1 = scanner.nextInt();
	int ValorPositivo = Valor1 < 0 ? numero * -1 : Valor1;


	System.out.println("O módulo do número fornecido é: " + ValorPositivo);
	
	
	scanner.close();
	
	}

}
