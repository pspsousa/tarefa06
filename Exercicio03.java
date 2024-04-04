package tarefa06;
import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {

	//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
	

    	Scanner scanner = new Scanner(System.in);
    	int TotalNotas = 0;
    	int QtdNotas = 4;

    
    	for (int i = 1; i <= QtdNotas; i++) {
        System.out.print("Digite a nota " + i + ": ");
        TotalNotas += scanner.nextDouble();
    	}

   
    	float Media = TotalNotas / QtdNotas;

    	if (Media >= 5) {
        System.out.println("O aluno foi aprovado: " + Media);
    	} else {
        System.out.println("O aluno não foi aprovado: " + Media);
    	}

		
	scanner.close();
}
}

