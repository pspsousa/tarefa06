package tarefa06;
import java.util.Scanner;
public class Exercicio12 {
public static void main(String[] args) {

	//Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da mensagem de saudação o nome previamente informado.
	

    	Scanner scanner = new Scanner(System.in);
    
    	System.out.print("Digite o seu nome: ");
    	String Nome = scanner.nextLine();
    
    	System.out.print("Digite o seu sexo (M/F): ");
    	char Sexo = scanner.next().charAt(0);
    
    	if (Sexo == 'M' || sexo == 'm') {
        System.out.println("Ilmo Sr. " + Nome); 
    	} 
    	else if (Sexo == 'F' || sexo == 'f') 
    	{
        System.out.println("Ilma Sra. " + Nome);
    	} 
    	else 
    	{
        System.out.println("Sexo inválido.");
    	}
    
    	scanner.close();
	}
}