package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//uma constante e quando seu valor n�o muda 
      final double PI = 3.1415;
      int valor1 = 50;
      int valor2 = 65;
      
      //realiza a potencia
      System.out.println(Math.pow(2 , 2));
      
      //passgem de 2 numeros como parametro
      //retorna o maior deles 
      System.out.println(Math.max(valor1 , valor2 ));
      
      //e o inverso do max, pega o minimo
      System.out.println(Math.min(5, 20));
      
      //retorna a raiz quadrada de um numero
      System.out.println(Math.sqrt(18));
      
      //arredonda o numero (para mais ou para menos)
      System.out.println(Math.round(25.6578));
      
      //podemos realizar calculos com valores
      //retornados pelo calculo de Math
      System.out.println(2 + Math.sqrt(18));
      
      Scanner leia = new Scanner(System.in);
      Locale ponto = new Locale("en", "us");
      
      //System.out.println("entre com o valor do dolar: ");
      //double dolar = leia.useLocale(ponto).nextDouble();
      
      //System.out.println("valor dolar digitado: " + dolar);
      
      String nome = "Gustavo Henrique";
      char sexo = 'M';
      int idade = 25;
      double altura = 1.833338414;
      
      System.out.printf("o meu nome � %s, sou do sexo %c,teno %d anos, minha altura �: %.2f", nome, sexo, idade, altura);
      
      /*
       * operadores de conpara��o
       * > maior que 
       * < menor que 
       * >= maior ou igual a 
       * <= menor ou igual a
       * != diferente de 
       * == igual a 
       */
      
      /*
       * operadores l�gicos 
       * && = e
       * || = ou 
       * ! = nega��o
       */
      
      leia.close();
      
	}

}
