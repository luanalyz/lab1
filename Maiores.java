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
		int soma, primeiroMaior, segundoMaior, posicao, iterador;
                int[] numerosLista = new int[lista.length];
                iterador = -1;
                posicao = 0;
                for(int i = 0; i < numerosLista.length; i++) {
                        numerosLista[i] = Integer.parseInt(lista[i]);
                }

                primeiroMaior = 0;
                segundoMaior = 0;

                for(int item: numerosLista) {
                        iterador++;
                        if (item > primeiroMaior) {
                                primeiroMaior = item;
                                posicao = iterador;
                        }
                }

                numerosLista[posicao] = 0;

                for(int item:numerosLista) {
                        if (item > segundoMaior) {
                                segundoMaior = item;
                        }
                }

                soma = primeiroMaior + segundoMaior;

                System.out.println(soma);
        }
}
