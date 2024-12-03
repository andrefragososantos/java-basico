package estruturaCondicional;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: " );
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		entrada.close();
	}

}
