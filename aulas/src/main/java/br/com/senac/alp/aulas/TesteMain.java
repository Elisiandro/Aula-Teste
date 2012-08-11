package br.com.senac.alp.aulas;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TesteMain 
{

	public TesteMain()
	{
		
	}
	
	public void testeNull()
	{
		PrimeiraAula obj = null;
		
		double[] valores = null;
		double resultado = 0.0;
		double esperado = 0.0;
		
		obj = PrimeiraAula.getInstancia();
		resultado = obj.somaTotal(null);
		esperado = Double.NaN;
		
		if (Double.compare(resultado, esperado)==0)
		{
			System.out.println("Teste com null: OK");
		}
		else
		{
			System.out.println("Teste com null: nOK");
		}
	}
	
	public void testeVazio() 
	{
		/*
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		valores = new double[0];
		resultado = this.obj.somaTotal(valores);
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Quando o argumento for vazio deve retornar " + String.valueOf(esperado) 
				+ ", valor retornando: " + String.valueOf(resultado),
				comparacao, 0);
		*/
	}


	public void testeArrayUnit() 
	{
		/*
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		valores = new double[1];
		valores[0] = Math.random();
		esperado = valores[0];
		resultado = this.obj.somaTotal(valores);
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Esperado valor: " + String.valueOf(esperado) 
				+ ", mas retornado valor: " + String.valueOf(resultado),
				comparacao, 0);
		*/
		
	}
	
	public void testeArgumentoArray() 
	{
		/*
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		valores = new double[10];
		for (int i = 0; i < valores.length; i++) {
			double val = Math.random();
			valores[i] = val;
			esperado += val;
		}
		resultado = this.obj.somaTotal(valores);
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Esperado valor: " + String.valueOf(esperado) 
				+ ", mas retornado valor: " + String.valueOf(resultado)
				+ " array completo: " + Arrays.toString(valores),
				comparacao, 0);
				*/
		
	}
}