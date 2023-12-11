package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	  int numero;
	  int contador;
	  int par = 0;
	  int impar = 0;
	  
	  Scanner leia = new Scanner(System.in);
	  
	  for (contador = 1; contador < 10; contador++) {
          System.out.println("\n Digite o " + contador + "º número: ");
          numero = leia.nextInt();
          
          if(numero %2 == 0) {
        	  par++;
          }else {
        	  impar++;
          } 
          
	  }
	  System.out.println("total de numeros pares:" + par);
	  System.out.println("Total de numeros impares" + impar);
	  
	  
	}}
	


