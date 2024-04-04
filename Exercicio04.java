package tarefa06;
import java.util.Scanner;
public class Exercicio04 {
public static void main(String[] args) {

	//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.
	
	
	Scanner scanner = new Scanner(System.in);

	int TotalNotas = 0;
	int QtdNotas = 4;

	for (int i = 1; i <=QtdNotas; i++) {
	System.out.println("Digite a nota" + i + ": ");
	TotalNotas += scanner.nextInt();
	}
	int Media = TotalNotas/QtdNotas;

	if(Media >= 7) {
	System.out.println("O aluno foi aprovado: " + Media);
	}
	else
	{
	System.out.println("Digite a nota do exame: ");
	int Exame = scanner.nextInt();
	int Media2 = (Media + Exame)/2;


	if(Media2 >= 5) {
	System.out.println("O aluno foi aprovado no exame: " + Media2);
	}
	else
	
	{
	System.out.println("O aluno não foi aprovado: " + Media2);

	
	scanner.close();	
	}
   }
  }
}



