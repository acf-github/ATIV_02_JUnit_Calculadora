package com.calculadora.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.calculadora.domain.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	private String numStr1;
	private String numStr2;
	
	@Before
	public void before(){
		this.calculadora = new Calculadora();
		this.numStr1 = "4";
		this.numStr2 = "2";
	}
	
	@After
	public void after(){
//		do something
	}
	
	@Test
	public void soma() {
		
		int resultado = calculadora.somar(numStr1, numStr2);
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	public void soma2() {
		
		int resultado = calculadora.somar("65", "78.9");
		Assert.assertEquals(143, resultado);
	}
	
	@Test
	public void divide() {
		
		double resultado = calculadora.dividir(numStr1, numStr2);
		Assert.assertEquals(2.0, resultado);
	}
	
	@Test
	public void divideFracao() {
		
		double resultado = calculadora.dividir("15", "2");
		Assert.assertEquals(7.5, resultado);
	}

	@Test
	public void raizQuadrada() {
		
		double resultado = calculadora.raizQuadrada(numStr1);
		Assert.assertEquals(2.0, resultado);
	}

}

