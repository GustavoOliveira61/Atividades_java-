package principal;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("insira o primeiro numero");
		num1 = leia.nextInt();
		
		System.out.println("insira o segundo numero");
		num2 = leia.nextInt();
		
		System.out.println("a soma é: " + (num1 + num2));
		
		leia.close();
		
		
	}

}
