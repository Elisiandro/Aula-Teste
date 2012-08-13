package br.com.senac.alp.aulas;

import java.util.Scanner;

public class PrimeiraAula 
{
	private static PrimeiraAula instancia = new PrimeiraAula();

	public static void main(String[] args) 
	{
		imprimeTela();
	}

	private PrimeiraAula() 
	{

		super();
	}

	public double somaTotal(double[] valores) 
	{

		double resultado = 0.0;

		if (valores == null) 
		{
			resultado = Double.NaN;
		} else {
			for (int i = 0; i < valores.length; i++) 
			{
				resultado += valores[i];
			}
		}

		return resultado;
	}

	public static PrimeiraAula getInstancia() 
	{

		return PrimeiraAula.instancia;
	}

	public static void imprimeTela() 
	{		
		try 
		{
			Scanner in = new Scanner(System.in);
			int valor = 0;
			boolean loop = true;
			while (loop) {
				ImprimeLinhaBrancas();
				valor = in.nextInt();
				if (!(valor < 1 || valor > 5)) {
					loop = false;
				}
			}
			
			TesteMain obj = new TesteMain();
			
			switch (valor) {
			case 1:
				obj.testeNull();
				System.out.println(obj.getResultado());
				break;
			case 2:
				obj.testeVazio();
				System.out.println(obj.getResultado());
				break;
			case 3:
				obj.testeArrayUnit();
				System.out.println(obj.getResultado());
				break;
			case 4:
				obj.testeArgumentoArray();
				System.out.println(obj.getResultado());
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
		for (int o = 1; o < 15; o++) 
		{
			System.out.println("\n");
		}

		System.out.println("Escolha as opções abaixo (Apenas NUMEROS ):");
		System.out.println("( 1 )- Argumento Nulo");
		System.out.println("( 2 )- Argumento Vazio");
		System.out.println("( 3 )- Array Unitario");
		System.out.println("( 4 )- Argumento Array");
		System.out.println("( 5 )- Sair");
		
		System.out.println("Digite a opção: ");
	}
}
