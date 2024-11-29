package exercíciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		final double PI = 3.14159;
		double raio, area;
		
		
		System.out.print("Digite o valor do raio do círculo: ");
		raio = entrada.nextDouble();
		
		area = PI * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f", area);
		
		entrada.close();

	}

}
