package exercicioEstruturaCondicional;

import java.util.Scanner;

public class DuracaoJogo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Informe a hora em que o jogo começou: ");
		horaInicial = entrada.nextInt();
		System.out.print("Informe a hora em que o jogo acabou: ");
		horaFinal = entrada.nextInt();
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s).");
		
		entrada.close();
	}

}