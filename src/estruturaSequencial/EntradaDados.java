package estruturaSequencial;

import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char sexo;
		
		x = entrada.next();
		y = entrada.nextInt();
		z = entrada.nextDouble();
		sexo = entrada.next().charAt(0);
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(sexo);
		
		System.out.println();
		System.out.println();
		
		
		// Para ler um texto até a quebra de linha (para escrever no scanner uma frase inteira)
		
		/* Problema
		 * 
		 *  Quando você usa um comendo de leitura do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente"
		 *  na entrada padrão. Se você fizer um nextLine aquela quebra de linha pendente será absorvida pelo nextLine().
		 * 
		 * Solução
		 * 
		 * Faça um nextLine() extra antes de fazer o nextLine do seu interesse.
		 */
		
		
		
		String s1, s2, s3;
		
		// NextLine() EXTRA
		entrada.nextLine();
		s1 = entrada.nextLine();
		s2 = entrada.nextLine();
		s3 = entrada.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		entrada.close();
	}

}
