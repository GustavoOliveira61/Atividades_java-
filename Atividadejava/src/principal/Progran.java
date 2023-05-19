package principal;

import java.util.Scanner;

public class Progran {

   public static void main (String[] args) {
	   Scanner sr = new Scanner (System.in);
	   
	   int num1;
	   int num2;
	   int num3;
	   
	   System.out.println("entre com o primeiro numero");
	   num1 = sr.nextInt();
	   
	   System.out.println("entre com o segundo numero");
	   num2 = sr.nextInt();
	   
	   System.out.println("entre com o terceiro numero");
	   num3 = sr.nextInt();
	   
	   if(num1 > num2 && num1 > num3) {
		   System.out.println("o maior numero é: " + num1);
		   
	   }
	   else if (num2 > num3) {
		   System.out.println(" o maior numero é:" + num2);
		    }
	   else {
		   //System.out.println("o maior numero é:" + num3);
{
	   
	   sr.close();
	   
   }
   
    }

     