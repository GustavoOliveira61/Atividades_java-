package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leia = new Scanner (System.in);
    
    double valorHora;
    double horasTrabalhadas;
    
    
    System.out.println("informe o valor que voc� ganha por hora");
    valorHora = leia.nextDouble();
    
    System.out.println("informe quantas horas voc� trabalha por m�s");
    horasTrabalhadas = leia.nextDouble();
    
    System.out.println("seu s�lario esse m�s �: " + (horasTrabalhadas * valorHora )+ "reais");
    
    leia.close();
    
	}

}
