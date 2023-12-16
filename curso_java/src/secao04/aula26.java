package secao04;

import java.util.Scanner;

public class aula26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		String x, y, z;
		
		a = sc.nextInt();
		
		sc.nextLine(); // Tem que ter o nextLine para consumir a linha e pegar todas as informações
		
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();

	}

}
