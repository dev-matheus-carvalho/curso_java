package secao04;

public class aula27 {

	public static void main(String[] args) {
		
		//==================================== Radiciação =============================
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("================= Radiciação ======================\n");
		
		System.out.println("A raíz quadrada de " + x + " = " + A);
		System.out.println("A raíz quadrada de " + y + " = " + B);
		System.out.println("A raíz quadrada de 25 " + " = " + C);
		
		
		//==================================== Potenciação =============================
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println("\n================= Potenciação ======================\n");
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a 2.0"  + " = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		
		//==================================== Módulo =================================
		
		A = Math.abs(x);
		B = Math.abs(y);
		C = Math.abs(z);
		
		System.out.println("\n=================== Módulo ========================\n");
		
		System.out.println("O módulo de " + x + " = " + A);
		System.out.println("O módulo de " + y + " = " + B);
		System.out.println("O módulo de " + z + " = " + C);

	}

}
