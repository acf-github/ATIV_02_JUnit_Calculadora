package com.calculadora.domain;

import java.math.BigDecimal;

import com.calculadora.operation.Calculavel;

public class Calculadora implements Calculavel {

	public int somar(String value1, String value2) {

		isNumberOrError(value1);
		isNumberOrError(value2);

		double num1 = Double.parseDouble(value1);
		double num2 = Double.parseDouble(value2);

		return new Double(num1 + num2).intValue();
	}

	public double dividir(String value1, String value2) {

		isNumberOrError(value1);
		isNumberOrError(value2);

		BigDecimal num1 = new BigDecimal(value1);
		BigDecimal num2 = new BigDecimal(value2);

		return num1.divide(num2).doubleValue();
	}

	public double raizQuadrada(String value) {

		isNumberOrError(value);

		double num = Double.parseDouble(value);

		return Math.sqrt(num);
	}

	public void isNumberOrError(String value) {
		if (!isNumeric(value)) {
			throw new RuntimeException("O valor inserido {" + value
					+ "} nao e um numero");
		}
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
