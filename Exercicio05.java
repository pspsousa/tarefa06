package tarefa06;
import java.util.Scanner;
public class Exercicio05 {
public static void main(String[] args) {

	//Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o referido cálculo. Lembre-se de que a variável A deve ser diferente de zero.
		

    	Scanner scanner = new Scanner(System.in);
    
    	float a, b, c;
    	double delta, raiz1, raiz2;

    	System.out.println("Equação do 2o grau: ax² + bx + c = 0");
    	System.out.print("Entre com o valor de 'a' (diferente de zero): ");
    	a = scanner.nextFloat();
    	if(a == 0) {
        System.out.println("O valor de deve ser diferente de zero");
        return;
   	}
   	System.out.print("Entre com o valor de b: ");
    	b = scanner.nextFloat();
    
    	System.out.print("Entre com o valor de c: ");
    	c = scanner.nextFloat();

    	delta = Math.pow(b, 2) - (4 * a * c);

    	if(delta < 0) {
        System.out.println("Não existem raízes reais, o delta é negativo.");
    	} else {
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("As raízes da equação são: %.2f e %.2f", raiz1, raiz2);
        
        scanner.close();
    }
}
}
