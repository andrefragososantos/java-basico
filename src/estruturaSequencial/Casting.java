package estruturaSequencial;

public class Casting {
	
	public static void main(String[] args) {
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		// Casting é a conversão explícita dos valores da variável
		resultado = (double) a / b;
		
		System.out.println(resultado);
		
		double c;
		int d;
		
		c = 5.0;
		d = (int) c;
		
		System.out.println(d);
		
	}

}
