package estruturaSequencial;

import java.util.Scanner;

public class ExpressoesAritmeticas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 3 + 5;
		int subtracao = 10 - 7;
		int multiplicacao = 5 * 3;
		int divisao = 15 / 3;
		int modulo = 18 % 5;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(modulo);
		
		/*Precedência
		 * 
		 * 1º Lugar () O que está entre parentese.
		 * 2º Lugar * % /
		 * 3º Lugar + - 
		 * 
		 * Quando a precedência é a mesma você resolve a expressão da esquerda para a direita.
		 * 
		 * */
		
		int expressao1 = 2 * 6 / 3;
		int expressao2 = 3 + 2 * 4;
		int expressao3 = (3 + 2) * 4;
		int expressao4 = 60 / (3 + 2) * 4;
		int expressao5 = 60 / ((3 + 2) * 4);
		
		System.out.println("2 * 6 / 3 = " + expressao1);
		System.out.println("3 + 2 * 4 = " + expressao2);
		System.out.println("(3 + 2) * 4 = " + expressao3);
		System.out.println("60 / (3 + 2) * 4 = " + expressao4);
		System.out.println("60 / ((3 + 2 * 4) = " + expressao5);
		
		
		entrada.close();
	}

}
