package principal;

import java.util.Scanner; 

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
     Scanner leia = new Scanner (System.in);
     double notaPrimeiroBimestre;
     double notaSegundoBimestre;
     double notaTerceiroBimestre;
     double notaQuartoBimestre;
     
     System.out.println("entre com a nota do primeiro bimestre");
     notaPrimeiroBimestre = leia.nextDouble();
     
     System.out.println("entre com a nota do segundo bimestre");
     notaSegundoBimestre = leia.nextDouble();
     
     System.out.println("entre com a nota do terceiro bimestre");
     notaTerceiroBimestre = leia.nextDouble();
     
     System.out.println("entre com a nota do quarto bimestre");
     notaQuartoBimestre = leia.nextDouble();
     
     System.out.println("a sua média é: " + (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre / 4 ));
     
     leia.close();
     
     
	}

}
