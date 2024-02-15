/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Luana Lyz Araujo Rocha - 123110697
 */


import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String meses, valores, mesBusca;
		String[] mesesLista, valoresLista;

		meses = sc.nextLine();
		valores = sc.nextLine();
		mesesLista = meses.split(" ");
		valoresLista = valores.split(" ");
		
		mesBusca = sc.nextLine();

		for (int i = 0; i < mesesLista.length; i++) {
			if(mesesLista[i].equals(mesBusca)) {
				System.out.println(valoresLista[i]);
				break;
			}
		}
	}
}
