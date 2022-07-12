package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtração = subtração(a,b);
		int multiplicação = multiplicação(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("soma" + soma);
		System.out.println("subtração" + subtração);
		System.out.println("multiplicação" + multiplicação);
		System.out.println("divisao" + divisao);
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtração(int a, int b) {
		return a - b;
	}
	public static int multiplicação(int a, int b) {
		return a * b;
	}
	
	public static int divisao(int a, int b) {
	    return a / b;
	}
}
