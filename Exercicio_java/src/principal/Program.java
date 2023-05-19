package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random randon = new Random();
		
		int num1 = randon.nextInt(6) + 1; 
		int num2 = randon.nextInt(6) + 1;
		int num3 = randon.nextInt(6) + 1;
		
		System.out.println(num1 + num2 + num3);
		
		if (num1 == num2) {
			System.out.println("voce ganhou pnts bonús !!");
		}
      if (num2 == num3) {
		System.out.println("voce ganhou pnts bonús !!");
	}
      else if (num1 == num2 ||num2 == num3){
    	  System.out.println("Voce e muito sortudo");
      }
      else  {
		
		System.out.println("Lamento, mas você perdeu");
	}
}

}
