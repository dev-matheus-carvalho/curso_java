package secao04;

import java.util.Locale;
import java.util.Scanner;

public class aula25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.printf("Digite seu nome: ");
		nome = sc.next();
		
		// Ler um número inteiro
		
		int idade;
		
		System.out.printf("\nDigite sua idade: ");
		idade = sc.nextInt();
		
		// Ler número flutuante
		
		double salario;
		
		System.out.printf("\nDigite quanto você ganha mensalmente: ");
		salario = sc.nextDouble();
		Locale.setDefault(Locale.US);
		
		// Ler um caracter
		
		char sexo;
		
		System.out.printf("\nDigite seu gênero: 'M' (Masculino) ou 'F' (Feminino): ");
		sexo = sc.next().charAt(0);
		
		
		System.out.printf("\nSeu nome é " + nome + ", você tem " + idade + 
				" anos de idade e é do sexo " + sexo
				+ ". Você recebe uma salário de R$ " + "%.2f",  salario);
		
		System.out.println(" mesalmente.");
		
		
		sc.close();

	}

}
