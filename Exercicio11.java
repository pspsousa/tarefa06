package tarefa06;
import java.util.Scanner;
public class Exercicio11 {
public static void main(String[] args) {

	//Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
	

	Scanner scanner = new Scanner(System.in);

     	System.out.print("Digite um valor inteiro: ");
     	int Valor = scanner.nextInt();

     	if (Valor <= 3) {
        System.out.println("O valor digitado é: " + Valor);
     	} else {
        System.out.println("O valor digitado é maior que três e não será apresentado.");
     }

     	scanner.close();
 }

}