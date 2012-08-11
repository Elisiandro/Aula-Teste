package br.com.senac.alp.aulas;

import java.util.Scanner;

public class PrimeiraAula {

	private static PrimeiraAula instancia = new PrimeiraAula();

	public static void main(String[] args) {
		TesteMain a = new TesteMain();
		a.testeNull();
		a.testeArrayUnit();
	}

	private PrimeiraAula() {

		super();
	}

	public double somaTotal(double[] valores) {

		double resultado = 0.0;

		if (valores == null) {
			resultado = Double.NaN;
		} else {
			for (int i = 0; i < valores.length; i++) {
				resultado += valores[i];
			}
		}

		return resultado;
	}

	public static PrimeiraAula getInstancia() {

		return PrimeiraAula.instancia;
	}

	public void imprimeTela() {
		try {
			Scanner in = new Scanner(System.in);
			int valor = 0;
			boolean loop = true;
			while (loop) {
				ImprimeLinhaBrancas();
				valor = in.nextInt();
				if (!(valor < 0 || valor > 4)) {
					loop = false;
				}
			}
			
			switch (valor) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				Sair();
				break;
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Hum... Ocorreu um erro gravissimo, \nPor vafor, verifique o que voce digitou. \nAqui aceito apenas digitos numericos.\nVerifique a legenda.");
		}
	}

	public static void Sair() {
		System.out.print("Sistema terminou!!!");
		System.exit(0);
	}

	public static void ImprimeLinhaBrancas() {
		for (int o = 1; o < 15; o++) {
			System.out.println("\n");
		}

		System.out.println("Escolha as opções abaixo (Apenas NUMEROS ):");
		System.out.println("( 0 )- Sair");
		System.out.println("( 1 )- Calcular um numero par ou impar");
		System.out.println("( 2 )- Calcular o maior numero de 3 numeros");
		System.out.println("( 3 )- Calcular o menor numero de 3 numeros");
		System.out
				.println("( 4 )- Calcular a soma dos numero positivos pares, inferiores ou igual ao informado");
		System.out.println("Digite a opção: ");
	}
}
