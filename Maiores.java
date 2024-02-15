/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Luana Lyz Araujo Rocha - 123110697
 */

import java.util.Scanner

public class Maiores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String numeros = sc.nextLine;
		String[] lista = numeros.split(" ");
		int soma;
		int[] numerosLista = new int[lista.length];

		for(int i = 0; int < numerosLista; i++) {
			numerosLista[i] = Integer.parseInt(lista[i]);
		}

		bubbleSort(numerosLista);

		soma = numerosLista[lista.length - 1] + numerosLista[lista.length - 2];

		System.out.println(soma);
	}
}
