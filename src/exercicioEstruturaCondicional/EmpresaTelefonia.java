package exercicioEstruturaCondicional;

import java.util.Scanner;

public class EmpresaTelefonia {
	
	public static void main(String[] args) {
		
		/* Uma operadora de telefonia cobra R$50,00 por uma plano básico que dá direito a 100 minutos de telefone. 
		 * Cada minuto que exceder a franquia de 100 minutos custa R$2,00. Fazer um programa que leia a quantidade de minutos
		 * que uma pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de minutos consumidos esse mês: ");
		int minutos = entrada.nextInt();
		
		if (minutos > 100) {
			int excedente = (minutos - 100) * 2;
			double valorConta = 50 + excedente;
			System.out.printf("O valor a ser pago esse mês é R$ %.2f.", valorConta);
		} else {
			System.out.println("O valor da conta esse mês é R$ 50,00.");
		}
		
		
		entrada.close();
	}

}
