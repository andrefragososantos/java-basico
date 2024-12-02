package exercíciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		
		/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
           mostre:
           a) a área do triângulo retângulo que tem A por base e C por altura.
           b) a área do círculo de raio C. (pi = 3.14159)
           c) a área do trapézio que tem A e B por bases e C por altura.
           d) a área do quadrado que tem lado B.
           e) a área do retângulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		final double PI = 3.14159;
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.print("Informe o valor de A: ");
		a = entrada.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = entrada.nextDouble();
		System.out.print("Informe o valor de C: ");
		c = entrada.nextDouble();
		
		triangulo = a * c / 2;
		circulo = PI * Math.pow(c, 2);
		trapezio = (a + b) * c / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.println();
		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
		
		entrada.close();
	}

}
