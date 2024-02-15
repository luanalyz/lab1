/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Luana Lyz Araujo Rocha - 123110697
 */


import java.util.Scanner;

public class Advinha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroParaAdvinhar = sc.nextInt();
		int numeroTeste = sc.nextInt();
		do {
			if(numeroTeste == numeroParaAdvinhar) {
				System.out.println("ACERTOU");
				break;
			} else if(numeroTeste > numeroParaAdvinhar) {
				System.out.println("MAIOR");
			} else if(numeroTeste < numeroParaAdvinhar) {
				System.out.println("MENOR");
			}
			numeroTeste = sc.nextInt();
		} while(true);
	}
}
