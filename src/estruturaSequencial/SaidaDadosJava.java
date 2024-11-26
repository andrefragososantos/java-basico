package estruturaSequencial;

import java.util.Locale;

public class SaidaDadosJava {
	public static void main(String[] args) {
		
		//Imprimir na tela com quebra de linha (Println)
		System.out.println("Olá mundo!");
		
		//Imprimir na tela sem quebra de linha (Print)
		System.out.print("Bom dia ");
		
		int y = 32;
		System.out.println(y);
		
		//Imprimir na tela controlando a quantidade de casas decimais (Printf)
		
		double x = 10.35784;
		// Com quebra de linha (%n)
		System.out.printf("%.2f%n", x);
		
		// Sem quebra de linha
		System.out.printf("%.4f", x);
		
		System.out.println();
		
		//Uso da classe Locale para mudar o sistema de medidas de "," para "."
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f", x);
		
		System.out.println();
		
		//Concatenação
		
		System.out.println("Resultado = " + x + " metros");
		
	    // Concatenar com printf com vários elementos
		
		/* %s - String
		 * %f - ponto flutuante
		 * %d - inteiros
		 * %n - quebra de linha  
		 */
		
		System.out.printf("Resultado %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
	}

}
