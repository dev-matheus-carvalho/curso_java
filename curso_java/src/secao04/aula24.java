package secao04;

public class aula24 {

	public static void main(String[] args) {
		
		//============================== Exemplo 1 =========================================
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println("=========================Exercício 1==========================");
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);

		//============================== Exemplo 2 =========================================
		
		int m;
		double n;
				
		m = 5;
		n = 2 * m;
				
		System.out.println("=========================Exercício 2==========================");
		System.out.println("O valor de m é: " + m);
		System.out.println("O valor de n é: " + n);
		
		//============================== Exemplo 3 =========================================
		
		// Calcular a área do trapézio
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("=========================Exercício 3==========================");
		System.out.println("A área do trapézio é de: " + area);
		
		//============================== Exemplo 4 =========================================
		
		// Casting
		
		int valor1, valor2;
		double resultado;
		
		valor1 = 5;
		valor2 = 2;
		
		resultado = (double) valor1 / valor2;
		
		System.out.println("=========================Exercício 4==========================");
		System.out.println("O resultado é: " + resultado);
		
		//============================== Exemplo 5 =========================================
		
		// Casting
		
		double valor3;
		int valor4;
		
		valor3 = 5.3;
		valor4 = (int) valor3; // Aqui perde a informação
		
		
		System.out.println("=========================Exercício 5==========================");
		System.out.println("O valor de valor4 é de: " + valor4);

				
	}

}
