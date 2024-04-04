package tarefa06;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio06 {
public static void main(String[] args) {

	//Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.
	
        Scanner scanner = new Scanner(System.in);
        int[] Numeros = {0, 1, 2};
       
        
        for (int i = 0; i < 3; i++) {
        System.out.print("Digite o valor " + (i + 1) + ": ");
        Numeros[i] = scanner.nextInt();
        }
        Arrays.sort(Numeros); 
        
        System.out.println("Valores em ordem crescente: " + Numeros[0] + ", " + Numeros[1] + ", " + Numeros[2]);

        scanner.close();
    }
}
