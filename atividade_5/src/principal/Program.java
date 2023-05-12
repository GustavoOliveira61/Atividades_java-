package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leia = new Scanner (System.in);
    
    double valorHora;
    double horasTrabalhadas;
    
    
    System.out.println("informe o valor que você ganha por hora");
    valorHora = leia.nextDouble();
    
    System.out.println("informe quantas horas você trabalha por mês");
    horasTrabalhadas = leia.nextDouble();
    
    System.out.println("seu sálario esse mês é: " + (horasTrabalhadas * valorHora )+ "reais");
    
    leia.close();
    
	}

}
