import java.util.*;
public class Exercicio3_2 {

	public static void main(String[] args) {
		// 1 - variaveis
		int numero;
		long fatorial = 1;
		int cont = 1;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite o numero para o calculo do fatorial: ");
		numero = leia.nextInt();
		
		while (cont <= numero) {
			fatorial = fatorial * cont;
			cont ++;
		}
		
		System.out.println("Valor do Fatorial: " + fatorial);

	}

}
