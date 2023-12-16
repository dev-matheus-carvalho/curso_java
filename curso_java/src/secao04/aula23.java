package secao04;

import java.util.Locale;

public class aula23 {

	public static void main(String[] args) {
		
		// Saídas no Java
		
		System.out.print("Olá mundo"); // Não pula a linha e faz a concatenação
		System.out.println("Sou outra saída"); // Pula a linha
		
		
		//============================ Números inteiros ==========================================
		
		int idade = 27;
		
		int anoAtual = 2023;
		int anoNascimento = 1996;
		
		int idadeAtual = anoAtual - anoNascimento;
		
		System.out.println("Sua idade digitada foi: " + idade);
		System.out.println("Sua idade atual é: " + idadeAtual);
		
		//=========================== Números flutuantes ==========================================
		
		Locale.setDefault(Locale.US); // transforma os numeros decimais com o ponto ao invés da vírgula
		
		double salario = 1777.50;
		
		double contas = 1378.92;
		
		double salarioLiquido = salario - contas;
		
		System.out.println("Seu salário bruto é de: " + salario);
		System.out.println("Sua despesa mensal é: " + contas);
		System.out.printf("Seu salário líquido é de: " + "%.2f\n", salarioLiquido); // Formatar as casas decimais

		String nome = "Matheus Luan";
		System.out.println("Seu nome é: " + nome);
		
		
		//================================ Exercício de fixação ======================================
		
		System.out.println();
		System.out.println("======================= Exercício =====================================");
		System.out.println();
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double meansure = 53.234567;
		
		System.out.println("Products:");
		
		System.out.printf(product1 + ", which price is $ " + "%.2f\n",  prince1);
		System.out.printf(product2 + ", which price is $ " + "%.2f\n\n", prince2);
		
		System.out.printf("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n\n");
		
		System.out.println("Measue with eight deciamal places: " + meansure);
		
		Locale.setDefault(Locale.FRENCH);
		System.out.printf("Rouded (three decimal places): " + "%.3f\n",  meansure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: " + "%.3f",  meansure);
	}

}
