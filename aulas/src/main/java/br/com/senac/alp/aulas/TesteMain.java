package br.com.senac.alp.aulas;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TesteMain 
{

	private String resultado;
	private PrimeiraAula obj;
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public TesteMain()
	{
		
	}
	
	public void testeNull()
	{
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;
		double resultado = 0.0;
		double esperado = 0.0;
		
		resultado = obj.somaTotal(null);
		esperado = Double.NaN;
		
		if (Double.compare(resultado, esperado)==0)
		{
			this.resultado = "Teste com null: OK";
			//System.out.println("Teste com null: OK");
		}
		else
		{
			this.resultado = "Teste com null: nOK";
			//System.out.println("Teste com null: nOK");
		}
	}
	
	public void testeVazio() 
	{		
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;		
		double esperado = 0.0;		
		double resultado = 0.0;		
		
		//double resultado = 4;
		valores = new double[0];
		
		resultado = obj.somaTotal(valores);
		if (Double.compare(resultado, esperado)==0)
		{
			this.resultado = "Teste Vazio: OK";
			//System.out.println("Vazio: OK");
		}
		else
		{
			this.resultado = "Teste Vazio: nOK";
			//System.out.println("Não esta fazio: nOK");
		}		
	}


	public void testeArrayUnit() 
	{
		obj = PrimeiraAula.getInstancia();

		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		valores = new double[1];
		valores[0] = Math.random();
		esperado = valores[0];
		resultado = obj.somaTotal(valores);
		//comparacao = Double.compare(resultado, esperado);		
		
		if (Double.compare(resultado, esperado)==0)
		{
			this.resultado = "Array Unit: OK";
			//System.out.println("Resulta: OK");
		}
		else
		{
			this.resultado = "Array Unit: nOK";
			//System.out.println("Result: nOK");
		}		
	}
	
	public void testeArgumentoArray() 
	{
		obj = PrimeiraAula.getInstancia();
		double[] valores = null;		
		double esperado = 0.0;
		double resultado = 0.0;
		
		valores = new double[10];
		for (int i = 0; i < valores.length; i++) {
			double val = Math.random();
			valores[i] = val;
			esperado += val;
		}
		resultado = obj.somaTotal(valores);
		
		if (Double.compare(resultado, esperado)==0)
		{
			this.resultado = "Argumento Array: OK";
			//System.out.println("Resulta: OK");
		}
		else
		{
			this.resultado = "Argumento Array: nOK";
			//System.out.println("Result: nOK");
		}		
		
		
	}
}