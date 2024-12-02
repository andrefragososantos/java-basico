package exercíciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		numero = entrada.nextInt();
		System.out.print("Digite as horas trabalhadas pelo funcionário: ");
		horasTrabalhadas = entrada.nextInt();
		System.out.print("Digite o valor da hora do funcionário: ");
		valorHora = entrada.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		entrada.close();
	}

}
