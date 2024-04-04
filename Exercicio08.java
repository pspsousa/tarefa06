package tarefa06;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {

	//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.
	
	
    	Scanner scanner = new Scanner(System.in);

    	int NumMaior = Integer.MIN_VALUE;
   	int NumMenor = Integer.MAX_VALUE;
    	int Numero;

    	for (int i = 0; i < 5; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
        Numero = scanner.nextInt();

        if (Numero > NumMaior) {
            NumMaior = Numero;
        }
        if (numero < NumMenor) {
            NumMenor = Numero;
        }
    	}

    	System.out.println("O maior número é: " + NumMaior);
    	System.out.println("O menor número é: " + NumMenor);

    	scanner.close();
	}
}
