/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Luana Lyz Araujo Rocha - 123110697
 */

import java.util.Scanner;

public class Wally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes = sc.nextLine();
		String out;
		while (!nomes.equalsIgnoreCase("wally")) {
			out = "?";
			String[] nomeind = nomes.split(" ");
			for (String item: nomeind) {
				if (item.length() == 5) {
					out = item;
				}
			}
			System.out.println(out);
			nomes = sc.nextLine();
		}
		sc.close();
	}
}
