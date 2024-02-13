import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char op = sc.next().charAt(0);
		float n1, n2, operacao;

		if(op == '+') {
			n1 = sc.nextFloat();
                	n2 = sc.nextFloat();
			operacao = n1 + n2;
			System.out.println("RESULTADO: " + operacao);
		} else if(op == '-') {
			n1 = sc.nextFloat();
                	n2 = sc.nextFloat();
			operacao = n1 - n2;
			System.out.println("RESULTADO: " + operacao);
		} else if(op == '*') {
			n1 = sc.nextFloat();
                	n2 = sc.nextFloat();
			operacao = n1 * n2;
			System.out.println("RESULTADO: " + operacao);
		} else if(op == '/') {
			n1 = sc.nextFloat();
                	n2 = sc.nextFloat();
			if(n2 == 0) {
				System.out.println("ERRO");
			} else {
				operacao = n1 / n2;
				System.out.println("RESULTADO: " + operacao);
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
		sc.close();
	}
}
