/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Luana Lyz Araujo Rocha - 123110697
 */

import java.util.Scanner;

public class Prof {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
		
		int nota, soma, maior, menor, media, acima, abaixo;
		soma = 0;
		acima = 0;
		abaixo = 0;
		maior = -1;
		menor = 1001;
		String nomeNota = sc.nextLine();
		
		while(!nomeNota.equalsIgnoreCase("-")) {
			String nomeNotaSeparado[] = nomeNota.split(" ");
			nota = Integer.parseInt(nomeNotaSeparado[1]);
			soma += nota;
			
			if(nota >= 700) {
				acima++;
			} else {
				abaixo++;
			}
			
			if(nota <= menor) {
				menor = nota;
			}
			if(nota >= maior) {
				maior = nota;
			}

			nomeNota = sc.nextLine();
		}
		media = soma / (acima + abaixo);

		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);

	}
}
