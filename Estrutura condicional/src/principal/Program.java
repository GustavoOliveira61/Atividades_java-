package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 10;
		int numero2 = 25;
		boolean verdadeiro = false;
		
		if(numero1 >= numero2) {
         System.out.println("numero1 é o maior");
	}

		else {
			System.out.println("Numero2 é o maior");
		}
		
		if(verdadeiro == true) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		
		//Exenplo usando resto de divisão
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com um numero para saber se é par ou impar");
		numero = leia.nextInt();
		
		if (numero % 2== 0) {
			System.out.println("numero par!");
		}
		else {
			System.out.println("numero impar!");
		}
		
		
		leia.close();
} }
