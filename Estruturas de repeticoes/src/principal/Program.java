package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//usado quando sabemos a quantidade vezes que ira repetir
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(("/****************/"));
		int i = 0;
		//usado quando não sabemos a quantidade de vezes que iremos repetir
		while(i < 10) {
			System.out.println(i);
			i++;
		}
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Deseja continuar? ");
      char opcao = sc.next().charAt(0);
      int j = 0;
      while(opcao == 's') {
    	  j++;
    	  System.out.println("Deseja continuar? ");
         opcao = sc.next().charAt(0);
      }
      System.out.println("Entrou no while:" + j);
      sc.close();
	}
	
	

}
